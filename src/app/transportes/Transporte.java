package app.transportes;
import app.interfaces.IEsMagico;

public class Transporte  implements IEsMagico {


    //Implemento las interfaces.

    @Override
    public boolean esInvisibleAMuggles(){
        return false;
    }

    @Override
    public boolean esInvisible(){
        return false;
    }

}