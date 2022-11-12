package br.com.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class RecuperarDadosProduto {

    public Scanner entrada = null;

    public RecuperarDadosProduto(Scanner entrada) {
        this.entrada = entrada;
    }

    public String recuperarNome() {
        System.out.print("Digite o nome do produto: ");
        String nome = entrada.next(); //NullPointerException
        return nome;
    }

    public Double recuperarPreco() {
        System.out.print("Digite o valor do produto: ");
        Double valor = entrada.nextDouble();
        return valor;
    }

}