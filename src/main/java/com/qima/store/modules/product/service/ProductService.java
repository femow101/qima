package com.qima.store.modules.product.service;

import com.qima.store.modules.product.dto.ProductResponse;
import com.qima.store.modules.product.mapper.ProductMapper;
import com.qima.store.modules.product.model.Product;
import com.qima.store.modules.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private static final String ERR_PRODUCT_NOT_FOUND = "Product not found.";

    private final ProductRepository repository;

    public ProductResponse getProductResponseByProductId(Long id) {
        return ProductMapper.of(this.getById(id));
    }

    private Product getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException(ERR_PRODUCT_NOT_FOUND));
    }
}
