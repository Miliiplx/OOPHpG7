package app.personajes;

public class Muggle extends Persona {
    
    public Muggle(String nombre, int salud){
        super.nombre = nombre;
        super.salud = salud;
    }
    

    private String parentescoHarry;

    //Getters y Setters.

    public String getParentescoHarry(){
        return this.parentescoHarry;
    }
    public void setParentescoHarry(String parentesco){
        this.parentescoHarry = parentesco;
    }

}
