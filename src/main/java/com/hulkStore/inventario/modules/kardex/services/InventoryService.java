package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Inventory;
import com.hulkStore.inventario.modules.kardex.repository.BuysRepository;
import com.hulkStore.inventario.modules.kardex.repository.InventoryRepository;
import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
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
public class InventoryService  {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> listAll() {
        return inventoryRepository.findAll();
    }

    public void save(Inventory inventory){
        inventoryRepository.save(inventory);
    }
    public Inventory searchInventory(Long id)
    {
        return  inventoryRepository.getById(id);
    }

    public void delete(Long id)
    {
        inventoryRepository.deleteById(id);
    }


}
