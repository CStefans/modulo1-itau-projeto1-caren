package br.com.letscode.turmaitau.inicio;

public class TiposPrimitivosInteiros {

    final static int NUMERO_INT = 5;
    final static  String RESULTADO = "O resultado é ";

    public static void main(String[] args) {
        short numShort = 1;
        int numInt = 999999999;
        long numLong = 999999999;

        int soma = numInt + 25;

        System.out.println(RESULTADO + soma);
        somar(10,20);

        double resultado = 10 + Math.PI;
    }

    static void somar(int var1, int var2){
        int somaM = var1 + var2;
        System.out.println("somaM = " + somaM);
    }
}
