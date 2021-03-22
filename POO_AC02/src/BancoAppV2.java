/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class BancoAppV2 {

    public static void mostrarInfo(BankAccount[] contas) {
        System.out.println("\nContas de todos os clientes:");
        for (int i = 0; i < contas.length; i++) {
            System.out.println("[" + i + "]" + contas[i].toString());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BankAccount[] contas = new BankAccount[5];
        contas[0] = new BankAccount("Marcos", 1000.00);
        contas[1] = new BankAccount("Júlia", 250.00);
        contas[2] = new BankAccount("João", 2500.00);
        contas[3] = new BankAccount("Roberto", 3000.00);
        contas[4] = new BankAccount("Janaína", 4500.00);

        mostrarInfo(contas);
    }
}
