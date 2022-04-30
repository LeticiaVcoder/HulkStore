package com.hulkStore.inventario.modules.users.repository;

import com.hulkStore.inventario.modules.users.model.Administrator;
import com.hulkStore.inventario.modules.users.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
