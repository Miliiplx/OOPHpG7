package app.interfaces;

import app.artefactos.Artefacto;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.poderes.hechizos.Hechizo;

public interface IHaceMagia {

    int getEnergiaMagica(); //Devuelve energía mágica del implementador.
    void setEnergiaMagica(int energiaMagica); //Pone la energía mágica del implementador
    Poder getPoderInicia(); //Devuelve el poder de nacimiento.
    void setPoder(Poder poder); //Pone el poder inicial
    Artefacto getArtefacto(); //Devuelve el artefacto del personaje
    void aprender(Hechizo hechizo); //Aprende un hechizo en particular.
    void atacar(Personaje personaje, Hechizo hechizo); //Ataca a personaje “personaje” usando el hechizo “hechizo”
    void atacar(Personaje personaje, String hechizo); //Ataca a un personaje usando nombre de hechizo

    /* FALTA AGREGAR LA IMPLEMENTACION EN WIZARD Y ELFO */
    
}
