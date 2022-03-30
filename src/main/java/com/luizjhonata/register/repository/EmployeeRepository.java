package com.luizjhonata.register.repository;

import com.luizjhonata.register.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, String> {


    List<EmployeeModel> findByName(String name);


}
