package com.companys.apisalesup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idEmployee;

    @Column(name = "name_emp")
    private String nameEmployee;

    @Column(name = "phone_emp")
    private String phoneEmployee;

    @Column(name = "password_emp")
    private String passwordEmployee;

    @Column(name = "user_emp")
    private String userEmployee;

    @Column(name = "identification")
    private String identificationEmployee;

    @Column(name = "role_id")
    private Integer idRole;

}
