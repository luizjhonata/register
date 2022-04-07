package com.luizjhonata.register.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tb_employee")
public class EmployeeModel {

    public EmployeeModel() {
    }

    @Column(nullable = false)
    private String name;

    @Id
    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String celular;


}
