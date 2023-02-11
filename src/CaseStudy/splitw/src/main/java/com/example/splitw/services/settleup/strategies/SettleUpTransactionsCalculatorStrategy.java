package com.example.splitw.services.settleup.strategies;

import com.example.splitw.models.ExpenseOwingUser;
import com.example.splitw.models.ExpensePayingUser;
import com.example.splitw.services.settleup.Transaction;

import java.util.List;

public interface SettleUpTransactionsCalculatorStrategy {

    List<Transaction> getTransactions(List<ExpensePayingUser> expensePayingUsers,
                                      List<ExpenseOwingUser> expenseOwingUsers);
}
