package com.company;

import java.util.ArrayList;

public class Customer extends Bank{
    private String _name;
    private String _surname;
    private ArrayList<BankAccount> _list = new ArrayList<BankAccount>();

    public Customer(String _name, String _surname) {
        this._name = _name;
        this._surname = _surname;
    }

    public void newBankAccount(BankAccount ba){
        _list.add(ba);
        System.out.println("Bank account added successfully");
    }

    public void removeBankAccount(BankAccount ba){
        _list.remove(ba);
        System.out.println("Bank account removed successfully");
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    @Override
    public String toString() {
        return "Name = " + _name +
                ", Surname = " + _surname;
    }
}
