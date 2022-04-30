package com.hulkStore.inventario.modules.users.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hulkStore.inventario.core.BaseEntity;
import com.hulkStore.inventario.util.Constants;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 *  This class contains the attributes and methods of a webUser
 *  @author Leticia Villa
 *  @version 1.0
 * */

@Table(schema = Constants.SCHEMA, name = "webUser", uniqueConstraints = {
        @UniqueConstraint (columnNames = { "userLogin" }, name = "user_uk") })

@Data
@Entity
@Inheritance(
        strategy = InheritanceType.JOINED
)
@JsonIgnoreProperties ({ "hibernateLazyInitializer", "handler" })
public class WebUserSystem extends BaseEntity {
    @Column (nullable = false, length = 100)
    private String  userLogin;
    @Column (nullable = false, length = 100)
    private String  password;
    @Column (nullable = false, length = 100)
    private String  loginStatus;
    @Column (nullable = false)
    private Date    dateRegister;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="id_employee",foreignKey = @ForeignKey(name = "webUserSystem_employee_fk"), nullable = false)
    private Employee employee;
}
