package com.hulkStore.inventario.modules.kardex.model;

import lombok.*;

import javax.persistence.*;
/**
 *  This class contains the attributes and methods of a product
 *  @author Leticia Villa
 *  @version 1.0
 * */


@Entity
@Table (name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    @Column (nullable = false, length = 100)
    private String  nameProduct;
    @Column (nullable = false, length = 100)
    private String  nameHeroe;
    @Column (nullable = false)
    private float   VUProduct;

}

