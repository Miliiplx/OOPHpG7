
package app.transportes.escobas;

import app.interfaces.IEsMagico;
import app.poderes.Poder;
//import jdk.nashorn.internal.ir.ReturnNode;

public class NimbusOne  extends Escoba implements IEsMagico{

 // NimbusOne es la escoba  NIMBUS2000 - Primera escoba de Harry

    //Implemento las interfaces .

    public NimbusOne(String nombre, Poder poder) {
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