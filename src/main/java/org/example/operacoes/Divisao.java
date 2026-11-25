package org.example.operacoes;

import java.util.Scanner;

public class Divisao {
    public static void dividir(Scanner t) {
        double total = 0;
        boolean primeiroN = true;

        System.out.println("Digite os valores que deseja dividir (ou 'sair' para encerrar ");

        while(true){
            String entrada = t.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            
        }
    }
}
