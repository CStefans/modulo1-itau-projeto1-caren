package br.com.letscode.turmaitau.calcSalario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Funcionario2 {

    private String nome;
    private String cpf;
    private BigDecimal salarioBase;

    public Funcionario2(String nome, String cpf, BigDecimal salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public BigDecimal calcularSalario(int diasTrabalhados) throws ValidacaoException {

        if (diasTrabalhados <= 0) {
            throw new ValidacaoException("9991", "Dias trabalhados devem ser maiores que zero.");
        }

        BigDecimal salarioCalculado =
                salarioBase.divide(BigDecimal.valueOf(30), 4, RoundingMode.HALF_EVEN)
                        .multiply(BigDecimal.valueOf(diasTrabalhados))
                        .setScale(2, RoundingMode.HALF_EVEN);

        return salarioCalculado;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

}
