package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.model.Sales;
import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
import com.hulkStore.inventario.modules.kardex.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * this service class connects to several repositories and bundles  their functionality
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Service
public class SalesService  {
    @Autowired
    private SalesRepository salesRepository;

    public List<Sales> listAll() {
        return salesRepository.findAll();
    }

    public void save(Sales sales){
        salesRepository.save(sales);
    }
    public Sales searchSales(Long id)
    {
        return  salesRepository.getById(id);
    }

    public void delete(Long id)
    {
        salesRepository.deleteById(id);
    }
}
