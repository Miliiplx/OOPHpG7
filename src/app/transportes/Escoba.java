package app.transportes;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    private int anioDeFabricacion; //Solo el año que fue creada la escoba...Nimbus2000(año 1991) /SaetaDeFuegoSuprema(año 2014)
    private String descripcion;  //Informa que escoba tiene el jugador...MagosBuenos: Nimbus2000 / MagosMalos: SaetaDeFuegoSuprema
    
    //Getter y Setters

    public int getAnioDeFabricacion(){
        return this.anioDeFabricacion;
    }
    public void setAnioDeFabricacion(int anioDeFabricacion){
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    //Implemento la interface

    @Override
    public boolean esInvisibleAMuggles() {

        return false;
    }

    @Override
    public boolean esInvisible() {
        
        return false;
    }
    
   

    
}
