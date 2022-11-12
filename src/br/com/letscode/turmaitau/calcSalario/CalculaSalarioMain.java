package br.com.letscode.turmaitau.calcSalario;

import br.com.letscode.turmaitau.utils.ImprimirString;

import java.math.BigDecimal;

public class CalculaSalarioMain {

    public static void main(String[] args) throws Exception {
        /* Funcionário com métodos sobrescritos */
        Funcionario funcionario = new Funcionario("Caren", "12345678900", BigDecimal.valueOf(1500));

        BigDecimal salarioCalculado = funcionario.calcularSalario(20);

        ImprimirString.imprimir("Funcionario: " + funcionario.toString());

        ImprimirString.imprimir("Salario: " + salarioCalculado);

        /* Funcionário2 SEM métodos sobrescritos */

        Funcionario2 funcionario2 = new Funcionario2("Ralph", "12345678900", BigDecimal.valueOf(1500));

        BigDecimal salarioCalculado2 = funcionario2.calcularSalario(20);

        ImprimirString.imprimir("Funcionario2: " + funcionario2.toString());

        ImprimirString.imprimir("Salario2: " + salarioCalculado);


    }

}
