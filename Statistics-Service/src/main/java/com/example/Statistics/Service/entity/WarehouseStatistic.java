package com.example.Statistics.Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "warehouse_statistics")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String warehouseCode;

    private Integer totalQuantity;

    private LocalDate statisticDate;
}