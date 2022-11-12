package br.com.letscode.turmaitau.calcSalario;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalcSalarioScannerMain {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        CalcSalarioScannerMain calcSalarioScannerMain = new CalcSalarioScannerMain();

        while (true) {
            try {
                calcSalarioScannerMain.calcularSalario();
                //...
            } catch (NomeException e) {
                System.out.println("Erro de validacao de Nome: " + e.getMessage() + "\n" +
                        "Entre com os dados novamente.");
            } catch (CPFException e) {
                System.out.println("Erro de validacao de CPF: " + e.getMessage() + "\n" +
                            "Entre com os dados novamente.");
            } catch (ValidacaoException e) {
                System.out.println("Erro de validacao: " + e.getMessage() + "\n" +
                        "Entre com os dados novamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                calcSalarioScannerMain.entrada = new Scanner(System.in);
                System.out.println("Fechou recurso scanner");
            }
        }

    }

    private void calcularSalario() throws ValidacaoException, CPFException {

        System.out.println("Nome: ");
        String nome = entrada.nextLine();
        if (nome.isBlank()) {
            throw new NomeException("Nome é obrigatorio");
        }

        System.out.println("CPF: ");
        String cpf = entrada.nextLine();
        if (cpf.isBlank()) {
            throw new CPFException("CPF invalido");
        }

        System.out.println("Salario: ");
        BigDecimal salario = new BigDecimal(entrada.next());

        System.out.println("Dias trabalhados: ");
        int diasTrabalhados = Integer.parseInt(entrada.next());

        Funcionario funcionario = new Funcionario(nome, cpf, salario);

        BigDecimal salarioCalculado = funcionario.calcularSalario(diasTrabalhados);

        System.out.println("Funcionario: " + funcionario.toString());
        System.out.println("Salario: " + salarioCalculado);

        System.out.println("Sair (s/n)?: ");
        boolean sair = entrada.next().equalsIgnoreCase("s");
        if (sair) {
            System.exit(0);
        }


    }

}
