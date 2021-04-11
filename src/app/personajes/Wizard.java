package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.Escoba;

public class Wizard extends Persona {
    

private int energiaMagica;       //Posee la energía máx que posee el mago. 150
private List<Hechizo> hechizos;        //Los hechizos que aprendio a usar
private Escoba escoba;           //Escoba que usa para transporte
private Poder poderInicial;      //Poder de nacimiento 
private Artefacto artefacto;     //Artefacto que lleva encima y afecta el ataque/defenza
private boolean magoOscuro;      //verdadero si es un mago oscuro

//Getters y Setters
 
public int getEnergiaMagica(){
    return this.energiaMagica;
}
public void setEnergiaMagica(int energiaMagica){
    this.energiaMagica = energiaMagica;
}
public List<Hechizo> getHechizos(){
    return this.hechizos;
}
public void setHechizos(List<Hechizo> hechizos){
    this.hechizos = hechizos;
}
public Escoba getEscoba(){
    return this.escoba;
}
public void setEscoba(Escoba escoba){
    this.escoba = escoba;
}
public Poder getPoderInicial(){
    return this. poderInicial;
}
public void setPoderInicial(Poder poderInicial){
    this. poderInicial =  poderInicial;
}
public Artefacto getArtefacto(){
    return this. artefacto;
}
public void setArtefacto(Artefacto artefacto){
    this.artefacto = artefacto;
}
public boolean getMagoOscuro(){
    return this.magoOscuro;
}
public void setMagoOscuro(boolean magoOscuro){
    this.magoOscuro = magoOscuro;
}
}
