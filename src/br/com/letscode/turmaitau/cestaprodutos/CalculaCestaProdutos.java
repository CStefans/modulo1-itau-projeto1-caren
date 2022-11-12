package br.com.letscode.turmaitau.cestaprodutos;

import br.com.letscode.turmaitau.cestaprodutos.enums.TipoPreco;

import java.util.Scanner;

public class CalculaCestaProdutos {

    private final static int QTDE_MAX_PRODUTOS = 5;

    Scanner scanner;
    RecuperarDadosProduto recuperarDadosProduto = null;

    String[] nomesProdutos;
    Double[] precosProdutos;
    Integer qtdeProdutos;

    public CalculaCestaProdutos() {

        System.out.println("******* Cesta de Produtos *******");
        this.scanner = new Scanner(System.in);
        this.recuperarDadosProduto = new RecuperarDadosProduto(scanner);
        this.nomesProdutos = new String[5];

        //Explicacao aula
        //this.nomesProdutos[0] = "";
        //this.nomesProdutos[1] = "";
        //this.nomesProdutos[2] = "";
        //nomesProdutos[3] = "";
        //nomesProdutos[4] = "";
        //nomesProdutos[5] = ""; //ArrayIndexOutOfBoundsException

        this.precosProdutos = new Double[5];
        this.qtdeProdutos = Integer.parseInt("0");

    }

    public void recuperarDadosECalcular() {

        Boolean continuar = true;
        String letra;

        //while (this.qtdeProdutos < QTDE_MAX_PRODUTOS) {
        while (continuar) {

            this.nomesProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarNome();
            this.precosProdutos[qtdeProdutos] = recuperarDadosProduto.recuperarPreco();

            System.out.print("Adicionar novo produto? (S/N): ");
            letra = this.scanner.next();
            continuar = letra.equalsIgnoreCase("S");

            //usa o valor e depois soma
            qtdeProdutos++;

            //soma e depois usa o valor novo
            //++qtdeProdutos;
        }
        this.imprimeLista();
        this.calcularProdutoMaisCaro();
        this.calcularProdutoMaisBarato();
    }

    private void calcularProdutoMaisCaro() {

        int indexProdutoMaisCaro = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] > this.precosProdutos[indexProdutoMaisCaro]) {
                indexProdutoMaisCaro = i;
            }
        }

        this.imprimeProduto(indexProdutoMaisCaro, TipoPreco.CARO);

    }

    private void calcularProdutoMaisBarato() {

        int indexProdutoMaisBarato = 0;

        for (int i = 0; i < this.qtdeProdutos; i++) {
            if (this.precosProdutos[i] < this.precosProdutos[indexProdutoMaisBarato]) {
                indexProdutoMaisBarato = i;
            }
        }

        this.imprimeProduto(indexProdutoMaisBarato, TipoPreco.BARATO);
    }

    private void imprimeLista() {

        System.out.println("\nLista de Produtos");
        for (int i = 0; i < this.qtdeProdutos; i++) {
            System.out.printf("%s: - R$ %.2f \n",
                    this.nomesProdutos[i],
                    this.precosProdutos[i]);
        }
    }

    private void imprimeProduto(int index, TipoPreco tipoPreco) {

        System.out.printf("O produto mais %s da lista é %s - R$ %.2f \n",
                tipoPreco.name(),
                this.nomesProdutos[index],
                this.precosProdutos[index]);

    }


}
