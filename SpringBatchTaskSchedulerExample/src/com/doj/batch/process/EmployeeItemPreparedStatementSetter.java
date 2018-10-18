package com.doj.batch.process;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.doj.batch.bean.Employee;

public class EmployeeItemPreparedStatementSetter implements ItemPreparedStatementSetter<Employee> {

	@Override
	public void setValues(Employee emp, PreparedStatement ps) throws SQLException {
		ps.setString(1, emp.getName());
		ps.setInt(2, emp.getAge());
		ps.setFloat(3, emp.getSalary());
		ps.setString(4, emp.getAddress());
	}

}
