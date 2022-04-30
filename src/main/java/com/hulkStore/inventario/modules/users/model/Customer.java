package com.hulkStore.inventario.modules.users.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.shoppingCart.model.Order;
import com.hulkStore.inventario.modules.shoppingCart.model.ShoppingCart;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 *  This class contains the attributes and methods of a customer
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table(schema = Constants.SCHEMA, name = "customer", uniqueConstraints = {
        @UniqueConstraint (columnNames = { "identifyCustomer" }, name = "identifyCustomer_uk") })
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Customer extends WebUserSystem {

    @Column (nullable = false, length = 20)
    private String  identifyCustomer;
    @Column (nullable = false, length = 100)
    private String  nameCustomer;
    @Column (nullable = false, length = 100)
    private String  addressCustomer;
    @Column (nullable = false, length = 100)
    private String  email;
    @Column (nullable = false, length = 100)
    private String  creditCardInfo;
    @Column (nullable = false, length = 100)
    private String      shippingInfo;
    @OneToMany (mappedBy="customer",cascade = CascadeType.ALL)
    private List<Order>        listOrder = new ArrayList<Order>();
    @OneToMany (mappedBy="customer",cascade = CascadeType.ALL)
    private List<ShoppingCart> listShoppingCart = new ArrayList<ShoppingCart>();
}
