package app.transportes;

import app.interfaces.IEsMagico;
import app.poderes.Poder;

public class TrenExpresoHowards extends Transporte implements IEsMagico {

    

    public TrenExpresoHowards(String nombre, Poder poder) {
        super(nombre, poder);
        //agrego este constructor 15/04 Quick fix
    }

    private String anioDeFabricacion;
    
    
    //Getters y Setters

    public String getAnioDeFabricacion(){
        return this.anioDeFabricacion;
    }
    public void setAnioDeFabricacion(String anioDeFabricacion){
        this.anioDeFabricacion = anioDeFabricacion;
    }
   
   //Implemento la interface.

   @Override
   public boolean esInvisibleAMuggles(){
       return false;
   }

   @Override
   public boolean esInvisible(){
       return false;
   }
    
    
}
