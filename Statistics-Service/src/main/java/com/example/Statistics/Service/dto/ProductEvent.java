package com.example.Statistics.Service.dto;

import lombok.Data;

@Data
public class ProductEvent {
    private String warehouseCode;
    private String productCode;
    private int quantity;
}