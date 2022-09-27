package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.BankService;

import java.util.Random;

public class Bank implements BankService {
    private Short id;
    private String name;
    protected Short officeQty;
    protected Integer atmQty;
    protected Integer employeeQty;
    protected Long clientQty;
    private Byte rate;
    protected Long moneyQty;
    private Float percent;

    public Bank(short id, String name){
        /* Variables completed by parameters */
        this.id = id;
        this.name = name;

        /* Default variables */
        this.officeQty = 0;
        this.atmQty = 0;
        this.employeeQty = 0;
        this.clientQty = (long)0;

        /* Generate bank rating (var rate) */
        Random random = new Random();
        int i = random.nextInt(101);
        this.rate = (byte)i;

        this.moneyQty = (long)i * 10000;

        /* Generate bank interest rate (var percent)*/
        i = random.nextInt(21);
        float percentProccesing = 1 - (float)(rate * 0.01);
        this.percent = i * percentProccesing + (float)4.01;
        if (this.percent > 20) {this.percent = (float)20.0;}
    }


    @Override
    public void print() {
        if (this.id == null){
            System.out.println("Кажется нет связи с банком, возможно вы его удалили\n" +
                    "Проверьте корзину :))");
            return;
        }
        System.out.println("\nID Банка: " + this.id);
        System.out.println("Название: " + this.name);
        System.out.println("Кол-во офисов: " + this.officeQty);
        System.out.println("Кол-во банкоматов: " + this.atmQty);
        System.out.println("Кол-во сотрудников: " + this.employeeQty);
        System.out.println("Кол-во клиентов: " + this.clientQty);
        System.out.println("Рейтинг: " + this.rate + " из 100");
        System.out.println("Капитал: " + this.moneyQty + " рублей");
        System.out.format("Процентная ставка: %.2f %%", this.percent);
    }

    @Override
    public void addAtm() {
        this.atmQty++;
    }

    @Override
    public void addOffice() {
        this.officeQty++;
    }

    @Override
    public void addEmployee() {
        this.employeeQty++;
    }

    @Override
    public void addClient() {
        this.clientQty++;
    }


    @Override
    public void delete() {
        this.id = null;
        this.name = null;
        this.officeQty = null;
        this.atmQty = null;
        this.employeeQty = null;
        this.clientQty = null;
        this.rate = null;
        this.moneyQty = null;
        this.percent = null;
    }
}
