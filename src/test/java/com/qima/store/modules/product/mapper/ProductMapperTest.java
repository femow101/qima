package com.qima.store.modules.product.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import com.qima.store.modules.product.dto.ProductResponse;
import com.qima.store.modules.product.helper.ProductHelper;
import org.junit.jupiter.api.Test;

class ProductMapperTest {

    @Test
    void of_shouldConvertModelToResponse() {
        assertThat(ProductMapper.of(ProductHelper.generateProduct()))
            .extracting(
                ProductResponse::id,
                ProductResponse::name,
                ProductResponse::description,
                ProductResponse::price,
                ProductResponse::categoryPath,
                ProductResponse::available)
            .containsExactly(
                1L,
                "PRODUCT 1",
                "DESCR 1",
                1.2,
                "path",
                true);
    }
}
