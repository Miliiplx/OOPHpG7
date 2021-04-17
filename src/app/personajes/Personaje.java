package app.personajes;
import java.util.*;

    public class Personaje {

    protected String nombre;
    protected int salud;
    private int edad;
    private List<Wizard> wizards = new ArrayList<>();
    private List<Muggle> muggles = new ArrayList<>();
    


    //Getter y Setter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getSalud(){
        return this.salud;
    }
    public void setSalud (int salud){
        this.salud = salud;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }

    
    public List<Wizard> getWizards() {
        return this.wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }

    public List<Muggle> getMuggles() {
        return this.muggles;
    }

    public void setMuggles(List<Muggle> muggles) {
        this.muggles = muggles;
    }

    //Metodo

    public boolean estaVivo(){
        if (this.salud > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
