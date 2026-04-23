package com.example.Inventory.Service.service;

import com.example.Inventory.Service.entity.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryProducer {

    private final KafkaProducerService kafka;
    private final RabbitProducerService rabbit;

    public void send(ProductEvent event) {
        kafka.send(event);
        rabbit.send(event);
    }
}