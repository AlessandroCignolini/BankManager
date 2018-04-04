package com.company;

import java.util.ArrayList;

public class Bank{
    private ArrayList<Customer> _customers = new ArrayList<Customer>();
    private ArrayList<BankAccount> _bankAccounts = new ArrayList<BankAccount>();

    public Bank() {
        this._customers = _customers;
        this._bankAccounts = _bankAccounts;
    }

    public void addCustomer(Customer c){
        System.out.println("Customer to add: " + c);
        _customers.add(c);
        System.out.println("Customer added successfully");
    }

    public void removeCustomer(int i){
        _customers.remove(i);
        System.out.println("Customer removed successfully");
    }
    public void addBankAccount(BankAccount b){
        System.out.println("Bank account to add: " + b);
        _bankAccounts.add(b);
        System.out.println("Bank account added successfully");
    }

    public void removeBankAccount(int i) {
        _bankAccounts.get(i).cancelled();
        System.out.println("Bank account removed successfully");
    }

    public ArrayList<Customer> get_customers() {
        ArrayList<Customer> result = new ArrayList<Customer>();
        for (int i = 0; i < _customers.size(); i++){
            result.add(_customers.get(i));
        }
        return result;
    }

    public ArrayList<BankAccount> get_bankAccounts() {
        ArrayList<BankAccount> result = new ArrayList<BankAccount>();
        for (int i = 0; i < _bankAccounts.size(); i++) {
            result.add(_bankAccounts.get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return "Bank { " +
                "customers = " + _customers +
                ", bankAccounts = " + _bankAccounts + " }";
    }
}
