package com.tharaka.product_service.dto;

import java.math.BigDecimal;

public record ProductRequestDto(
        String id,
        String name,
        String description,
        BigDecimal price
) {
}
