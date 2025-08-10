package com.example.order_service.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class CreateOrderRequest {

    @NotNull
    private UUID userId;

    @NotNull
    private UUID productId;

    @NotNull
    @Min(1)
    private Integer quantity;

    public CreateOrderRequest() {}

    public CreateOrderRequest(UUID userId, UUID productId, Integer quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }

    public UUID getProductId() { return productId; }
    public void setProductId(UUID productId) { this.productId = productId; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
