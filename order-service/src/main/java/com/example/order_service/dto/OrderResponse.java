package com.example.order_service.dto;


import com.example.order_service.model.OrderStatus;

import java.time.OffsetDateTime;
import java.util.UUID;

public class OrderResponse {
    private UUID id;
    private UUID userId;
    private UUID productId;
    private Integer quantity;
    private OrderStatus status;
    private OffsetDateTime createdAt;

    public OrderResponse() {}

    public OrderResponse(UUID id, UUID userId, UUID productId, Integer quantity,
                         OrderStatus status, OffsetDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
        this.createdAt = createdAt;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }

    public UUID getProductId() { return productId; }
    public void setProductId(UUID productId) { this.productId = productId; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
}
