package com.hulkStore.inventario.modules.users.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *  This class contains the attributes and methods of a customer
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (name = "customer")
@Data
public class Customer extends WebUser {

    @Column (nullable = false, length = 20)
    private String  IdentifyCustomer;
    @Column (nullable = false, length = 100)
    private String  NameCustomer;
    @Column (nullable = false, length = 100)
    private String  addressCustomer;
    @Column (nullable = false, length = 100)
    private String  email;
    @Column (nullable = false, length = 100)
    private String  creditCardInfo;
    @Column (nullable = false, length = 100)
    private String  shippingInfo;
}
