package com.upc.poo;

public class ProfesorTC extends Profesor{
    private Double sueldoBasico;
   private Double afp;
    public ProfesorTC(Integer codigo, String nombre, String dni, Double sueldoBasico, Double afp) {
        super(codigo, nombre, dni);
        this.sueldoBasico = sueldoBasico;
        this.afp = afp;
    }
    public Double calcularSueldo(){
        return this.sueldoBasico - afp*this.sueldoBasico;
    }

    public boolean validar(){
        if(this.sueldoBasico<0 && this.afp <0){
            return false;
        }
        return true;
    }
    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getAfp() {
        return afp;
    }

    public void setAfp(Double afp) {
        this.afp = afp;
    }

    @Override
    public String toString() {
        return "ProfesorTC{" +
                "sueldoBasico=" + sueldoBasico +
                ", afp=" + afp +
                "} " + super.toString();
    }
}
