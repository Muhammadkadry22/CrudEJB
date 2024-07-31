/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SessionLocal.java to edit this template
 */
package com.isfp.Services;

import com.isfp.Entities.Employee;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author mohamed kadry
 */
@Local
public interface EmployeeServiceLocal {
    
     void addEmployee(Employee employee);
    Employee findEmployee(int id);
    void updateEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
