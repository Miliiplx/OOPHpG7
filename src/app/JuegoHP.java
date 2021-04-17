package app;

import java.util.ArrayList;
import java.util.List;

import app.personajes.Elfo;
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
    private List<Elfo> elfos = new ArrayList<>();
    private List<HechizoDefensa> hechizosDefensa = new ArrayList<>();
    private List<HechizoAtaque> hechizosAtaque = new ArrayList<>();



    public void inicializarWizards() {
        // Harr Potter
        this.inicializarHechizos();

        Wizard HP = new Wizard();
        HP.setNombre("Harry Potter");
        HP.setCasa("Gryffindor");
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

        this.inicializarHechizos();

        Wizard Ron = new Wizard();
        Ron.setNombre("Ron Weasley");
        Ron.setCasa("Gryffindor");
        Ron.setEdad(15);
        Ron.setEnergiaMagica(120);
        Ron.setSalud(100);
        //Ron.setEscoba(escoba);
        Ron.setMagoOscuro(false);
        List<Hechizo> RonHechizos = new ArrayList<>();
        RonHechizos.add(this.hechizosDefensa.get(0));
        RonHechizos.add(this.hechizosAtaque.get(0));
        Ron.setHechizos(RonHechizos);
        //Poder RonPoder = new Poder();
        //RonPoder.setNombre("Inivisibilidad");
        //Ron.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Ron);

        this.inicializarHechizos();

        Wizard Hermione = new Wizard();
        Hermione.setNombre("Hermione Granger");
        Hermione.setCasa("Gryffindor");
        Hermione.setEdad(15);
        Hermione.setEnergiaMagica(120);
        Hermione.setSalud(100);
        //Ron.setEscoba(escoba);
        Hermione.setMagoOscuro(false);
        List<Hechizo> HermioneHechizos = new ArrayList<>();
        HermioneHechizos.add(this.hechizosDefensa.get(0));
        HermioneHechizos.add(this.hechizosAtaque.get(0));
        Hermione.setHechizos(HermioneHechizos);
        //Poder RonPoder = new Poder();
        //RonPoder.setNombre("Inivisibilidad");
        //Ron.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Hermione);

    }

    public void inicializarMuggles(){

        Muggle vernonDursley = new Muggle();
        vernonDursley.setNombre("Nernon Dursley");
        vernonDursley.setSalud(100);
        vernonDursley.setEdad(65); //Nacio en 1928- Edad en el momento que HP recibe la carta.
        vernonDursley.setParentescoHarry("Tío");

        Muggle petuniaDursley = new Muggle();
        petuniaDursley.setNombre("Petunia Dursley");
        petuniaDursley.setSalud(100);
        petuniaDursley.setEdad(44); //-Nacio en 1949- Edad en el momento que HP recibe la carta.
        petuniaDursley.setParentescoHarry("Tía");

        Muggle dudleyDursley = new Muggle();
        dudleyDursley.setNombre("Dudley Dursley");
        dudleyDursley.setSalud(100);
        dudleyDursley.setEdad(13); //-Pelicula 1- Nivel 1.
        dudleyDursley.setParentescoHarry("Primo");

    }
     //ELFOS

     public void inicializarElfos() {
         Elfo elfo = new Elfo();
         elfo.setNombre("Dobby");
         elfo.setSalud(100);
         elfo.setEdad(200);
         elfo.setEnergiaMagica(150);
        List<Hechizo> DobbyHechizos = new ArrayList<>();
        DobbyHechizos.add(this.hechizosDefensa.get(0));
        DobbyHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(DobbyHechizos);

        this.elfos.add(elfo); 
        
        elfo = new Elfo();
        elfo.setNombre("Kreacher");
        elfo.setSalud(100);
        elfo.setEdad(550);
        elfo.setEnergiaMagica(150);
        List<Hechizo> KreacherHechizos = new ArrayList<>();
        KreacherHechizos.add(this.hechizosDefensa.get(0));
        KreacherHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(KreacherHechizos);

        this.elfos.add(elfo);


        
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

    public List<Elfo> getElfos() {
        return this.elfos;
    }

    public void setElfos(List<Elfo> elfos) {
        this.elfos = elfos;
    }


}
