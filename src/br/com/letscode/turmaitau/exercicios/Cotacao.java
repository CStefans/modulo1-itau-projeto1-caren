package br.com.letscode.turmaitau.exercicios;

import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cotacao;
        double montante;
        double reais;
        String continuar;

        do{
            System.out.println("\n*******Cotação******");
            System.out.print("Informe valor a ser convertido US$ = ");
            montante = entrada.nextDouble();

            System.out.print("Informe cotação do dia - US$ 1.00 = R$ ");
            cotacao = entrada.nextDouble();

            reais = conversao(montante,cotacao);
            System.out.printf("O valor em reais é R$ %.2f \n",reais);

            System.out.print("Continuar? (S/N): ");
            continuar = entrada.next();

        }while(continuar.equalsIgnoreCase("s"));

    }

    public static double conversao(double n1, double n2){

        return n1*n2;
    }

}
