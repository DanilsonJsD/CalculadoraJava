package org.example;

import java.util.Scanner;

//Banco simples: Conta, ContaCorrente e ContaPoupanca com herança. Saque,
// depósito e transferência, com uma exceção própria para saldo insuficiente.
public class Main {
    public static void main(String[] args) {

        System.out.println("\nCALCULADORA BÁSICA - Escolha uma operação");
        System.out.println("=========================");
        System.out.println("|| 1 || ADIÇÃO.        ||");
        System.out.println("|| 2 || SUBTRAÇÃO.     ||");
        System.out.println("|| 3 || MULTIPLICAÇÃO. ||");
        System.out.println("|| 4 || DIVISÃO        ||");
        System.out.println("|| 5 || MENU           ||");
        System.out.println("|| 6 || FECHAR         ||");
        System.out.println("=========================\n");

        Scanner t = new Scanner(System.in);
        int op;
        double soma;
        do {
            System.out.print("DIGITE O NÚMERO DA OPERAÇÃO: ");
            op = t.nextInt();
            switch (op) {
                case 1:
                    System.out.println("INSIRA OS VALORES PARA SOMAR");
                    System.out.println("INSIRA 000 PARA SAIR");
                   soma = t.nextDouble();
                    System.out.println(soma);
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
        } while (op <= 5);
    }
}