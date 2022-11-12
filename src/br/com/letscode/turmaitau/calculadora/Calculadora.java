package br.com.letscode.turmaitau.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado = 0;
        String operacao = "x";
        String continuar = "s";

        do{
            System.out.println("\n*******Calculadora******");
            System.out.print("Valor 1 = ");
            numero1 = entrada.nextDouble();
            System.out.print("Valor 2 = ");
            numero2 = entrada.nextDouble();

            System.out.print("Escolha a operação:");
            operacao = entrada.next();

            switch(operacao){
                case "+":
                    resultado = new Somar().somar(numero1, numero2);
                    break;
                case "-":
                    resultado = new Subtrair().subtrair(numero1, numero2);
                    break;
                case "*":
                    resultado = new Multiplicar().multiplicar(numero1, numero2);
                    break;
                case "/":
                    resultado = new Dividir().dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente!");
            }
            System.out.printf("O resultado de %.2f %s %.2f = %.2f\n ",numero1,operacao,numero2,resultado);
            System.out.print("Continuar? (S/N): ");
            continuar = entrada.next();

        }while(continuar.toLowerCase().equals("s"));

    }
}
