package com.hulkStore.inventario.modules.kardex.model;
/**
 *  This class contains the attributes and methods of an inventory
 *  @author Leticia Villa
 *  @version 1.0
 * */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.users.model.Employee;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = Constants.SCHEMA, name = "inventory")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Inventory extends BaseEntity {

    @Column (nullable = false)
    private Integer        idProduct;
    @Column (nullable = false)
    private Integer        input;
    @Column (nullable = false)
    private Integer        output;
    @Column (nullable = false)
    private Integer        stock;
    @Column (nullable = false)
    private float   costUnit;
    @Column (nullable = false)
    private float    inventoryAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_company",foreignKey = @ForeignKey(name = "inventory_company_fk"), nullable = false )
    private Company company;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_buy",foreignKey = @ForeignKey(name = "inventory_buy_fk"), nullable = true )
    private Buys buy;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_sales",foreignKey = @ForeignKey(name = "inventory_sales_fk"), nullable = true )
    private Sales sales;

}
