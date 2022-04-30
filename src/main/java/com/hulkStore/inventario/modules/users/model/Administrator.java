package com.hulkStore.inventario.modules.users.model;

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
@Table (name = "administrator")
@Data
public class Administrator  extends WebUser {
    @Column (nullable = false, length = 100)
    private String  nameAdministrator;
    @Column (nullable = false, length = 100)
    private String  email;
}
