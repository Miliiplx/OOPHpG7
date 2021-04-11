package app.artefactos;

import app.interfaces.IReliquiaMuerte;
import app.poderes.Poder;

public class Horrocrux extends Artefacto implements IReliquiaMuerte {

    public Horrocrux(String nombre, Poder poder) {
        super(nombre, poder);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean esReliquiaMuerte() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
