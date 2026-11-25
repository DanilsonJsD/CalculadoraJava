package org.example.operacoes;

import java.util.Scanner;

public class Adicao {
    public static void somar(Scanner t){
        double total = 0;
        boolean primeiroN = true;

        System.out.println("Digite os valores para somar (ou 'sair' para encerrar):");

        while (true){
            String entrada = t.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            try {
                double valoratual = Double.parseDouble(entrada.replace(",", "."));

                if (primeiroN){
                    total = valoratual;
                    primeiroN = false;
                }else {
                    double totalAnterior = total;
                    total +=valoratual;
                    System.out.println(totalAnterior + " + " + valoratual + " + " + total);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número ou 'sair'.");
            }
        }
        System.out.println("Resultado final " + total + "\n");
    }
}
