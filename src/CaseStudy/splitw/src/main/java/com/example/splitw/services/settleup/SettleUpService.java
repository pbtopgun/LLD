package com.example.splitw.services.settleup;

import com.example.splitw.models.Expense;
import com.example.splitw.models.ExpenseOwingUser;
import com.example.splitw.models.ExpensePayingUser;
import com.example.splitw.models.Group;
import com.example.splitw.repositories.ExpenseOwingUserRepository;
import com.example.splitw.repositories.ExpensePayingUserRepository;
import com.example.splitw.repositories.GroupRepository;
import com.example.splitw.services.settleup.Transaction;
import com.example.splitw.services.settleup.strategies.SettleUpTransactionsCalculatorStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SettleUpService {
    @Autowired
    @Qualifier("giveToNextSettleUpStrategy")
    private SettleUpTransactionsCalculatorStrategy settleUpTransactionsCalculatorStrategy;

    @Autowired
    private SettleUpTransactionsCalculatorStrategy minMaxSettleUpStrategy;
    private GroupRepository groupRepository;
    private ExpenseOwingUserRepository expenseOwingUserRepository;
    private ExpensePayingUserRepository expensePayingUserRepository;

    @Autowired
    public SettleUpService(SettleUpTransactionsCalculatorStrategy settleUpTransactionsCalculatorStrategy) {
        this.settleUpTransactionsCalculatorStrategy = settleUpTransactionsCalculatorStrategy;
    }

    public List<Transaction> settleUpUser(Long userId) {
        return null;
    }

    public List<Transaction> settleUpGroup(Long groupId, String method, Long userId) {

        // Algo:
        // settleUp(group_id) {
        //    1. Get all epu and eou for the group
        //    2. Do calculation to compute the transaction
        // }

        Optional<Group> groupOptional = groupRepository.findById(groupId);

        if (!groupOptional.isPresent()) {
            // throw some exception
            System.out.println("No group with that id");
        }

        Group group = groupOptional.get();

        //Add checks for userId..
        //1. Check for valid user, Using UserRepository
        //2. Check if user is part of the group!!, Group has List of participants


        List<ExpensePayingUser> expensePayingUsers = new ArrayList<>();
        List<ExpenseOwingUser> expenseOwingUsers = new ArrayList<>();

        for (Expense expense: group.getExpenses()) {
            expensePayingUsers.addAll(expensePayingUserRepository.findAllByExpense(expense));
            expenseOwingUsers.addAll(expenseOwingUserRepository.findAllByExpense(expense));
        }

        if (method == "minMax") {
            return minMaxSettleUpStrategy.getTransactions(
                    expensePayingUsers,
                    expenseOwingUsers
            );
        }

        return settleUpTransactionsCalculatorStrategy.getTransactions(
                expensePayingUsers,
                expenseOwingUsers
        );
    }
}
