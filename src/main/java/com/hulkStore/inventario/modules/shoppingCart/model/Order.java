package com.hulkStore.inventario.modules.shoppingCart.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of an order
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (name = "order")
@Data
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idOrder;
    @Column (nullable = false)
    private Date    dateCreated;
    @Column (nullable = false)
    private Date    dateShipped;
    @Column (nullable = false, length = 20)
    private String status;
    //IdCustomer
    //IdShippingId
}
