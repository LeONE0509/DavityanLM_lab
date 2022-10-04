package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.Employee;

public interface EmployeeService {

    void addSalary(Employee employee, Integer salary);
    void delete(Employee employee);

}
