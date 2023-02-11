package com.example.splitw.models;

import com.example.splitw.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Expense extends BaseModel {
    private double amount;
    @ManyToOne
    private User createdBy;
    private String description;
    private Date createdAt;
    @ManyToOne
    private Currency baseCurrency;
    @ManyToMany
    private List<User> participants;
}
