package app.personajes;

import java.util.List;

import app.artefactos.Artefacto;
import app.interfaces.IHaceMagia;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;
import app.transportes.*;

public class Wizard extends Persona implements IHaceMagia {

    public Wizard (String nombre,int salud,String casa,int energiaMagica){
        super.nombre = nombre;
        super.salud = salud;
        this.casa = casa;
        this.energiaMagica = energiaMagica;
    }
        
     

    private int energiaMagica; // Posee la energía máx que posee el mago. 150
    private List<Hechizo> hechizos; // Los hechizos que aprendio a usar
    private Escoba escoba; // Escoba que usa para transporte
    private Poder poderInicial; // Poder de nacimiento
    private Artefacto artefacto; // Artefacto que lleva encima y afecta el ataque/defenza
    private boolean magoOscuro; // verdadero si es un mago oscuro
    protected String casa;
    private String varita;

    // Getters y Setters

    public String getVarita(){
        return this.varita;
    }

    public void setVarita(String varita){
        this.varita = varita;
    }

    public int getEnergiaMagica() {
        return this.energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public List<Hechizo> getHechizos() {
        return this.hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    public Escoba getEscoba() {
        return this.escoba;
    }

    public void setEscoba(Escoba escoba) {
        this.escoba = escoba;
    }

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poderInicial) {
        this.poderInicial = poderInicial;
    }

    public Artefacto getArtefacto() {
        return this.artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public boolean getMagoOscuro() {
        return this.magoOscuro;
    }

    public void setMagoOscuro(boolean magoOscuro) {
        this.magoOscuro = magoOscuro;
    }


    //IMPLEMENTO LAS INTERFACES

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
        this.hechizos.add(hechizo);
        

    }

    
    public void asignarArtefacto(Artefacto artefacto){
        this.artefacto = artefacto;
        
    }

    @Override
    public void atacar(Personaje personaje, Hechizo hechizo) {
        int n = 1;
        if(!this.magoOscuro  && hechizo.getEsOscuro()){
            this.magoOscuro = true;
            n = 2;
        }
        int salud =  personaje.getSalud() - n * hechizo.getNivelDanio();
        personaje.setSalud(salud);

        this.energiaMagica = this.energiaMagica - hechizo.getEnergiaMagica();
        this.salud =  this.salud + hechizo.getNivelCuracion();
    }
    

    @Override
    public void atacar(Personaje personaje, String hechizo) {
        // TODO Auto-generated method stub

    }

    public boolean aprender(List<Hechizo> hechizos2) {
        return false;
   
     }
}
