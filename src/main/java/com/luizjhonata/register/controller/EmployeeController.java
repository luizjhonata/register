package com.luizjhonata.register.controller;

import com.luizjhonata.register.model.EmployeeModel;
import com.luizjhonata.register.repository.EmployeeRepository;
import com.luizjhonata.register.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value =  "/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeService service;


    @GetMapping("/employee/all")
    public ResponseEntity<List<EmployeeModel>> listAll(){
        List<EmployeeModel> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    public ResponseEntity<EmployeeModel> findById(@PathVariable String id){
        EmployeeModel employee = service.findById(id);
        return ResponseEntity.ok(employee);

    }



}
