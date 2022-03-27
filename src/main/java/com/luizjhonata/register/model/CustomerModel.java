package com.luizjhonata.register.model;

import lombok.Getter;
import lombok.Setter;
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
    private Long cnpj;

    private String nome_fantasia;

    private String nome_social;

    private String insc_estadual;

    private String telefone;

    private String email;

    private String pessoa_contato;

    private String uf;

    private String cidade;

    private String bairro;

    private String rua;

    private Long numero;

    private String cep;

}
