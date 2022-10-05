package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Employee;
import tech.reliab.course.davityanlm.bank.service.EmployeeService;

/** Класс-реализация операций сотрудника, реализует интерфейс сотрудника {@link EmployeeService} <br>
 * Реализуется бизнес-логика*/
public class EmployeeServiceOperations implements EmployeeService {

    public void addSalary(Employee employee, Integer sum){
      employee.setSalary(employee.getSalary() + sum);
    }

    public void delete(Employee employee) {
     employee = null;
}
}
