package com.qima.store.modules.product.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {

    @Test
    void isAvailable_shouldReturnTrue_whenQuantityIsBiggerThanZero() {
        assertThat(Product.builder().quantity(1).build().isAvailable()).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = { 0, -1 })
    void isAvailable_shouldReturnFalse_whenIsZeroOrNegative(Integer quantity) {
        assertThat(Product.builder().quantity(quantity).build().isAvailable()).isFalse();
    }
}
