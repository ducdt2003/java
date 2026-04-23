package com.example.Inventory.Service.service;

import com.example.Inventory.Service.entity.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitProducerService {

    private final RabbitTemplate rabbitTemplate;

    public void send(ProductEvent event) {
        rabbitTemplate.convertAndSend(
                "inventory.exchange",
                "inventory.routing",
                event
        );
    }
}