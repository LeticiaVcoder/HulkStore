package com.hulkStore.inventario.modules.shoppingCart.model;

import lombok.*;

import javax.persistence.*;

/**
 *  This class contains the attributes and methods of a Details of Order
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (name = "orderDetails")
@Data
public class OrderDetails {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idOrderDetails;
    @Column (nullable = false)
    private float   unitCost;
    @Column (nullable = false)
    private float   subTotal;
    @Column (nullable = false)
    private Integer quantity;
}
