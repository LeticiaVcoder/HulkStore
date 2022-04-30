package com.hulkStore.inventario.modules.users.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a webUser
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Entity
@Table (name = "webUser")
@Data
public class WebUser {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idUserWeb;
    @Column (nullable = false, length = 100)
    private String  user;
    @Column (nullable = false, length = 100)
    private String  password;
    @Column (nullable = false, length = 100)
    private String  loginStatus;
    @Column (nullable = false)
    private Date    dateRegister;
}
