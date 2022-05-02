package com.hulkStore.inventario.modules.users.repository;

import com.hulkStore.inventario.modules.shoppingCart.model.Order;
import com.hulkStore.inventario.modules.users.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator,Long> {
}
