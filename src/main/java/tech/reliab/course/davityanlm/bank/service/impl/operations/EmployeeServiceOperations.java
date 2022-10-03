package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.Employee;
import tech.reliab.course.davityanlm.bank.service.impl.EmployeeService;

public class EmployeeServiceOperations implements EmployeeService {
      public void delete(Employee employee) {
        employee.setId(null);
        employee.setBank(null);
        employee.setOnlineOrNot(null);
        employee.setMayToGiveCredit(null);
        employee = null;
    }
}
