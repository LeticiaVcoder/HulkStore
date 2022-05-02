package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Sales;
import com.hulkStore.inventario.modules.kardex.services.BuysService;
import com.hulkStore.inventario.modules.kardex.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/sales")
    public  List<Sales> listSales(){
        return (List<Sales>) salesService.listAll();
    }
}
