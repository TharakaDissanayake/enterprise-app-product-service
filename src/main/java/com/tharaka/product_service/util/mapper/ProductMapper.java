package com.tharaka.product_service.util.mapper;

import com.tharaka.product_service.dto.ProductRequestDto;
import com.tharaka.product_service.dto.ProductResponseDto;
import com.tharaka.product_service.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product fromRequestDtoToProduct(ProductRequestDto dto) {
        return Product.builder()
                .id(dto.id())
                .description(dto.description())
                .name(dto.name())
                .price(dto.price())
                .build();
    }

    public ProductResponseDto fromProductToResponseDto(Product product) {
        return ProductResponseDto.builder()
                .id(product.getId())
                .description(product.getDescription())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
