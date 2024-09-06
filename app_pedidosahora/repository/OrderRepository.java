package com.pedidosahora.app_pedidosahora.repository;

import com.pedidosahora.app_pedidosahora.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
