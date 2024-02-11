package edu.ebac.generics;

public class Onix extends Carro{
    private String tipoDeFarol;
    private String cambio;

    public Onix(String modelo, Integer ano, String cambio) {
        super(modelo, ano);
        this.cambio = cambio;
    }

    public String getTipoDeFarol() {
        return tipoDeFarol;
    }

    public void setTipoDeFarol(String tipoDeFarol) {
        this.tipoDeFarol = tipoDeFarol;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

//    @Override
//    public String toString() {
//        return "Onix{" +
//                "cambio='" + cambio + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Onix{ modelo= '" +super.getModelo()+ '\''+
        " cambio='" + cambio + '\'' +
                '}';
    }
}
