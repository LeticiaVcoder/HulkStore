package com.hulkStore.inventario.modules.users.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.kardex.model.Company;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of an employee
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Entity
@Table(schema = Constants.SCHEMA, name = "employee")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Employee extends BaseEntity {

    @Column (nullable = false, length = 100)
    private String nameEmployee;
    @Column (nullable = false)
    private Date   dateAdmission;

   @OneToOne(mappedBy="employee",cascade = CascadeType.ALL)
    private WebUserSystem webusersystem;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_company",foreignKey = @ForeignKey(name = "employee_company_fk"), nullable = false )
    private Company company;
}
