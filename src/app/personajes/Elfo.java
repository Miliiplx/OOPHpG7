package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura implements IHaceMagia {

    
public Elfo(String nombre, int salud,int energiaMagica) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
    }

private int energiaMagica;    //Posee la energia máx que posee el elfo. Max 150
private Artefacto artefacto;  //Artefacto que porta el Elfo
private List<Hechizo> hechizos; //Los hechizos que aprendio a usar


//Getters y Setters

public int getEnergisMagica(){
    return this.energiaMagica;
}
public void setEnergiaMagica(int energiaMagica){
    this.energiaMagica = energiaMagica;
}

public Artefacto getArtefacto(){
    return this.artefacto;
}
public void setArtefacto(Artefacto artefacto){
    this.artefacto = artefacto;
}   
public List<Hechizo> getHechizos(){
    return this.hechizos;
}
public void setHechizos(List<Hechizo> hechizos){
    this.hechizos = hechizos;
}
@Override
public int getEnergiaMagica() {
    // TODO Auto-generated method stub
    return 0;
}
@Override
public Poder getPoderInicia() {
    // TODO Auto-generated method stub
    return null;
}
@Override
public void setPoder(Poder poder) {
    // TODO Auto-generated method stub
    
}
@Override
public void aprender(Hechizo hechizo) {
    // TODO Auto-generated method stub
    
}
@Override
public void atacar(Personaje personaje, Hechizo hechizo) {
    // TODO Auto-generated method stub
    
}
@Override
public void atacar(Personaje personaje, String hechizo) {
    // TODO Auto-generated method stub
    
}

}