package com.qima.store.modules.product.controller;

import com.qima.store.modules.product.service.ProductService;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    private static final String ENDPOINT = "/api/products";

    @Autowired
    private MockMvc mvc;
    @MockitoBean
    private ProductService service;

    @Test
    @SneakyThrows
    void getProductById_shouldReturn200_whenTheProductExists() {
        mvc.perform(get(ENDPOINT.concat("/1")))
            .andExpect(status().isOk());
        verify(service).getProductResponseByProductId(1L);
    }
}
