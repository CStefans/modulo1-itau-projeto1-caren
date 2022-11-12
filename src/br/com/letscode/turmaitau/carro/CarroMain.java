package br.com.letscode.turmaitau.carro;

public class CarroMain {

    public static void main(String[] args) {

        Carro audi = new Carro(
                "Audi",
                "A1",
                "XYZ12345",
                "Branco",
                2020
        );

        Carro nissan = new Carro(
                "Nissan",
                "March",
                "Preto",
                2019);

        nissan.acelerar();
        nissan.acelerar();

        System.out.println("Audi = " + audi);
        System.out.println("Nissan = " + nissan);

        //audi.setModelo("A2");
        //nissan.setModelo("Versa");

        System.out.println("Audi = " + audi);
        System.out.println("Nissan = " + nissan);

        System.out.println("audi = nissan? --> " + nissan.equals(audi));

        String modeloAudi = "Audi";
        String modeloNissan = "Audi";

        /*  equals nao é igual ao "==" -
         *  aqui ficou igual pois a String nao foi reInstanciada entao ficou duas variaveis apontando pra mesma area de memoria
         *  Equals compara valor e "==" compara objetos */
        System.out.println("Modelo Audi = Modelo Nissan ? -->" + modeloAudi.equals(modeloNissan));
        System.out.println("Modelo Audi = Modelo Nissan ? -->" + (modeloAudi==modeloNissan));

        /*  A nova alocação de memória deveria ser diferente para que o == talvez mude
         *  Nao é recomendado comparar Objetos */
        Carro golBranco = new Carro();
        //golBranco.setModelo("Gol");
        Carro golPreto = new Carro();
        //golPreto.setModelo(new String("Gol"));

        System.out.println("Modelo golBranco = Modelo golPreto ? -->" + golPreto.getModelo().equals(golBranco.getModelo()));
        System.out.println("Modelo golBranco = Modelo golPreto ? -->" + (golPreto.getModelo() == golBranco.getModelo()));

        //Integer i1 = 1;
        //Integer ii1 = new Integer("1");
        //System.out.println("equals -->" + i1.equals(ii1));
        //System.out.println("== -->" + (i1.intValue()==ii1.intValue()));
    }


}
