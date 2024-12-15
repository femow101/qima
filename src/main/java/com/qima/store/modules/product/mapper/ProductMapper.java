package com.qima.store.modules.product.mapper;

import com.qima.store.modules.product.dto.ProductResponse;
import com.qima.store.modules.product.model.Product;

public class ProductMapper {

    public static ProductResponse of(Product product) {
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCategory().getPath(),
            product.isAvailable());
    }
}
