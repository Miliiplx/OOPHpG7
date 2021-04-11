package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.poderes.hechizos.Hechizo;

public class Elfo extends Criatura {
    
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

}