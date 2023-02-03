package com.example.bms.bms23.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{

    private String name;
    private String address;

    @ManyToOne
    private City city;

    @OneToMany
    private List<Auditorium> auditoriums;
}


//Theatre and Audi   1:M,   1:1  (1:M)

//City and Theatre!!