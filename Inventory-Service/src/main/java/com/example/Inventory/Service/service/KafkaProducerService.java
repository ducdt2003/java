package com.example.Inventory.Service.service;

import com.example.Inventory.Service.entity.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, ProductEvent> kafkaTemplate;

    public void send(ProductEvent event) {
        kafkaTemplate.send("inventory-topic", event);
    }
}