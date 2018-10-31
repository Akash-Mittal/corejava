package com.practise.java8;

import java.util.ArrayList;
import java.util.List;

import com.practise.domain.Employee;

public class FllatMap {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Adam", 1221);
		Employee employee2 = new Employee("Mike", 12223);
		Employee employee3 = new Employee("Paul", 12257);
		Employee employee4 = new Employee("Henry", 122653);
		Employee employee5 = new Employee("AGuru", 12221435);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		printAllEmployeesInListWithNameHasA(employees);
	}

	private static void printAllEmployeesInListWithNameHasA(List<Employee> employees) {
		employees.stream().filter(emp -> emp.getEmployeeName().contains("A")).forEach(emp -> System.out.println(emp));
	}

}
