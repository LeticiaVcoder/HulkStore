package com.hulkStore.inventario.modules.kardex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a sale
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table(schema = Constants.SCHEMA, name = "sales")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Sales extends BaseEntity {
    @Column (nullable = false, length = 20)
    private String  numberInvoceSale;
    @Column (nullable = false)
    private Date    dateSale;
    @Column (nullable = false, length = 200)
    private String  observation;
    @Column (nullable = false)
    private Integer amount;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_inventory",foreignKey = @ForeignKey(name = "sales_inventary_fk"), nullable = false )
    private Inventory inventory;

}
