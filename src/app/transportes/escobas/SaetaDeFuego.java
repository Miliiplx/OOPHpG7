package app.transportes.escobas;

import app.interfaces.IEsMagico;

public class SaetaDeFuego extends Escoba implements IEsMagico {
 
    // Es la escoba más poderosa - Escoba para magos malos

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