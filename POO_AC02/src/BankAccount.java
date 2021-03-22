/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class BankAccount {

    private static int lastAccountNumber = 1000; // Último número utilizado de conta
    private String owner;
    private int accountNumber; // número da conta
    private double balance; // saldo da conta

    private static String checkName(String owner) {
        if (a.contains("^[a-Z]")) {
            System.out.println();
        } else {
            System.out.println();
        }
        return null;

    }

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, double balance) {
        accountNumber = lastAccountNumber++;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }

    public void withDraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Conta de " + owner + " - Saldo de R$ " + balance;
    }

    void deposito(double saque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void transfer(double valor, BankAccount target) {
        this.balance = this.balance - valor;
        target.balance = target.balance + valor;
    }
}
