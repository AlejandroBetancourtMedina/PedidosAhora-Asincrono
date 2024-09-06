package com.pedidosahora.app_pedidosahora.adapter;

import org.springframework.stereotype.Component;
import com.pedidosahora.app_pedidosahora.entity.Order;

//Transformacion del mensaje proveniente de Order
@Component
public class MessageAdapter {

    public Order adaptMessage(String rawMessage) {

        return new Order(rawMessage);
    }
}

