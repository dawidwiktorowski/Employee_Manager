package com.dawidwiktorowski.employee_manager.repository;

import com.dawidwiktorowski.employee_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

}
