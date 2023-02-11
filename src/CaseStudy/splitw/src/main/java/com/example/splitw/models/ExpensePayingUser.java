package com.example.splitw.models;

import com.example.splitw.models.BaseModel;
import com.example.splitw.models.Expense;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpensePayingUser extends BaseModel {
    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private double amount;
}
