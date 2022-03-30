package com.luizjhonata.register.service;


import com.luizjhonata.register.model.EmployeeModel;
import com.luizjhonata.register.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<EmployeeModel> findAll(){
        return repository.findAll();
    }

    public List<EmployeeModel> findByName(String name){
        List<EmployeeModel> employee = repository.findByName(name);
        return employee;

    }
}
