package com.hulkStore.inventario.modules.shoppingCart.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a shopping cart
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (name = "shoppingCart")
@Data
public class ShoppingCart {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idCart;
    @Column (nullable = false)
    private Integer amount;
    @Column (nullable = false)
    private Date dateAdded;
}
