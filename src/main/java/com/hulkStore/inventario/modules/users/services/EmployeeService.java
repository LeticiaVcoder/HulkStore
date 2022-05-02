package com.hulkStore.inventario.modules.users.services;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.repository.BuysRepository;
import com.hulkStore.inventario.modules.users.model.Employee;
import com.hulkStore.inventario.modules.users.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * this service class connects to several repositories and bundles  their functionality
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public void save(Employee buys){
        employeeRepository.save(buys);
    }
    public Employee searchBuy(Long id)
    {
        return  employeeRepository.getById(id);
    }

    public void delete(Long id)
    {
        employeeRepository.deleteById(id);
    }

}
