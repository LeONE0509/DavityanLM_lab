package tech.reliab.course.davityanlm.bank.service.impl.operations;

import tech.reliab.course.davityanlm.bank.entity.Employee;
import tech.reliab.course.davityanlm.bank.service.impl.EmployeeService;

public interface EmployeeServiceOperations extends EmployeeService {

    public default void print(Employee employee) {
        /* Обработка исключительной ситуации */
        if(employee.getId() == null){
            System.out.println("\nКажется данного сотрудника уволили");
            System.out.println("ФИО: " + employee.getFullName());
            System.out.println("Дата рождения" + employee.getBirthDate());
            System.out.println("Работал в " + employee.getBankOffice().getName());
            System.out.println("Должность: " + employee.getPost());
            System.out.println("Зарплата: " + employee.getSalary());
            return;
        }
        System.out.println("\nID Сотрудника: "  + employee.getId());
        System.out.println("ФИО: " + employee.getFullName());
        System.out.println("Работает в: " + employee.getBankOffice().getName());
        System.out.println("Возможность выдать кредит: " + employee.getMayToGiveCredit());
        System.out.println("Работает ли онлайн: " + employee.getOnlineOrNot());
        System.out.println("Должность: " + employee.getPost());
        System.out.println("Зарплата: " + employee.getSalary());

    }

    public default void delete(Employee employee) {
        employee.setId(null);
        employee.setBank(null);
        employee.setOnlineOrNot(null);
        employee.setMayToGiveCredit(null);
    }
}
