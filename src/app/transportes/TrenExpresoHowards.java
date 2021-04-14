package app.transportes;

import app.interfaces.IEsMagico;

public class TrenExpresoHowards extends Transporte implements IEsMagico {

    

    private String anioDeFabricacion;
    
    
    //Getters y Setters

    public String getAnioDeFabricacion(){
        return this.anioDeFabricacion;
    }
    public void setAnioDeFabricacion(String anioDeFabricacion){
        this.anioDeFabricacion = anioDeFabricacion;
    }
   
   //Implemento la interface

   @Override
   public boolean esInvisibleAMuggles(){
       return false;
   }

   @Override
   public boolean esInvisible(){
       return false;
   }
    
    
}
