package com.company;

import java.util.ArrayList;

public class BankAccountOrdinary extends Bank implements BankAccount{
    private int id;
    private boolean active = true;
    private Customer customer;
    private int balance;
    //tipo = ordinario

    public BankAccountOrdinary(int id, Customer customer) {
        if (id >= 1000 && id <= 9999) {
            this.id = id;
            this.customer = customer;
            this.active = active;
            this.balance = 0;
            newBankAccount();
        } else {
            System.err.println("ID not valid");
        }
    }

    public void newBankAccount(){
        super.addBankAccount(this);
    }

    public void payment(){

    }

    public void withdrawal() {

    }

    public void cancelled(){
        this.active = false;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Customer = { " + customer +
                " }, Balance = " + balance;
    }
}
