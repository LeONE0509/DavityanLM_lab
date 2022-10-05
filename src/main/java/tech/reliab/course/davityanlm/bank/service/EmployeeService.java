package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.Employee;

/** Интерфейс операций, связанных с классом {@link Employee}
 * @version 0.1 */
public interface EmployeeService {

    /** Процедура добавления зарплаты сотруднику.
     * @param employee сотрудник, которому добавляется зарплата
     * @param salary сумма, которую необходимо добавить к зарплате */
    void addSalary(Employee employee, Integer salary);

    /** Процедура удаления сотрудника. <br>
     * Объекту присваивается значение <b>null</b>
     * @param employee сотрудник, которого следует удалить */
    void delete(Employee employee);

}
