package com.example.Statistics.Service.service;

import com.example.Statistics.Service.dto.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final StatisticService service;

    @KafkaListener(topics = "inventory-topic", groupId = "stat-group")
    public void listen(ProductEvent event) {
        service.process(event);
    }
}