package com.example.Statistics.Service.service;

import com.example.Statistics.Service.dto.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitConsumer {

    private final StatisticService service;

    @RabbitListener(queues = "inventory.queue")
    public void receive(ProductEvent event) {
        service.process(event);
    }
}
