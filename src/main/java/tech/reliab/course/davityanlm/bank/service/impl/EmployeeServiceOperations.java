package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.Employee;
import tech.reliab.course.davityanlm.bank.service.EmployeeService;

public class EmployeeServiceOperations implements EmployeeService {
      public void delete(Employee employee) {
        employee.setId(null);
        employee.setBank(null);
        employee.setOnlineOrNot(null);
        employee.setMayToGiveCredit(null);
        employee = null;
    }
}
