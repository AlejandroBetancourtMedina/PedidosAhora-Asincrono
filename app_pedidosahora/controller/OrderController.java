package com.pedidosahora.app_pedidosahora.controller;

import com.pedidosahora.app_pedidosahora.entity.Order;
import com.pedidosahora.app_pedidosahora.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


// Controla las solicitudes HTTP a traves de RESTfull
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}
