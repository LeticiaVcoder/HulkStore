package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.modules.kardex.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static java.nio.file.Paths.get;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

@WebMvcTest(ProductController.class)
class ProductControllerTest {
   @Autowired
   private MockMvc mockMvc;
   @MockBean
   private ProductService productService;


    @Test
    void saveProduct() {

    }



}