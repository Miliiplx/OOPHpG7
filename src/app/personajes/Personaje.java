package app.personajes;

    public class Personaje {

    protected String nombre;
    protected int salud;
    private int edad;
    
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

    //METODO ESTA VIVO

    public boolean estaVivo(){
        if (this.salud > 0){
            return true;
        }
        else{
            return false;
        }
    }

}
