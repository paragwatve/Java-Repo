package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeInsuranceSystem {
    public static void main(String[] args) {
        // Creating instances
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeServiceImpl();

        // Getting employee details
        employeeService.getEmployeeDetails(employee);

        // Finding insurance scheme
        employeeService.findInsuranceScheme(employee);

        // Displaying employee details
        employeeService.displayEmployeeDetails(employee);
    }
}
