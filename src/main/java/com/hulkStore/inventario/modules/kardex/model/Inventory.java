package com.hulkStore.inventario.modules.kardex.model;
/**
 *  This class contains the attributes and methods of an inventory
 *  @author Leticia Villa
 *  @version 1.0
 * */
import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "inventory")
@Data
public class Inventory {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idSucursal;
    @Column (nullable = false)
    private Integer input;
    @Column (nullable = false)
    private Integer output;
    @Column (nullable = false)
    private Integer stock;
    @Column (nullable = false)
    private float   costUnit;
    @Column (nullable = false)
    private float   inventoryAmount;
}
