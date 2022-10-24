package com.zaurtregulov.spring.springboot.spring_data_jpa.dao;

import com.zaurtregulov.spring.springboot.spring_data_jpa.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//первый джереник означает с каким entity будет работать репозиторий
//второй - какой тип данных у класса, который является primary key
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  //не прописываем никакую логику, потому что spring уже знает что требуется,
  //нужно только знать название методов
}
