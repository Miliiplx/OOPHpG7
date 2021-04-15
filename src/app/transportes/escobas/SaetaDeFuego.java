package app.transportes.escobas;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class SaetaDeFuego extends Escoba implements IEsMagico {
 
    // Es la escoba más poderosa - Escoba para magos malos.

    //Implemento las interfaces 

    public SaetaDeFuego(String nombre, Poder poder) {
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