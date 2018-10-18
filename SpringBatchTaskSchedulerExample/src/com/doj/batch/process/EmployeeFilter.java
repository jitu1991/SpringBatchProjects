package com.doj.batch.process;

import org.springframework.batch.item.ItemProcessor;

import com.doj.batch.bean.Employee;

/**
 * @author Dinesh Rajput
 *
 */
public class EmployeeFilter implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee emp) throws Exception {
		if(emp.getAge() > 30){
			System.out.println(emp);
			return emp;
		}else{
			return null;
		}
	}
}
