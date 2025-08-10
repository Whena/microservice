package com.example.order_service.service;

import com.example.order_service.dto.CreateOrderRequest;
import com.example.order_service.dto.OrderResponse;
import com.example.order_service.model.Order;
import com.example.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    // Constructor injection (tanpa Lombok)
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Transactional
    public OrderResponse create(CreateOrderRequest req) {
        Order toSave = new Order(req.getUserId(), req.getProductId(), req.getQuantity());
        Order saved = orderRepository.save(toSave);
        return new OrderResponse(
                saved.getId(),
                saved.getUserId(),
                saved.getProductId(),
                saved.getQuantity(),
                saved.getStatus(),
                saved.getCreatedAt()
        );
    }
}
