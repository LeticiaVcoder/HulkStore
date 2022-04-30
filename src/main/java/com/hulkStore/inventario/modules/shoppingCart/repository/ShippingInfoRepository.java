package com.hulkStore.inventario.modules.shoppingCart.repository;

import com.hulkStore.inventario.modules.shoppingCart.model.OrderDetails;
import com.hulkStore.inventario.modules.shoppingCart.model.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingInfoRepository extends JpaRepository<ShippingInfo,Long> {
}
