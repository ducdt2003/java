package com.example.Statistics.Service.service;

import com.example.Statistics.Service.dto.ProductEvent;
import com.example.Statistics.Service.entity.WarehouseStatistic;
import com.example.Statistics.Service.repository.WarehouseStatisticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class StatisticService {

    private final WarehouseStatisticRepository repo;

    public void process(ProductEvent event) {

        WarehouseStatistic stat = new WarehouseStatistic();
        stat.setWarehouseCode(event.getWarehouseCode());
        stat.setTotalQuantity(event.getQuantity());
        stat.setStatisticDate(LocalDate.now());

        repo.save(stat);
    }
}