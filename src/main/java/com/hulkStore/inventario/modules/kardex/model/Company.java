package com.hulkStore.inventario.modules.kardex.model;

import lombok.*;

import javax.persistence.*;

/**
 *  This class contains the attributes and methods de HulkStore Company
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idSucursal;
    @Column (nullable = false, length = 100)
    private String  address;
    @Column (nullable = false, length = 15)
    private String  fono;
    @Column (nullable = false, length = 50)
    private String  city;
}
