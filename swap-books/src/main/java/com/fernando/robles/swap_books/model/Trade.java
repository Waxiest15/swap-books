package com.fernando.robles.swap_books.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Trade {
    //min trade -> 1 max trade -> 5
    private Long id;
    private List<Long> bookOfferedId;
    private List<Long> bookRequestedId;
    private Long userOfferedId;
    private Long userRequestedId;
    private String status; //possible object
    //timestamps
    //acceptance from both

    @Entity
    @Data
    class TradeMessages {
        private Long id;
        private Long tradeId;
        private Long senderId;
        private String message;
        //timestamps
    }
}
