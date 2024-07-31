/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.isfp.Services;

import com.isfp.DOAs.EmployeeFacadeLocal;
import com.isfp.Entities.Employee;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.List;

/**
 *
 * @author mohamed kadry
 */
@Stateless
public class EmployeeService implements EmployeeServiceLocal {

     @EJB
    private EmployeeFacadeLocal employeeFacade;
     
    @Override
    public void addEmployee(Employee employee) {
        employeeFacade.create(employee);
    }

    @Override
    public Employee findEmployee(int id) {
        return employeeFacade.find(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeFacade.edit(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeFacade.remove(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeFacade.findAll();
    }
}
