package com.luizjhonata.register.service;

import com.luizjhonata.register.model.CustomerModel;
import com.luizjhonata.register.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<CustomerModel> findAll() {
        return repository.findAll();
    }

    public CustomerModel findById(Long id){
        return repository.findById(id).get();
    }

}
