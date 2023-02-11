package com.example.splitw.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Currency extends BaseModel {
    private String name;
}
