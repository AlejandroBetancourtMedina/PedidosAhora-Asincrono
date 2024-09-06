package com.pedidosahora.app_pedidosahora.listener;

import com.pedidosahora.app_pedidosahora.adapter.MessageAdapter;
import com.pedidosahora.app_pedidosahora.entity.Order;
import com.pedidosahora.app_pedidosahora.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


// Escuchando mensaje
@Component
public class OrderMessageListener {

    @Autowired
    private OrderService orderService;

    @Autowired
    private MessageAdapter messageAdapter;

    @JmsListener(destination = "queue.companyA")
    public void receiveMessageFromCompanyA(String rawMessage) {
        if (isValidMessage(rawMessage)) {
            Order order = messageAdapter.adaptMessage(rawMessage);
            orderService.saveOrder(order);
        }
    }

    @JmsListener(destination = "queue.companyB")
    public void receiveMessageFromCompanyB(String rawMessage) {
        if (isValidMessage(rawMessage)) {
            Order order = messageAdapter.adaptMessage(rawMessage);
            orderService.saveOrder(order);
        }
    }

    private boolean isValidMessage(String message) {
        // Implementa la lógica para filtrar mensajes no deseados
        return !message.contains("INVALID");
    }
}
