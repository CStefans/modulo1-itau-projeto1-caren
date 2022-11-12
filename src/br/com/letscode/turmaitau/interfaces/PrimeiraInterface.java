package br.com.letscode.turmaitau.interfaces;

import java.io.Serializable;

public interface PrimeiraInterface extends Serializable, Comparable {
    /* nao pode ser instanciada
     * interfaces soh possuem metodos abstratos como default
     *  soh pode extender outra interface
     *  metodo dentro de uma interface obrigatoriamente é publico
     * a interface nao pode ter atributos
     * facilidade de manutencao e crescer o pgm sem quebrar oq ja ta implementado
     * é criado uma camada como se fosse uma proteção
     */

    void teste();

    default String imprimirOla(){
        return "Olá Mundo!";
    }

}
