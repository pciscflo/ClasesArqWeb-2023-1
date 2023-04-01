package org.example;

import com.upc.poo.Administrado;
import com.upc.poo.Profesor;
import com.upc.poo.ProfesorTC;
import com.upc.poo.ProfesorTP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfesorTC ptc1 = new ProfesorTC(100,"Pepe","88888888",2600.0,0.12);
        ProfesorTC ptc2 = new ProfesorTC(200,"Luis","77777777",1600.0,0.11);
        ProfesorTC ptc3 = new ProfesorTC(300,"Karen","66666666",1800.0,0.13);
        ProfesorTP ptp1 = new ProfesorTP(400,"Lorenzo","99999999",10,100.0);
        Administrado administrado = new Administrado();
        administrado.adicionar(ptc1);
        administrado.adicionar(ptc2);
        administrado.adicionar(ptc3);
        administrado.adicionar(ptp1);

        for(Profesor profesor:administrado.listado()){
            System.out.println(profesor.toString());
        }


    }
}