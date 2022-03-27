package com.luizjhonata.register.repository;

import com.luizjhonata.register.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, String> {
}
