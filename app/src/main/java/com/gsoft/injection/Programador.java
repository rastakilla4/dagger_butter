package com.gsoft.injection;

public class Programador {

    private String nombre;
    private static int cont=0;

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    public Programador(){
        cont++;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
