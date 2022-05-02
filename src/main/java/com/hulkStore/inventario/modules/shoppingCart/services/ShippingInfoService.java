package com.hulkStore.inventario.modules.shoppingCart.services;

import com.hulkStore.inventario.modules.shoppingCart.model.OrderDetails;
import com.hulkStore.inventario.modules.shoppingCart.model.ShippingInfo;
import com.hulkStore.inventario.modules.shoppingCart.repository.OrderDetailsRepository;
import com.hulkStore.inventario.modules.shoppingCart.repository.ShippingInfoRepository;
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
public class ShippingInfoService {
    @Autowired
    private ShippingInfoRepository shippingInfoRepository;

    public List<ShippingInfo> listAll() {
        return shippingInfoRepository.findAll();
    }

    public void save(ShippingInfo shippingInfo){
        shippingInfoRepository.save(shippingInfo);
    }
    public ShippingInfo searchShippingInfo(Long id)
    {
        return  shippingInfoRepository.getById(id);
    }

    public void delete(Long id)
    {
        shippingInfoRepository.deleteById(id);
    }

}
