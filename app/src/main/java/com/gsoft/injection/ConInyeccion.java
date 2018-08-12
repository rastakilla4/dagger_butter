package com.gsoft.injection;

public class ConInyeccion {

    private Programador programador;

    public ConInyeccion(Programador programador) {
        this.programador = programador;
    }

    public ConInyeccion(){}

    public void setProgramador(Programador programador) {
        this.programador = programador;
    }
}
