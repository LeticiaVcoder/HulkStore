package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.services.BuysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BuysController {
    @Autowired
    private BuysService buysService;

    @GetMapping("/buys")
    public  List<Buys> listBuys(){
        return (List<Buys>) buysService.listAll();
    }
}
