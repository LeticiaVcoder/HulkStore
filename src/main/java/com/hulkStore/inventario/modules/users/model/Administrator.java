package com.hulkStore.inventario.modules.users.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *  This class contains the attributes and methods of a administrator
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (schema = Constants.SCHEMA,name = "administrator")
@Data
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class Administrator  extends WebUserSystem {
    @Column (nullable = false, length = 100)
    private String  nameAdministrator;
    @Column (nullable = false, length = 100)
    private String  email;
}
