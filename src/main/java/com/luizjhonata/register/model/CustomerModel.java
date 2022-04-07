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
@Table(name = "tb_customer")
public class CustomerModel {

    public CustomerModel() {
    }

    @Id
    @Column(unique = true)
    private String cnpj;

    private String nome_fantasia;

    @Column(nullable = false)
    private String nome_social;

    private String insc_estadual;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    private String pessoa_contato;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private Long numero;

    @Column(nullable = false)
    private String cep;

}
