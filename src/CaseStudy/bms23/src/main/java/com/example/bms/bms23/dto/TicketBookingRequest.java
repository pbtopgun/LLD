package com.example.bms.bms23.dto;

import com.example.bms.bms23.model.Seat;
import com.example.bms.bms23.model.Show;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@Getter
@Setter
public class TicketBookingRequest {
    private List<Long> showSeatIds;
    private Long showId;
}
