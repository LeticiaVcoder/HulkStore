package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService  {
    @Autowired
    private ProductRepository productRepository;

}
