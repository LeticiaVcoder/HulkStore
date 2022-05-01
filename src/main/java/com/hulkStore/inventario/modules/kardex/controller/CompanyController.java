package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Company;
import com.hulkStore.inventario.modules.kardex.services.BuysService;
import com.hulkStore.inventario.modules.kardex.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public  List<Company> listBuys(){
        return (List<Company>) companyService.listAll();
    }
}
