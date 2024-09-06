package com.pedidosahora.app_pedidosahora.entity;

import jakarta.persistence.*;

// Clases que representan entidades y atributos para almacenar informacion en base de datos
@Entity
@Table(name = "pedido") // Cambia 'pedido' por el nombre que desees
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    // Constructor vacío necesario para JPA
    public Order() {
    }

    // Constructor con parámetros
    public Order(String description) {
        this.description = description;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}