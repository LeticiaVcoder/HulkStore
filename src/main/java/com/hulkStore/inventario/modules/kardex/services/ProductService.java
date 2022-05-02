package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.repository.ProductRepository;
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
public class ProductService  {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product save(Product product){
        productRepository.save(product);
        return product;
    }
    public Product searchProduct(Long id)
    {
        return  productRepository.getById(id)==null?null:productRepository.getById(id);
    }

    public void delete(Long id)
    {
        productRepository.deleteById(id);
    }

}
