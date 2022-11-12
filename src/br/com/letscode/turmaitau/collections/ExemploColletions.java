package br.com.letscode.turmaitau.collections;

import java.util.*;


public class ExemploColletions {
    public static void main(String[] args) {
        /*
         * posso criar a collection e tirar e incluir o quanto eu quiser
         *
         */

        List list = new ArrayList();
        list.add("Adriano");
        list.add("Vladimir");
        list.add("Zaira");
        list.add("Carlas");
        list.add("Guilherme");

        System.out.println(list);

        //ordena a lista
        Collections.sort(list);
        System.out.println(list);

        Collection pessoas = new HashSet();
        pessoas.add(new Pessoa("Adriano"));
        pessoas.add(new Pessoa("Vladimir"));
        pessoas.add(new Pessoa("Zaira"));
        pessoas.add(new Pessoa("Carlas"));
        pessoas.add(new Pessoa("Guilherme"));
        pessoas.add(new Pessoa("Monica"));
        pessoas.add(new Pessoa("Monica"));

        System.out.println(pessoas);
        List pessoasList = Arrays.asList(pessoas.toArray());
        //Collections.sort(pessoas);
        System.out.println(pessoas);


    }
}
