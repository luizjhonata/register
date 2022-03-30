package com.luizjhonata.register.controller;

import com.luizjhonata.register.model.CustomerModel;
import com.luizjhonata.register.repository.CustomerRepository;
import com.luizjhonata.register.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerService service;


    @GetMapping(value = "/customer/all")
    public ResponseEntity<List<CustomerModel>> listAll(){
        List<CustomerModel> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity<CustomerModel> findById(@PathVariable Long id){
        CustomerModel customer = service.findById(id);
        return ResponseEntity.ok(customer);
    }


}