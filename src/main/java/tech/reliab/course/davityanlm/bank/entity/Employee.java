package tech.reliab.course.davityanlm.bank.entity;


import tech.reliab.course.davityanlm.bank.service.impl.EmployeeServiceOperations;

import java.time.LocalDate;

public class Employee extends EmployeeServiceOperations {
    private Integer id;
    private String fullName;
    private LocalDate birthDate;
    private String post;
    private Bank bank;
    private Boolean onlineOrNot;
    private BankOffice bankOffice;
    private Boolean mayToGiveCredit;
    private Integer salary;

    public Employee(Integer id, String fullName, LocalDate birthDate, Bank bank, BankOffice bankOffice,
                    String post){

        setId(id);
        setFullName(fullName);
        setBirthDate(birthDate);
        setPost(post);
        setBank(bank);
        setOnlineOrNot(false);
        setBankOffice(bankOffice);
        setMayToGiveCredit(false);
        setSalary(0);
    }

    @Override
    public String toString(){

        if (getId() == null){
            return "\nСотрудник{" +
                    "\nКажется данного сотрудника уволили" +
                    "\nФИО: " + getFullName() +
                    "\nДата рождения: " + getBirthDate() +
                    "\nРаботал в " + getBankOffice().getName() +
                    "\nДолжность: " + getPost() +
                    "\nЗарплата: " + getSalary() +
                    "\n}";
        }
        return "\nСотрудник{" +
                "\nID сотрудника: " + getId() +
                "\nФИО: " + getFullName() +
                "\nДата рождения: " + getBirthDate() +
                "\nРаботает в " + getBankOffice().getName() +
                "\nВозможность выдать кредит: " + getMayToGiveCredit() +
                "\nРаботает ли онлайн: " + getOnlineOrNot() +
                "\nДолжность: " + getPost() +
                "\nЗарплата: " + getSalary() +
                "\n}";
    }

    public Integer getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public String getPost() {
        return this.post;
    }

    public Bank getBank() {
        return this.bank;
    }

    public Boolean getOnlineOrNot() {
        return this.onlineOrNot;
    }

    public BankOffice getBankOffice() {
        return this.bankOffice;
    }

    public Boolean getMayToGiveCredit() {
        return this.mayToGiveCredit;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setOnlineOrNot(Boolean onlineOrNot) {
        this.onlineOrNot = onlineOrNot;
    }

    public void setBankOffice(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    public void setMayToGiveCredit(Boolean mayToGiveCredit) {
        this.mayToGiveCredit = mayToGiveCredit;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

}
