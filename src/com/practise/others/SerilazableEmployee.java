package com.practise.others;

import java.io.Serializable;

public class SerilazableEmployee implements Serializable {
    /**
    * 
    */
    private static final long serialVersionUID = 6956961616756403237L;
    private String employeeName;
    private int employeeID;

    public SerilazableEmployee(String employeeName, int employeeID) {
        super();
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeID=" + employeeID + "]";
    }

    public static void main(String[] args) {
    }
}
