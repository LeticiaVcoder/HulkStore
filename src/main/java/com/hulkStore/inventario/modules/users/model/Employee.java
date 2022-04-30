package com.hulkStore.inventario.modules.users.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of an employee
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table (name = "employee")
@Data

public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idEmployee;
    @Column (nullable = false, length = 100)
    private String nameEmployee;
    @Column (nullable = false)
    private Date   dateAdmission;

}
