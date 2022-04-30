package com.hulkStore.inventario.modules.shoppingCart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.users.model.Employee;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;

/**
 *  This class contains the attributes and methods of a information of Shipping
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table(schema = Constants.SCHEMA, name = "shippingInfo")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class ShippingInfo extends BaseEntity {

    @Column (nullable = false)
    private float   shippingCost;
    @Column (nullable = false, length = 30)
    private String   shippingType;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_order",foreignKey = @ForeignKey(name = "shippingInfo_order_fk"), nullable = false)
    private Order order;
}
