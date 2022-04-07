package com.luizjhonata.register.service;


import com.luizjhonata.register.model.EmployeeModel;
import com.luizjhonata.register.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<EmployeeModel> findByEmail(String email){
        Optional<EmployeeModel> employee = repository.findByEmail(email);
        return employee;
    }


}
