package org.example;

import java.util.Scanner;

import static org.example.operacoes.Adicao.somar;
import static org.example.utilidades.Menu.exibirMenu;

//Banco simples: Conta, ContaCorrente e ContaPoupanca com herança. Saque,
// depósito e transferência, com uma exceção própria para saldo insuficiente.
public class Main {
    public static void main(String[] args) {

        exibirMenu();

        Scanner t = new Scanner(System.in);
        int op;
        do {
            System.out.print("DIGITE O NÚMERO DA OPERAÇÃO: ");
            op = t.nextInt();
            t.nextLine();
            switch (op) {
                case 1:
                    somar(t);
                    break;
                case 2:
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    break;
            }
        } while (op != 6);

        t.close();
    }
}