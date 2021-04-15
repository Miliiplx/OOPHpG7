package app.transportes.escobas;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class NimbusTwo extends Escoba implements IEsMagico{

    //NimbusTwo es la escoba NIMBUS2001 .

    //Implemento las interfaces 

    public NimbusTwo(String nombre, Poder poder) {
        super(nombre, poder);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean esInvisibleAMuggles(){
        return false;
    }
    
    @Override
    public boolean esInvisible(){
        return false;
    }
    
}