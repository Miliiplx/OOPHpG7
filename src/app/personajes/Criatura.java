package app.personajes;

import app.interfaces.IEsMagico;

public class Criatura extends Personaje implements IEsMagico {


    public Criatura(String nombre, int salud) {
        super.nombre = nombre;
        super.salud = salud;
    }

    //IMPLEMENTO LAS INTERFACES

    @Override
    public boolean esInvisibleAMuggles() {
        return false;
    }

    @Override
    public boolean esInvisible() {
        return false;
    }
    
}
