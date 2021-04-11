package app.poderes;

import java.util.*;

import app.poderes.hechizos.Hechizo;

public class Poder {
    private String nombre;
    private String descripcion;
    public List<Hechizo> hechizos = new ArrayList<>();



    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }

    public List<Hechizo> getHechizos() {
        return this.hechizos;
    }

    public void setTemporadas(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }
    
}
