package edu.ebac.generics;

public abstract class Carro {
    private String modelo;
    private Integer ano;
    private String cor;
    private Integer velocidade;

    public Carro(String modelo, Integer ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){

    }
    public void desligar(){

    }
    public void frear(){

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
