package com.hulkStore.inventario.modules.shoppingCart.model;

import lombok.*;

import javax.persistence.*;

/**
 *  This class contains the attributes and methods of a information of Shipping
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (name = "shippingInfo")
@Data
public class ShippingInfo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idShippingInfo;
    @Column (nullable = false)
    private float   shippingCost;
    @Column (nullable = false, length = 30)
    private String shippingType;
}
