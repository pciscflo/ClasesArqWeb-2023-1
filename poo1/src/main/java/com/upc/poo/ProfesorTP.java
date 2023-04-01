package com.upc.poo;

public class ProfesorTP extends Profesor{
    private Integer horas;
    private Double tarifaHora;
    public ProfesorTP(Integer codigo, String nombre, String dni, Integer horas, Double tarifaHora) {
        super(codigo, nombre, dni);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    public Double calcularSueldo(){
        return this.horas*this.tarifaHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(Double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return "ProfesorTP{" +
                "horas=" + horas +
                ", tarifaHora=" + tarifaHora +
                "} " + super.toString();
    }
}
