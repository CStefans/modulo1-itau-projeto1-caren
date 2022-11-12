package br.com.letscode.turmaitau.carro;

public class EncapsulamentoCarroMain {

    public static void main(String[] args) {
        Carro audi = new Carro(
                "Audi",
                "A1",
                "XYZ12345",
                "Branco",
                2020
        );

        audi.ligar();
        audi.acelerar();
        audi.acelerar();
        System.out.println("audi = " + audi);

        audi.desligar();
        System.out.println("audi = " + audi);

        Carro nissan = new Carro(
                "Nissan",
                "March",
                "Preto",
                2019);

        System.out.println("nissan = " + nissan);

        Carro gol = new Carro(
                "Volks",
                "Gol",
                "Preto",
                2022);

        System.out.println("gol = " + gol);
        /*  como o atributo marca esta estatico todos abaixo ficaram como Volks
        *   Ele nao pertence mais ao objeto e sim a classe
        */
        System.out.println("audi = " + audi);
        System.out.println("nissan = " + nissan);

        Carro.imprimirMarca();
        // como é private impedimos a alteracao do valor gol.setMarca("Fiat");
    }


}
