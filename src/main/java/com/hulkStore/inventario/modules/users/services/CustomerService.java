package com.hulkStore.inventario.modules.users.services;

import com.hulkStore.inventario.modules.users.model.Customer;
import com.hulkStore.inventario.modules.users.repository.CustomerRepository;
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
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> listAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer){
        customerRepository.save(customer);
        return customer;
    }
    public Customer searchCustomer(Long id)
    {
        return  customerRepository.getById(id);
    }

    public void delete(Long id)
    {
        customerRepository.deleteById(id);
    }

}
