package com.tharaka.product_service.service;

import com.tharaka.product_service.dto.ProductRequestDto;
import com.tharaka.product_service.dto.ProductResponseDto;
import com.tharaka.product_service.repository.ProductRepository;
import com.tharaka.product_service.util.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper productMapper;

    public ProductResponseDto createProduct(ProductRequestDto productRequestDto) {
        var product = productMapper.fromRequestDtoToProduct(productRequestDto);
        repository.save(product);
        log.info("Created product: {}", product);
        return productMapper.fromProductToResponseDto(product);
    }

    public List<ProductResponseDto> getAllProducts() {
        return repository.findAll().stream().map(productMapper::fromProductToResponseDto).toList();
    }
}
