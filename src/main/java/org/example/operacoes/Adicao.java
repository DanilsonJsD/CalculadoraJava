package org.example.operacoes;

import java.util.Scanner;

public class Adicao {
    static double soma = 0;
    static double total = 0;
    static String entrada = "";
    public static void somar(Scanner t){
        soma = 0;
        while (true){
            entrada = t.nextLine();
            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            soma += Double.parseDouble(entrada);
            System.out.println(soma);
        }
        System.out.println(total);
    }
}
