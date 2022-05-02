package com.hulkStore.inventario.modules.kardex.repository;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  This interface contains the repository to persist Product
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
