package com.example.kodillajms.controller;

import com.example.kodillajms.domain.Order;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    private final JmsTemplate jmsTemplate;

    public PhoneController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostMapping("/order")
    public void orderPhone(@RequestBody Order order) {
        jmsTemplate.convertAndSend("order-queue", order);
    }
}
