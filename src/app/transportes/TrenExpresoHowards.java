package app.transportes;
import app.interfaces.IEsMagico;

public class TrenExpresoHowards extends Transporte implements IEsMagico {

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