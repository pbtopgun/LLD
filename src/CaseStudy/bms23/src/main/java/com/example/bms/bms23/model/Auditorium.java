package com.example.bms.bms23.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private String name;

    @OneToMany
    private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> auditoriumFeatures;
}


/// Audi to Seat