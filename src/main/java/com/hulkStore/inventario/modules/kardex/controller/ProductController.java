package com.hulkStore.inventario.modules.kardex.controller;

import com.hulkStore.inventario.core.ErrorControl;
import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping ("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<?> listproducts() {
        return new ResponseEntity<>(productService.listAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> searchproduct(@PathVariable long id) {
        try {
            Product product = productService.searchProduct(id);
            if (product != null) {
                return new ResponseEntity<Product>(product, HttpStatus.OK);
            }
        } catch (Exception err) {
            return new ResponseEntity<ErrorControl>(
                    new ErrorControl(err.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), true),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Product> saveProduct(@Validated @RequestBody Product product) {
        Product productSaved = productService.save(product);
        URI ubication = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
                .buildAndExpand(productSaved.getId()).toUri();
        return ResponseEntity.created(ubication).body(productSaved);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct (@PathVariable long id, @Validated @RequestBody Product product){
        try {
            Product productsearched = productService.searchProduct(id);
            if (productsearched != null) {
               productService.save(product);
                return new ResponseEntity<Product>(product, HttpStatus.OK);
            }
        } catch (Exception err) {
            return new ResponseEntity<ErrorControl>(
                    new ErrorControl(err.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), true),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;



    }

}
