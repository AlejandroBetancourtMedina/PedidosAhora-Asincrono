package com.pedidosahora.app_pedidosahora.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Queue;


// Aplicacion de la libreria Jms de Java para mensajeria asincrona.
@Configuration
public class JmsConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        return new org.apache.activemq.ActiveMQConnectionFactory("tcp://localhost:61616");
    }

    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        jmsTemplate.setDefaultDestinationName("queue.orders");
        return jmsTemplate;
    }

    @Bean
    public Queue queueCompanyA() {
        return new ActiveMQQueue("queue.companyA");
    }

    @Bean
    public Queue queueCompanyB() {
        return new ActiveMQQueue("queue.companyB");
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrency("5-10");
        return factory;
    }
}
