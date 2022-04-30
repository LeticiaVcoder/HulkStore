package com.hulkStore.inventario.modules.shoppingCart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.users.model.Customer;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a shopping cart
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table(schema = Constants.SCHEMA, name = "shoppingCart")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class ShoppingCart extends BaseEntity {
    @Column (nullable = false)
    private Integer amount;
    @Column (nullable = false)
    private Date     dateAdded;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_customer",foreignKey = @ForeignKey(name = "shoppingCart_customer_fk"), nullable = false )
    private Customer customer;
}


