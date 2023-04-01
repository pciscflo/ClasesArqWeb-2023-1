package com.upc.poo;

import java.util.ArrayList;
import java.util.List;

public class Administrado {
    private List<Profesor> profesores = new ArrayList<>();
    public void adicionar(Profesor profesor){
        profesores.add(profesor);
    }
    public List<Profesor> listado(){
        return this.profesores;
    }
}
