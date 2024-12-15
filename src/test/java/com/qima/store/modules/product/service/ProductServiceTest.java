package com.qima.store.modules.product.service;

import com.qima.store.modules.product.dto.ProductResponse;
import com.qima.store.modules.product.helper.ProductHelper;
import com.qima.store.modules.product.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService service;

    @Mock
    private ProductRepository repository;

    @Test
    void getProductResponseByProductId_shouldThrowException_whenProductDoesntExist() {
        assertThatThrownBy(() -> service.getProductResponseByProductId(1L))
            .isInstanceOf(EntityNotFoundException.class)
            .hasMessage("Product not found.");
    }

    @Test
    void getProductResponseByProductId_shouldReturnResponse_whenProductExists() {
        when(repository.findById(1L)).thenReturn(Optional.of(ProductHelper.generateProduct()));

        assertThat(service.getProductResponseByProductId(1L))
            .isNotNull()
            .isInstanceOf(ProductResponse.class);
    }
}
