package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.core.GenericService;
import com.hulkStore.inventario.modules.kardex.model.Inventory;
import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService extends GenericService<Inventory> {
    @Autowired
    private ProductRepository productRepository;

}
