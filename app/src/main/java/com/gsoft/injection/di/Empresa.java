package com.gsoft.injection.di;

import com.gsoft.injection.Programador;

public class Empresa {

    private Programador programador;

    public Empresa(Programador programador) {
        this.programador = programador;
    }

    @Override
    public String toString() {
        return programador.toString();
    }
}



