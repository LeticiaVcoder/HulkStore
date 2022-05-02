package com.hulkStore.inventario.modules.kardex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.modules.users.model.Employee;
import com.hulkStore.inventario.modules.users.model.WebUserSystem;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  This class contains the attributes and methods de HulkStore Company
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Data
@Entity
@Table(schema = Constants.SCHEMA, name = "company", uniqueConstraints = {
        @UniqueConstraint (columnNames = { "nameSucursal" }, name = "nameSucursal_uk") })
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Company extends BaseEntity {
    @Column (nullable = false, length = 100)
    private String  nameSucursal;
    @Column (nullable = false, length = 100)
    private String  address;
    @Column (nullable = false, length = 15)
    private String  fono;
    @Column (nullable = false, length = 50)
    private String  city;
}
