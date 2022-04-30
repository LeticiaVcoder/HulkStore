package com.hulkStore.inventario.modules.users.repository;

import com.hulkStore.inventario.modules.users.model.Administrator;
import com.hulkStore.inventario.modules.users.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
