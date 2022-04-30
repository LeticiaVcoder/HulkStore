package com.hulkStore.inventario.modules.kardex.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a Buy
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (name = "buys")
@Data
public class Buys {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idBuy;
    @Column (nullable = false, length = 20)
    private String  numberInvoceBuy;
    @Column (nullable = false)
    private Date    dateBuy;
    @Column (nullable = false, length = 200)
    private String  observation;
    @Column (nullable = false)
    private Integer amount;


}
