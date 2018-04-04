package com.company;

public interface BankAccount {  //TODO integrare id dei cc che si incrementa all'aggiunta, e diminuisce alla eliminazione
    public void newBankAccount();
    public void payment();
    public void withdrawal();
    public void cancelled();
}
