package com.akash.others;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.*;



public class SerilazableEmployee implements Serializable {
		private String employeeName;
	private int employeeID;

	public SerilazableEmployee(String employeeName, int employeeID) {
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
	}
}
