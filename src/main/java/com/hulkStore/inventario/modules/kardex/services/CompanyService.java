package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Company;
import com.hulkStore.inventario.modules.kardex.repository.BuysRepository;
import com.hulkStore.inventario.modules.kardex.repository.CompanyRepository;
import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class CompanyService  {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> listAll() {
        return companyRepository.findAll();
    }

    public void save(Company company){
        companyRepository.save(company);
    }
    public Company searchBuy(Long id)
    {
        return  companyRepository.getById(id);
    }

    public void delete(Long id)
    {
        companyRepository.deleteById(id);
    }
}
