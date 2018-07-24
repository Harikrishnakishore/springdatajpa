package com.example.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.spring.data.entities.Employee;
import com.example.spring.data.repos.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	public void saveEmployee() {
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		Employee emp = new Employee();
		emp.setId(1000L);
		emp.setReportMgr(100L);
		emp.setFirstName("ABC");
		emp.setLastName("xyz");
		emp.setEmail("Azs@gmail.com");
		emp.setGroup_id(20L);
		emp.setDesig_id(5L);
		emp.setSalary(1000.00d);
		
		repository.save(emp);
	}

}
