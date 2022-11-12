package br.com.letscode.turmaitau.carro;

public class CarroMain2 {

    public static void main(String[] args) {
        Carro golBranco = new Carro();
     //   golBranco.setModelo(new String("Gol"));

        Carro golPreto = new Carro();
       // golPreto.setModelo("Gol");

        //a Super irá imprimir a classe mae, ou seja endereco de memoria
        golBranco.imprimirToString();
        golPreto.imprimirToString();

        if(golPreto.equals(golBranco)) { //comparacao de objetos
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
        if(golPreto == golBranco) { // comparacao de referencia de memoria
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
        if(golPreto.toString().equals(golBranco.toString())) { // comparacao de objetos
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
        }
        if (golBranco instanceof Carro){
            System.out.println("GolBranco é um carro");
        }
        if (golPreto instanceof Carro){
            System.out.println("GolPreto é um carro");
        }
        if (golBranco instanceof Object){
            System.out.println("GolBranco é um Object");
        }
        if (golPreto instanceof Object){
            System.out.println("GolPreto é um Object");
        }
        //TODA CLASSE é
        String teste = "Teste";
        if (teste instanceof Object){
            System.out.println("Teste é um Object");
        }
        //aqui consigo entrar na estrutura que a classe tem
        teste.getClass();

    }
}
