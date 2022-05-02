package com.hulkStore.inventario.modules.users.controller;

import com.hulkStore.inventario.core.ErrorControl;
import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.modules.kardex.services.ProductService;
import com.hulkStore.inventario.modules.users.model.Customer;
import com.hulkStore.inventario.modules.users.services.CustomerService;
import com.hulkStore.inventario.util.Constants;
import com.hulkStore.inventario.util.EncriptactionUtiltary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private EncriptactionUtiltary encriptador;

    @GetMapping
    public ResponseEntity<?> lisCustomer() {
        return new ResponseEntity<>(customerService.listAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<?> searchCustomer(@PathVariable long id) {
        try {
            Customer customer = customerService.searchCustomer(id);
            if (customer != null) {
                String creditCardDesencryted= encriptador.desencriptar(customer.getCreditCardInfo(),Constants.PDEncriptador);
                customer.setCreditCardInfo(creditCardDesencryted);
                return new ResponseEntity<Customer>(customer, HttpStatus.OK);
            }
        } catch (Exception err) {
            return new ResponseEntity<ErrorControl>(
                    new ErrorControl(err.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), true),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable long id) {
        customerService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@Validated @RequestBody Customer customer) throws UnsupportedEncodingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        String creditCardEncripted= encriptador.encriptar(customer.getCreditCardInfo(), Constants.PDEncriptador);
        customer.setCreditCardInfo(creditCardEncripted);
        Customer customerSaved = customerService.save(customer);
        URI ubication = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
                .buildAndExpand(customerSaved.getId()).toUri();
        return ResponseEntity.created(ubication).body(customerSaved);

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct (@PathVariable long id, @Validated @RequestBody Customer customer){
        try {
            Customer customersearched = customerService.searchCustomer(id);
            if (customersearched != null) {
               customerService.save(customer);
                return new ResponseEntity<Customer>(customer, HttpStatus.OK);
            }
        } catch (Exception err) {
            return new ResponseEntity<ErrorControl>(
                    new ErrorControl(err.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value(), true),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return null;



    }

}
