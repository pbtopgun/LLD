package com.example.bms.bms23.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> movieFeatures;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Genre> genre;
}