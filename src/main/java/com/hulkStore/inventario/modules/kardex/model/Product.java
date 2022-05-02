package com.hulkStore.inventario.modules.kardex.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.shoppingCart.model.OrderDetails;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  This class contains the attributes and methods of a product
 *  @author Leticia Villa
 *  @version 1.0
 * */


@Entity
@Table(schema = Constants.SCHEMA, name = "product")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Product extends BaseEntity {

    @Column (nullable = false, length = 100)
    private String  nameProduct;
    @Column (nullable = false, length = 100)
    private String  nameHeroe;
    @Column (nullable = false)
    private float   VUProduct;


}

