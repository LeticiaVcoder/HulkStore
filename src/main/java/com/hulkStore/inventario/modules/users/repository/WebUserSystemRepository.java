package com.hulkStore.inventario.modules.users.repository;

import com.hulkStore.inventario.modules.users.model.Employee;
import com.hulkStore.inventario.modules.users.model.WebUserSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebUserSystemRepository extends JpaRepository<WebUserSystem,Long> {
}
