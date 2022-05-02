package com.hulkStore.inventario.modules.shoppingCart.services;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.repository.BuysRepository;
import com.hulkStore.inventario.modules.shoppingCart.model.Order;
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
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> listAll() {
        return orderRepository.findAll();
    }

    public void save(Order order){
        orderRepository.save(order);
    }
    public Order searchOrder(Long id)
    {
        return  orderRepository.getById(id);
    }

    public void delete(Long id)
    {
        orderRepository.deleteById(id);
    }

}
