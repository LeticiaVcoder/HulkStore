package com.hulkStore.inventario.modules.kardex.repository;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  This interface contains the repository to persist Company
 *  @author Leticia Villa
 *  @version 1.0
 * */
public interface CompanyRepository extends JpaRepository<Company,Long> {
}
