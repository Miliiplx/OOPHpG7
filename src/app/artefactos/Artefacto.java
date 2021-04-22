package app.artefactos;

import app.interfaces.IEsMagico;
import app.poderes.Poder; //PREGUNTAR SI ESTO VA ASI. DE LO CONTRARIO ME SALTA ERROR EN EL TIPO.

public class Artefacto implements IEsMagico {

    public Artefacto(String nombre, Poder poder){
        this.nombre = nombre;
        this.poder = poder;
    }

    private String nombre;
    private double amplificadorDeDanio; //Numero que representa una forma de incremento de daño. De 0 a 1.
    private double amplificadorDeCuracion; //Numero que representa una forma de decremento de daño recibido. 0 a 1
    private Poder poder; //Poder de artefacto. Este atributo debe estar pero su valor es opcional.
    //Ej CapaInvisibilidad tiene el poder de invisibilidad. Los
    //otros son a libre interpretación.

    //private List<Horrocrux> horrocruxes = new ArrayList<>(); LISTA DE HORROCRUXES IDEA.

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getAmplificadorDeDanio(){
        return this.amplificadorDeDanio;
    }

    public void setAmplificadorDeDanio(double amplificadorDeDanio){
        this.amplificadorDeDanio = amplificadorDeDanio;
    }

    public double getAmplificadorDeCuracion(){
        return this.amplificadorDeCuracion;
    }

    public void setAmplificadorDeCuracion(double amplificadorDeCuracion){
        this.amplificadorDeCuracion = amplificadorDeCuracion;
    }

    public Poder getPoder(){
        return this.poder;
    }

    public void setPoder(Poder poder){
        this.poder = poder;
    }


    //IMPLEMENTO LAS INTERFACES.
    
    @Override
    public boolean esInvisibleAMuggles() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean esInvisible() {
        // TODO Auto-generated method stub
        return false;
    }

    




    
}
