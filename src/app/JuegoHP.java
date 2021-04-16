package app;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Muggle;
import app.personajes.Wizard;
import app.poderes.Poder;
import app.poderes.hechizos.CaveInimicum;
import app.poderes.hechizos.Hechizo;
import app.poderes.hechizos.HechizoAtaque;
import app.poderes.hechizos.HechizoDefensa;
import app.poderes.hechizos.SectumSempra;

public class JuegoHP {

    private List<Wizard> wizards = new ArrayList<>();
    private List<HechizoDefensa> hechizosDefensa = new ArrayList<>();
    private List<HechizoAtaque> hechizosAtaque = new ArrayList<>();



    public void inicializarWizards() {
        // Harr Potter
        this.inicializarHechizos();

        Wizard HP = new Wizard();
        HP.setNombre("Harry Potter");
        HP.setCasa("Grifindor");
        HP.setEdad(15);
        HP.setEnergiaMagica(120);
        HP.setSalud(100);
        //HP.setEscoba(escoba);
        HP.setMagoOscuro(false);
        List<Hechizo> hpHechizos = new ArrayList<>();
        hpHechizos.add(this.hechizosDefensa.get(0));
        hpHechizos.add(this.hechizosAtaque.get(0));
        HP.setHechizos(hpHechizos);
        //Poder HPPoder = new Poder();
        //HPPoder.setNombre("Inivisibilidad");
        //HP.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Titanic al catalogo
        this.wizards.add(HP);

        this.inicializarHechizos();

        Wizard Bellatrix = new Wizard();
        Bellatrix.setNombre("Bellatrix Lestrange");
        Bellatrix.setCasa("Slytherin");
        Bellatrix.setEdad(40);
        Bellatrix.setEnergiaMagica(140);
        Bellatrix.setSalud(100);
        //Bellatrix.setEscoba(escoba);
        Bellatrix.setMagoOscuro(true);
        List<Hechizo> BellatrixHechizos = new ArrayList<>();
        BellatrixHechizos.add(this.hechizosDefensa.get(0));
        BellatrixHechizos.add(this.hechizosAtaque.get(0));
        Bellatrix.setHechizos(BellatrixHechizos);
        //Poder BellatrixPoder = new Poder();
        //BellatrixPoder.setNombre("Inivisibilidad");
        //Bellatrix.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Titanic al catalogo
        this.wizards.add(Bellatrix);

    }

    private void inicializarHechizos() {
        CaveInimicum caveInimicum = new CaveInimicum();
        caveInimicum.setNombre("CaveInimicum");
        caveInimicum.setDescripcion("Defensa");
        caveInimicum.setEnergiaMagica(20);
        caveInimicum.setEsOscuro(false);
        caveInimicum.setNivelCuracion(5);
        caveInimicum.setNivelDanio(0);
        hechizosDefensa.add(caveInimicum);

        SectumSempra sectumSempra = new SectumSempra();
        sectumSempra.setNombre("Sectum Sempra");
        sectumSempra.setDescripcion("Ataque");
        sectumSempra.setEnergiaMagica(30);
        sectumSempra.setEsOscuro(true);
        sectumSempra.setNivelCuracion(0);
        sectumSempra.setNivelDanio(40);
        hechizosAtaque.add(sectumSempra);
    }

    public List<Wizard> getWizards() {
        return this.wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }


}
