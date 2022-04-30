package com.hulkStore.inventario.modules.shoppingCart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.model.Inventory;
import com.hulkStore.inventario.modules.users.model.Customer;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  This class contains the attributes and methods of an order
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table(schema = Constants.SCHEMA, name = "order")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Order extends BaseEntity {

    @Column (nullable = false)
    private Date    dateCreatedOrder;
    @Column (nullable = false)
    private Date    dateShipped;
    @Column (nullable = false, length = 20)
    private String   statusOrder;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_customer",foreignKey = @ForeignKey(name = "customer_order_fk"), nullable = false )
    private Customer   customer;
    @OneToMany(mappedBy="order",cascade = CascadeType.ALL)
    private List<OrderDetails> listOrderDetails = new ArrayList<OrderDetails>();
    @OneToMany(mappedBy="order",cascade = CascadeType.ALL)
    private List<ShippingInfo> listShippingInfo = new ArrayList<ShippingInfo>();
}
