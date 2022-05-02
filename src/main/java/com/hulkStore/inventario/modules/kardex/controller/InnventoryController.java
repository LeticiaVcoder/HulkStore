package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.modules.kardex.model.Inventory;
import com.hulkStore.inventario.modules.kardex.model.Sales;
import com.hulkStore.inventario.modules.kardex.services.InventoryService;
import com.hulkStore.inventario.modules.kardex.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InnventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/inventory")
    public  List<Inventory> listInventory(){
        return (List<Inventory>) inventoryService.listAll();
    }
}
