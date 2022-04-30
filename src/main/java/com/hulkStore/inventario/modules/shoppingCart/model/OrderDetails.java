package com.hulkStore.inventario.modules.shoppingCart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.kardex.model.Inventory;
import com.hulkStore.inventario.modules.kardex.model.Product;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;

/**
 *  This class contains the attributes and methods of a Details of Order
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table(schema = Constants.SCHEMA, name = "orderDetails")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class OrderDetails extends BaseEntity {

    @Column (nullable = false)
    private float   unitCost;
    @Column (nullable = false)
    private float   subTotal;
    @Column (nullable = false)
    private Integer   quantity;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_order",foreignKey = @ForeignKey(name = "orderDetails_order_fk"), nullable = false )
    private Order   order;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_product",foreignKey = @ForeignKey(name = "orderDetails_product_fk"), nullable = false )
    private Product product;
}
