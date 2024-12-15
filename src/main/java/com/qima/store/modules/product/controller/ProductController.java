package com.qima.store.modules.product.controller;

import com.qima.store.modules.product.dto.ProductResponse;
import com.qima.store.modules.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("{id}")
    public ProductResponse getProductById(@PathVariable Long id) {
        return service.getProductResponseByProductId(id);
    }
}
