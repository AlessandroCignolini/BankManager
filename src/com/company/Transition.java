package com.company;

import java.util.Date;

public class Transition extends Bank{
    private int _number;
    private String _type;
    private Date _date = new Date();
    private int _balance;

    public Transition(int _number, String _type, Date _date, int _balance) {
        this._number = _number;
        this._type = _type;
        this._date = _date;
        this._balance = _balance;
    }

    public int get_number() {
        return _number;
    }

    public void set_number(int _number) {
        this._number = _number;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public int get_balance() {
        return _balance;
    }

    public void set_balance(int _balance) {
        this._balance = _balance;
    }

    @Override
    public String toString() {
        return "Transition{" +
                "_number=" + _number +
                ", _type='" + _type + '\'' +
                ", _date=" + _date +
                ", _balance=" + _balance +
                "} " + super.toString();
    }
}
