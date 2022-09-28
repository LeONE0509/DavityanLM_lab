package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.EmployeeService;

import java.util.Date;

public class Employee implements EmployeeService {
    private Integer id;
    private String fullName;
    private Date birthDate;
    private String post;
    private Bank bank;
    private Boolean onlineOrNot;
    private BankOffice bankOffice;
    private Boolean mayToGiveCredit;
    private Integer salary;

    public Employee(String fullName, Date birthDate, Bank bank, BankOffice bankOffice,
                    String post){
        /* Переменные, которые присваиваются параметрами */
        bank.addEmployee();
        this.id = bank.employeeQty;
        this.fullName = fullName;
        this.birthDate = birthDate;

        /* Переменные, получившие значения по умолчанию */
        this.post = post;
        this.bank = bank;
        this.onlineOrNot = false;
        this.bankOffice = bankOffice;
        this.mayToGiveCredit = false;
        this.salary = 10000;
    }


    @Override
    public void print() {
        /* Обработка исключительной ситуации */
        if(this.id == null){
            System.out.println("\nКажется данного сотрудника уволили");
            System.out.println("ФИО: " + this.fullName);
            System.out.println("Дата рождения" + birthDate);
            System.out.println("Работал в " + this.bankOffice.name);
            System.out.println("Должность: " + this.post);
            System.out.println("Зарплата: " + this.salary);
            return;
        }
        System.out.println("\nID Сотрудника: "  + this.id);
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Работает в " + this.bankOffice.name);
        System.out.println("Возможность выдать кредит: " + this.mayToGiveCredit);
        System.out.println("Работает ли онлайн: " + this.onlineOrNot);
        System.out.println("Должность: " + this.post);
        System.out.println("Зарплата: " + this.salary);

    }

    @Override
    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    @Override
    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void setOnlineOrNot(Boolean onlineOrNot) {
        this.onlineOrNot = onlineOrNot;
    }

    @Override
    public void setMayToGiveCredit(Boolean mayToGiveCredit) {
        this.mayToGiveCredit = mayToGiveCredit;
    }

    @Override
    public void delete() {
        this.id = null;
        this.bank = null;
        this.onlineOrNot = null;
        this.mayToGiveCredit = null;
    }
}
