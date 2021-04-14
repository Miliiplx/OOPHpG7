package app.transportes.escobas;

import app.interfaces.IEsMagico;

public class NimbusTwo extends Escoba implements IEsMagico{

    //NimbusTwo es la escoba NIMBUS2001 .

    //Implemento las interfaces 

    @Override
    public boolean esInvisibleAMuggles(){
        return false;
    }
    
    @Override
    public boolean esInvisible(){
        return false;
    }
    
}