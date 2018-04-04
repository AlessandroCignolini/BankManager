package com.company;

import java.util.ArrayList;

public class BankAccountAdvanced extends Bank implements BankAccount{
    private boolean active = true;
    private Customer customer;
    private int balance;
    //tipo = avanzato

    public BankAccountAdvanced(Customer customer) {
        this.customer = customer;
        this.active = active;
        this.balance = 0;
    }

    public void newBankAccount(){
        super.addBankAccount(this);
        System.out.println("Bank account added: " + this);
    }

    public void payment(){

    }

    public void withdrawal() {

    }

    public void cancelled(){

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Active = " + active +
                ", Customer = { " + customer
                + " }";
    }
}
