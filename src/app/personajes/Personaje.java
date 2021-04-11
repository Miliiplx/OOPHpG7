package app.personajes;

public class Personaje {

    private String nombre;
    private int salud;
    private int edad;
    private String casa;


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

    
    public String getCasa(){
        return this.casa;
    }
      
    public void setCasa(String casa){
         this. casa = casa;
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
