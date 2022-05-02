package com.hulkStore.inventario.modules.shoppingCart.repository;

import com.hulkStore.inventario.modules.shoppingCart.model.OrderDetails;
import com.hulkStore.inventario.modules.shoppingCart.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
