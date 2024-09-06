package com.pedidosahora.app_pedidosahora.service;

import com.pedidosahora.app_pedidosahora.entity.Order;
import com.pedidosahora.app_pedidosahora.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private JmsTemplate jmsTemplate;

    public Order saveOrder(Order order) {
        Order savedOrder = orderRepository.save(order);
        return savedOrder;
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}
