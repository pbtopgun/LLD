package com.example.bms.bms23.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    private double price;

    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
