package edu.ebac.generics;

public class Argo extends Carro{
    private String tracao;

    public Argo(String tracao, String modelo, Integer ano) {
        super(modelo,ano);
        this.tracao = tracao;
    }

    public void controleEstabilidade(){

    }

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public String toString() {
        return "Argo{" +"modelo='" + super.getModelo() + '\''+
                " tracao='" + tracao + '\'' +
                '}';
    }
}
