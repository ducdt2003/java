package com.example.Inventory.Service.controller;

import com.example.Inventory.Service.entity.ProductEvent;
import com.example.Inventory.Service.service.InventoryProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryProducer producer;

    @PostMapping
    public String send(@RequestBody ProductEvent event) {
        producer.send(event);
        return "Sent message to Kafka + RabbitMQ";
    }
}