package com.gsoft.injection.di;

import com.gsoft.injection.Programador;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleTest {


    @Named("gustavo")
    @Provides
    public Programador providesProgramador(){
        return new Programador("gustavo");
    }

    @Named("hana")
    @Provides
    public Programador providesProgramador2(){
        return new Programador("Hana");
    }

    @Singleton
    @Named("none")
    @Provides
    public Programador providesProgramador3(){
        return new Programador();
    }

    //otra forma de inyeccion con dagger
    @Provides
    public Empresa providesEmpresa(@Named("gustavo") Programador programador){
        return new Empresa(programador);
    }

}
