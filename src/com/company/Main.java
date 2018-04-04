package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void start(Bank Bank) {
        Scanner file = new Scanner(System.in);
        System.out.println("Choose what do you want to do:");
        System.out.println("1) read a file for execute the instructions");
        System.out.println("2) print all the customers");
        System.out.println("3) print all the bank accounts");
        System.out.print(">");
        String input = file.nextLine();
        if (input.equals("stop")){
            System.exit(0);
        }
        try {
            switch (Integer.parseInt(input)) {
                case 1: first(file, Bank);
                    break;
                case 2: second(file, Bank);
                    break;
                case 3: third(file, Bank);
                    break;
            }
        } catch (Exception e){
            System.err.println("Insert a valid number");
            start(Bank);
        }
    }

    public static void first(Scanner file, Bank Bank){
        try {
            System.out.println("Enter the file name without .txt (the default path is /tmp/):");
            String input = file.nextLine().toUpperCase();
            String path = "/tmp/" + input + ".txt";
            System.out.println("File to analyze: " + path);
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            char c = input.charAt(0);
            System.out.println(c);
            if (c == 'A') {
                while (line != null) {
                    StringTokenizer st = new StringTokenizer(line, "\t");

                    String date = st.nextToken();
                    System.out.print("Date: " + date + " | ");
                    String oType = st.nextToken();
                    System.out.print("Operation type: " + oType + " | ");
                    String number = st.nextToken();
                    System.out.print("Number of bank account: " + number + " | ");
                    String baType = st.nextToken();
                    System.out.print("Bank account type: " + baType + " | ");
                    String name = st.nextToken();
                    System.out.print("Customer of bank account: " + name);
                    System.out.println("");
                    line = br.readLine();

                    Customer Customer = new Customer(name, "Rossi");
                    Bank.addCustomer(Customer);
                    Bank.addBankAccount(new BankAccountOrdinary(Integer.parseInt(number), Customer));
                }
            }
                if (c == 'T') {
                    //TODO istruzioni per file di tipo T
                }
            } catch (FileNotFoundException e) {
                System.err.println("File not found");
            } catch (Exception E) {
                System.err.println("Something went wrong");
            }
            start(Bank);
        }

        public static void second(Scanner file, Bank Bank){
            try{
                System.out.println(Bank.get_customers());
            } catch (Exception E) {
                System.err.println("Something went wrong");
            }
            start(Bank);
        }

    public static void third(Scanner file, Bank Bank){
        try{
            System.out.println(Bank.get_bankAccounts());
        } catch (Exception E) {
            System.err.println("Something went wrong");
        }
        start(Bank);
    }

    public static void main(String[] args) throws Exception {
        Bank Bank = new Bank();
        start(Bank);
    }
}
