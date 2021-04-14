package app.transportes.escobas;

import app.interfaces.IEsMagico;

public class Escoba extends Transporte implements IEsMagico {

    public Escoba(String nombre, Poder poder){
        this.nombre = nombre;
        this.poder = poder;
    }

    //Dos escobas magicas para magos buenos (Nimbus)
    //Una escoba magica para magos malos (Saeta)
    //Una escoba sin magica (Muggle)

    private int anioDeFabricacion; //Solo el año que fue creada la escoba...Nimbus2000(año 1991) /SaetaDeFuegoSuprema(año 2014)
     
    //Getter y Setters

    public int getAnioDeFabricacion(){
        return this.anioDeFabricacion;
    }
    public void setAnioDeFabricacion(int anioDeFabricacion){
        this.anioDeFabricacion = anioDeFabricacion;
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