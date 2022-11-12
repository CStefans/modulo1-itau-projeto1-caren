package br.com.letscode.turmaitau.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String continuar = "s";

        do{
            System.out.println("\n*******Tabuada******");
            System.out.print("Gerar tabuada do nÃºmero = ");
            numero = entrada.nextInt();

            tabuada(numero);

            System.out.print("Continuar? (S/N): ");
            continuar = entrada.next();

        }while(continuar.toLowerCase().equals("s"));

    }
    public static void tabuada(int n){
        System.out.printf("TABUADA DO NUMERO %d \n",n);
        for(int t=0; t <= 10; t++){
            System.out.printf(" %d * %d = %d \n",n,t,n*t);
        }
    }
}

