
package app.transportes.escobas;

import app.interfaces.IEsMagico;
import jdk.nashorn.internal.ir.ReturnNode;

public class NimbusOne  extends Escoba implements IEsMagico{

 // NimbusOne es la escoba  NIMBUS2000 - Primera escoba de Harry

    //Implemento las interfaces .

    @Override
    public boolean esInvisibleAMuggles(){
        return false;
    }

    @Override
    public boolean esInvisible(){
        return false;
    }

}