package com.gsoft.injection;

public class SinInyeccion {

    private Programador programador;

    public SinInyeccion(Programador programador) {
        programador = new Programador("gustavo");
    }
}
