package com.example.spring6restmvc.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;
import java.math.BigDecimal;
@Data
public class Beer {
    private UUID id;
    private Integer version;
    private String beerName;
    private String beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
