package app.transportes;

import java.util.*;

import app.interfaces.IEsMagico;
import app.poderes.Poder; //15/04
import app.transportes.escobas.Escoba; //15/04

public class Transporte  implements IEsMagico {

    public Transporte(String nombre, Poder poder){
        this.nombre = nombre;
        this.poder = poder;
    }

   private String nombre;
   private String descripcion; //Informar una pequeña descripcion del transporte Ejem: que tipo de escoba tiene el jugado.
   private Poder poder;
   private List<Escoba>escobas = new ArrayList<>();
    

   //Getters y Setters

   public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public Poder getPoder(){
        return this.poder;
    }
    public void setPoder(Poder poder){
        this.poder = poder;
    }

    private List<Escoba>getEscobas(){
        return this.escobas;
    }
    public void setEscabas(List<Escoba>escobas){
        this.escobas = escobas;
    }
    
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
