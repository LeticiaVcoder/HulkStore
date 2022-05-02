package com.hulkStore.inventario.modules.shoppingCart.services;

import com.hulkStore.inventario.modules.shoppingCart.model.ShippingInfo;
import com.hulkStore.inventario.modules.shoppingCart.model.ShoppingCart;
import com.hulkStore.inventario.modules.shoppingCart.repository.ShippingInfoRepository;
import com.hulkStore.inventario.modules.shoppingCart.repository.ShoppingCartRepository;
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
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCart> listAll() {
        return shoppingCartRepository.findAll();
    }

    public void save(ShoppingCart shoppingCart){
        shoppingCartRepository.save(shoppingCart);
    }
    public ShoppingCart searchShoppingCart(Long id)
    {
        return  shoppingCartRepository.getById(id);
    }

    public void delete(Long id)
    {
        shoppingCartRepository.deleteById(id);
    }

}
