package com.hulkStore.inventario.modules.kardex.repository;

import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  This interface contains the repository to persist Sales
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Repository
public interface SalesRepository extends JpaRepository<Sales,Long> {
}
