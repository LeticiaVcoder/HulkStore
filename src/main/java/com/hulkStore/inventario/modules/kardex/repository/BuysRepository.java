package com.hulkStore.inventario.modules.kardex.repository;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *  This interface contains the repository to persist Buys
 *  @author Leticia Villa
 *  @version 1.0
 * */
public interface BuysRepository extends JpaRepository<Buys,Long> {

}
