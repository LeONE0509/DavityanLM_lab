package tech.reliab.course.toropchinda.bank.entity;

import tech.reliab.course.toropchinda.bank.service.impl.BankService;

import java.util.Random;

public class Bank implements BankService {
    private short id;
    private String name;
    protected short officeQty;
    protected int atmQty;
    protected int employeeQty;
    protected long clientQty;
    private byte rate;
    private long moneyQty;
    private float percent;

    public Bank(short id, String name){
        /* Variables completed by parameters */
        this.id = id;
        this.name = name;

        /* Default variables */
        this.officeQty = 0;
        this.atmQty = 0;
        this.employeeQty = 0;
        this.clientQty = 0;

        /* Generate bank rating (var rate) */
        Random random = new Random();
        int i = random.nextInt(101);
        this.rate = (byte)i;

        this.moneyQty = (long)i * 10000;

        /* Generate bank interest rate (var percent)*/
        i = random.nextInt(21);
        float percentProccesing = 1 - (rate/100);
        this.percent = i * percentProccesing;
    }


    @Override
    public void print() {
        System.out.println("ID Банка: " + this.id);
        System.out.println("Название: " + this.name);
        System.out.println("Кол-во офисов: " + this.officeQty);
        System.out.println("Кол-во банкоматов: " + this.atmQty);
        System.out.println("Кол-во сотрудников: " + this.employeeQty);
        System.out.println("Кол-во клиентов: " + this.clientQty);
        System.out.println("Рейтинг: " + this.rate);
        System.out.println("Капитал: " + this.moneyQty);
        System.out.println("Процентная ставка: " + this.percent);
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
        this.id = Short.parseShort(null);
        this.name = null;
        this.officeQty = Short.parseShort(null);
        this.atmQty = Integer.parseInt(null);
        this.employeeQty = Integer.parseInt(null);
        this.clientQty = Long.parseLong(null);
        this.rate = Byte.parseByte(null);
        this.moneyQty = Long.parseLong(null);
        this.percent = Float.parseFloat(null);
    }
}
