package com.example.bms.bms23.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Actor extends BaseModel {
    private String name;
}
