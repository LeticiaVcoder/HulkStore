package com.hulkStore.inventario.modules.shoppingCart.services;

import com.hulkStore.inventario.modules.shoppingCart.model.Order;
import com.hulkStore.inventario.modules.shoppingCart.model.OrderDetails;
import com.hulkStore.inventario.modules.shoppingCart.repository.OrderDetailsRepository;
import com.hulkStore.inventario.modules.shoppingCart.repository.OrderRepository;
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
public class OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> listAll() {
        return orderDetailsRepository.findAll();
    }

    public void save(OrderDetails orderDetails){
        orderDetailsRepository.save(orderDetails);
    }
    public OrderDetails searchOrderDetails(Long id)
    {
        return  orderDetailsRepository.getById(id);
    }

    public void delete(Long id)
    {
        orderDetailsRepository.deleteById(id);
    }

}
