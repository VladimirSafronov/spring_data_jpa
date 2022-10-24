package com.zaurtregulov.spring.springboot.spring_data_jpa.service;


import com.zaurtregulov.spring.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.zaurtregulov.spring.springboot.spring_data_jpa.entity.Employee;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }

  public void saveEmployee(Employee employee) {
    employeeRepository.save(employee);
  }

  public Employee getEmployee(int id) {
    Employee employee = null;
    Optional<Employee> optionalEmployee = employeeRepository.findById(id);
    if (optionalEmployee.isPresent()) {
      employee = optionalEmployee.get();
    }
    return employee;
  }

  public void deleteEmployee(int id) {
    employeeRepository.deleteById(id);
  }

  @Override
  public List<Employee> findAllByName(String name) {
    List<Employee> employees = employeeRepository.findAllByName(name);
    return employees;
  }
}
