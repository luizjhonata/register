package com.luizjhonata.register.model;

import lombok.Getter;
import lombok.Setter;

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

    private String name;

    @Id
    private String email;

    private String cargo;

    private String celular;


}
