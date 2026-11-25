package org.example.operacoes;

import java.util.Scanner;

public class Subtracao {
    public static void subtrair(Scanner t) {
        double total = 0;
        boolean primeiroN = true;

        System.out.println("Digite os valores para subtrair (ou 'sair' para encerrar");

        while (true) {
            String entrada = t.nextLine().trim();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                double valorAtual = Double.parseDouble(entrada.replace(",", "."));

                if (primeiroN) {
                    total = valorAtual;
                    primeiroN = false;
                } else {
                    double valorAnterior = total;
                    total -= valorAtual;
                    System.out.println(valorAnterior + " - " + valorAtual + " = " + total);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida! Digite um número ou 'Sair'.");
            }
        }
        System.out.println("Resultado final " + total + "\n");
    }
}
