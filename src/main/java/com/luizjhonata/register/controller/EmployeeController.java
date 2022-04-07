package com.luizjhonata.register.controller;

import com.luizjhonata.register.model.EmployeeModel;
import com.luizjhonata.register.repository.EmployeeRepository;
import com.luizjhonata.register.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value =  "/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeService service;

    @Autowired
    private PasswordEncoder encoder;


    @GetMapping("/employee/all")
    public ResponseEntity<List<EmployeeModel>> listAll(){
        List<EmployeeModel> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/employee/{name}")
    public ResponseEntity<List<EmployeeModel>> findByName(@PathVariable String name){
        List<EmployeeModel> employee = service.findByName(name);
        return ResponseEntity.ok(employee);
    }

    @PostMapping("/employee/save")
    public ResponseEntity<EmployeeModel> save(@RequestBody EmployeeModel employee){
        employee.setPassword(encoder.encode(employee.getPassword()));
        return ResponseEntity.ok(repository.save(employee));
    }

    @GetMapping("/employee/login")
    public ResponseEntity<Boolean> passwordValidation(@RequestParam String email,
                                                      @RequestParam String password){

        Optional<EmployeeModel> optEmployee = repository.findByEmail(email);
        if (optEmployee.isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }

        EmployeeModel employee = optEmployee.get();
        boolean valid = encoder.matches(password, employee.getPassword());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);
    }

    @GetMapping("/employee/{email}")
    public ResponseEntity<Optional<EmployeeModel>> findByEmail(@PathVariable String email){
        Optional<EmployeeModel> employee = service.findByEmail(email);
        return ResponseEntity.ok(employee);
    }


}
