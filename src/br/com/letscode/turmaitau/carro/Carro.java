package br.com.letscode.turmaitau.carro;

import java.util.Objects;

public class Carro {

     /*
    *   Modificadores de acesso de variaveis
    *   public
    *   private
    *   protected - apenas classes filhas enxergam os protected das pais
    *   default
    * */
    private static String marca;
    private String modelo;
    private String placa;
    private String cor;

    //Qd eu uso Integer (a classe) e nao inicializo minha variável ela é um objeto nulo.
    private Integer anoFabricacao;
    private boolean ligado;
    //qd eu utilizo o int (primitivo) mesmo que eu nao inicialize ele fica 0
    private int velocidade;

    /* Construtor Carro */
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa, String cor, Integer anoFabricacao){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setAnoFabricacao(anoFabricacao);
    }
    /*  Carro Zero */
    public Carro(String marca, String modelo, String cor, Integer anoFabricacao){
        this(marca, modelo,"", cor, anoFabricacao);
    }

    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
        this.velocidade = 0;
    }

    void acelerar(){
        if(ligado) {
            this.velocidade = this.velocidade + 10;
        }
    }

    void imprimirToString(){
        System.out.println("this = "+ this.toString());
        System.out.println("super = "+ super.toString());
        System.out.println("Hash this = "+ this.hashCode());
        System.out.println("Hash super = "+ super.hashCode());
    }

    //  o estado do seu objeto no estado String
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", anoFabricacao=").append(anoFabricacao);
        sb.append(", ligado=").append(ligado);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }

    //  o estado do seu objeto no estado hash
    @Override
    public int hashCode(){
        return Objects.hash(marca, modelo, placa, cor, anoFabricacao);
    }

    //  Posso somente digitar equals pra gerar o Override uso o Wizard e seleciono os campos que quero
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca,carro.marca) && Objects.equals(modelo,carro.modelo) && Objects.equals(placa,carro.placa) && Objects.equals(marca,carro.cor) && Objects.equals(anoFabricacao,carro.anoFabricacao);
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && (placa.length() < 7 || placa.length() == 8 ) ){
            this.placa = placa;
        }
    }

    public String getCor() {
        if (cor == null){
            cor = "";
        }
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null){
            cor = "";
        }
        this.cor = cor.toLowerCase();
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    private void setAnoFabricacao(Integer anoFabricacao) {
        if (anoFabricacao != null && anoFabricacao > 1950) {
            this.anoFabricacao = anoFabricacao;
        }
    }

    public static void imprimirMarca(){
        System.out.println("marca = " + marca);
    }
}
