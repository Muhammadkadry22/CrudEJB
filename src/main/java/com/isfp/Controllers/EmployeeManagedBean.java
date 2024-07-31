/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.isfp.Controllers;

import com.isfp.Services.EmployeeServiceLocal;
import com.isfp.Entities.Employee;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;

/**
 *
 * @author mohamed kadry
 */
@Named(value = "employeeManagedBean")
@RequestScoped
public class EmployeeManagedBean {

    @EJB
    private EmployeeServiceLocal employeeService;

    private Employee employee = new Employee();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
      public void createEmployee() {
        employeeService.addEmployee(employee);
        employee = new Employee(); // Reset the employee after creation
    }

    public void updateEmployee() {
        employeeService.updateEmployee(employee);
    }

    public void deleteEmployee(Employee e) {
        employeeService.deleteEmployee(e);
    }

    public Employee findEmployee(int id) {
        return employeeService.findEmployee(id);
    }

    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
    
    public EmployeeManagedBean() {
    }
    
}
