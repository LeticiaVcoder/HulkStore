package com.hulkStore.inventario.modules.kardex.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a sale
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (name = "sales")
@Data
public class Sales {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idSale;
    @Column (nullable = false, length = 20)
    private String  numberInvoceSale;
    @Column (nullable = false)
    private Date    dateSale;
    @Column (nullable = false, length = 200)
    private String  observation;
    @Column (nullable = false)
    private Integer amount;

}
