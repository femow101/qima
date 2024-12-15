package com.qima.store.modules.product.helper;

import com.qima.store.modules.category.model.Category;
import com.qima.store.modules.product.model.Product;

import java.util.Collections;

public class ProductHelper {

    public static Product generateProduct() {
        return Product.builder()
            .id(1L)
            .name("PRODUCT 1")
            .description("DESCR 1")
            .price(1.2)
            .category(new Category(1L, "path", Collections.emptyList()))
            .quantity(10)
            .build();
    }
}
