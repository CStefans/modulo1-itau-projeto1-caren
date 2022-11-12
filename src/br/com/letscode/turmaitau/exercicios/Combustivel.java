package br.com.letscode.turmaitau.exercicios;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas;
        double kms;
        double d = 0;
        double litros_usados = 0;

        String continuar = "s";

        do{
            System.out.println("\n*******Calculo Combustivel******");
            System.out.print("Tempo de viagem (em horas) = ");
            horas = entrada.nextInt();
            System.out.print("Velocidade mÃ©dia (em KMs) = ");
            kms = entrada.nextDouble();

            d = distancia(horas,kms);
            litros_usados = litros(d);

            imprimir(horas,kms,d,litros_usados);

            System.out.print("Continuar? (S/N): ");
            continuar = entrada.next();

        }while(continuar.toLowerCase().equals("s"));

    }

    private static void imprimir(int minutos, double kms, double d, double litros_usados) {
        System.out.println("******* Calculo CombustÃ­vel *******");
        System.out.printf("\nVelocidade MÃ©dia =  %.2f\nTempo gasto = %d\nDistÃ¢ncia Percorrida = %.2f\nQtdade de litros utilizados = %.2f\n",kms,minutos,d,litros_usados);
    }

    private static double litros(double distancia) {
        double litros = distancia/12;
        return litros;
    }

    public static double distancia(int minutos, double kms){
        double distancia = minutos*kms;
        return distancia;
    }
}

