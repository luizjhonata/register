package com.luizjhonata.register.controller;

import com.luizjhonata.register.model.CustomerModel;
import com.luizjhonata.register.repository.CustomerRepository;
import com.luizjhonata.register.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/customer/save")
    public ResponseEntity<CustomerModel> save(@RequestBody CustomerModel customer){
        return ResponseEntity.ok(repository.save(customer));
    }




}