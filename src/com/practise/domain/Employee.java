package com.practise.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.*;



public class Employee implements Comparable<Employee> , Serializable {
	
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 6884062097665486547L;
	
	
	
	private String employeeName;
	private int employeeID;

	@Override
	public int compareTo(Employee o) {
		return this.employeeName.compareTo(o.employeeName);
	}
	
	public Employee(String employeeName, int employeeID) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeID="
				+ employeeID + "]";
	}
	public static void main(String[] args) {
		
//*************************LIST************************************		
		
		// Sorting on the Basis of employeeName
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("b", 1));
		list.add(new Employee("a", 2));
		list.add(new Employee("a", 2));
		list.add(new Employee("z", 2));
		System.err.println("----------Unordered List-----------");
		for(Employee employee : list)
			System.out.println(employee);
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.employeeName.compareTo(o2.employeeName);
			}
		};
		
		Collections.sort(list,comparator);
		System.err.println("----------Ordered List-----------");
		for(Employee employee : list)
			System.out.println(employee);
		
//*************************LIST************************************
		//Sortin a  Set of user defined POJO
			// 	Tree Set Using Comparable
			// List Using Comparator
		Set<Employee> set = new HashSet<Employee>();
		for(int i=0;i<5;i++){
			set.add(new Employee("a"+new Random().nextInt(10), i));
		}
		System.err.println("----------Unordered Set-----------");
		for(Employee employee : set)
			System.out.println(employee);
		System.err.println("----------Ordered Tree Set-----------");	
		// The Employee must implement Comparable interface
			// Else it will throw ClassCastException
		Set<Employee> set1 = new TreeSet<>(set);
		for(Employee employee : set1)
		System.out.println(employee);
		
		List<Employee> list2 = new ArrayList<Employee>(set);
		System.err.println("----------Ordered  Set through List-----------");
		Collections.sort(list2,comparator);
		for(Employee employee : list2)
			System.out.println(employee);

		
	}
}
