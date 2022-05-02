package com.hulkStore.inventario.modules.kardex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a Buy
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (schema = Constants.SCHEMA,name = "buys")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Buys extends BaseEntity {

    @Column (nullable = false, length = 20)
    private String  numberInvoceBuy;
    @Column (nullable = false)
    private Date    dateBuy;
    @Column (nullable = true, length = 200)
    private String  observation;
    @Column (nullable = false)
    private Integer amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_product",foreignKey = @ForeignKey(name = "product_buys_fk"), nullable = false )
    private Product product;

}
