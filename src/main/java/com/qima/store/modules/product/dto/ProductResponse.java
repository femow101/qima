package com.qima.store.modules.product.dto;

public record ProductResponse(
    Long id,
    String name,
    String description,
    Double price,
    String categoryPath,
    boolean available
) {
}
