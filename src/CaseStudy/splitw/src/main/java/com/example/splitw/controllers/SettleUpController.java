package com.example.splitw.controllers;

import com.example.splitw.dtos.SettleUpGroupRequestDto;
import com.example.splitw.dtos.SettleUpGroupResponseDto;
import com.example.splitw.dtos.SettleUpUserRequestDto;
import com.example.splitw.services.settleup.SettleUpService;
import com.example.splitw.services.settleup.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    @Autowired
    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService=settleUpService;
    }


    public void settleUser(SettleUpUserRequestDto request) {


    }


    public SettleUpGroupResponseDto settleGroup(SettleUpGroupRequestDto settleUpGroupRequestDto) {
            List<Transaction> transactionList =
                    settleUpService.settleUpGroup(settleUpGroupRequestDto.getGroupId(),null,
                            settleUpGroupRequestDto.getUserId());

        SettleUpGroupResponseDto settleUpGroupResponseDto = new SettleUpGroupResponseDto();
        settleUpGroupResponseDto.setTransactions(transactionList);
        return settleUpGroupResponseDto;
    }
}

