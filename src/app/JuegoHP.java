package app;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

import app.personajes.*;
import app.poderes.hechizos.*;

public class JuegoHP {
    public static Scanner Teclado = new Scanner(System.in);

    private List<Wizard> wizards = new ArrayList<>();
    private List<Elfo> elfos = new ArrayList<>();
    private List<Muggle> muggles = new ArrayList<>();
    private List<Criatura> criaturas = new ArrayList<>();
    private List<Hechizo> hechizos = new ArrayList<>();
    private List<HechizoDefensa> hechizosDefensa = new ArrayList<>();
    private List<HechizoAtaque> hechizosAtaque = new ArrayList<>();
    private List<HechizoOcio> hechizosOcio = new ArrayList<>();
    private List<HechizoCuracion> hechizosCuracion = new ArrayList<>();

    /*
     * public void juntarPersonajes(){ this.inicializarCriatura();
     * this.inicializarElfos(); this.inicializarMuggles();
     * this.inicializarWizards();
     * 
     * Object juntarPersonajes; }
     */

    public void inicializarWizards() {
        // Harr Potter;
        this.inicializarHechizos();

        Wizard HP = new Wizard("Harry Potter", 100, "Gryffindor", 120);
        HP.setVarita("Su material es caoba que simboliza la fuerza, seguridad, protección.");
        // HP.setNombre("Harry Potter");
        // HP.setCasa("Gryffindor");
        HP.setEdad(15);
        // HP.setEnergiaMagica(120);
        // HP.setSalud(100);
        // HP.setEscoba(escoba);
        HP.setMagoOscuro(false);
        List<Hechizo> hpHechizos = new ArrayList<>();
        hpHechizos.add(this.hechizosDefensa.get(2));
        hpHechizos.add(this.hechizosAtaque.get(0));
        HP.setHechizos(hpHechizos);
        // Poder HPPoder = new Poder();
        // HPPoder.setNombre("Inivisibilidad");
        // HP.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a personaje al catalogo
        this.wizards.add(HP);

        this.inicializarHechizos();

        Wizard Bellatrix = new Wizard("Bellatrix Lestrange", 100, "Slytherin", 140);
        Bellatrix.setVarita("Su material es el espino son expertas en maldiciones.");
        // Bellatrix.setNombre("Bellatrix Lestrange");
        // Bellatrix.setCasa("Slytherin");
        Bellatrix.setEdad(40);
        // Bellatrix.setEnergiaMagica(140);
        // Bellatrix.setSalud(100);
        // Bellatrix.setEscoba(escoba);
        Bellatrix.setMagoOscuro(true);
        List<Hechizo> BellatrixHechizos = new ArrayList<>();
        BellatrixHechizos.add(this.hechizosDefensa.get(0));
        BellatrixHechizos.add(this.hechizosAtaque.get(0));
        Bellatrix.setHechizos(BellatrixHechizos);
        // Poder BellatrixPoder = new Poder();
        // BellatrixPoder.setNombre("Inivisibilidad");
        // Bellatrix.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a personaje al catalogo
        this.wizards.add(Bellatrix);

        this.inicializarHechizos();

        Wizard Ron = new Wizard("Ron Weasley", 100, "Gryffindor", 120);
        Ron.setVarita("Su material es madera de sauce con nucleo de Pelo de Unicornio");
        // Ron.setNombre("Ron Weasley");
        // Ron.setCasa("Gryffindor");
        Ron.setEdad(15);
        // Ron.setEnergiaMagica(120);
        // Ron.setSalud(100);
        // Ron.setEscoba(escoba);
        Ron.setMagoOscuro(false);
        List<Hechizo> RonHechizos = new ArrayList<>();
        RonHechizos.add(this.hechizosDefensa.get(0));
        RonHechizos.add(this.hechizosOcio.get(0));
        Ron.setHechizos(RonHechizos);
        // Poder RonPoder = new Poder();
        // RonPoder.setNombre("Inivisibilidad");
        // Ron.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Ron);

        this.inicializarHechizos();

        Wizard Hermione = new Wizard("Hermione Granger", 100, "Gryffindor", 120);
        Hermione.setVarita("Su material es madera de vid con nucleo de fibra de corazon de Dragon");
        // Hermione.setNombre("Hermione Granger");
        // Hermione.setCasa("Gryffindor");
        Hermione.setEdad(15);
        // Hermione.setEnergiaMagica(120);
        // Hermione.setSalud(100);
        // Ron.setEscoba(escoba);
        Hermione.setMagoOscuro(false);
        List<Hechizo> HermioneHechizos = new ArrayList<>();
        HermioneHechizos.add(this.hechizosDefensa.get(0));
        HermioneHechizos.add(this.hechizosAtaque.get(2));
        Hermione.setHechizos(HermioneHechizos);
        // Poder RonPoder = new Poder();
        // RonPoder.setNombre("Inivisibilidad");
        // Ron.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Hermione);

        Wizard Voldemort = new Wizard("Lord Voldemort", 100, "Slytherin", 150);
        Voldemort.setVarita("Su material es madera de tejo con nucleo de pluma de cola de Fenix");
        // Voldemort.setNombre("Lord Voldemort");
        // Voldemort.setCasa("Slytherin");
        Voldemort.setEdad(66);
        // Voldemort.setEnergiaMagica(150);
        // Voldemort.setSalud(100);
        Voldemort.setMagoOscuro(true);
        List<Hechizo> VoldemortHechizos = new ArrayList<>();
        VoldemortHechizos.add(this.hechizosDefensa.get(0));
        VoldemortHechizos.add(this.hechizosAtaque.get(1));
        Voldemort.setHechizos(VoldemortHechizos);
        // Poder VoldemortPoder = new Poder();
        // VoldemortPoder.setNombre("Inivisibilidad");
        // Voldemort.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Voldemort);

        this.inicializarHechizos();

        Wizard Draco = new Wizard("Draco Malfoy", 100, "Slyterin", 120);
        Draco.setVarita("Su material es madera de espino con nucleo de Cabello de Unicornio");
        // Draco.setNombre("Draco Malfoy");
        // Draco.setCasa("Slyterin");
        Draco.setEdad(15);
        // Draco.setEnergiaMagica(120);
        // Draco.setSalud(100);
        Draco.setMagoOscuro(true);
        List<Hechizo> DracoHechizos = new ArrayList<>();
        DracoHechizos.add(this.hechizosDefensa.get(1));
        DracoHechizos.add(this.hechizosAtaque.get(0));
        Draco.setHechizos(DracoHechizos);
        // Poder VoldemortPoder = new Poder();
        // VoldemortPoder.setNombre("Inivisibilidad");
        // Voldemort.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Draco);

        this.inicializarHechizos();

    }

    public void inicializarMuggles() {

        Muggle vernonDursley = new Muggle("Nernon Dursley", 100);
        vernonDursley.setEdad(65); // Nacio en 1928- Edad en el momento que HP recibe la carta.
        vernonDursley.setParentescoHarry("Tío");

        this.muggles.add(vernonDursley);

        Muggle petuniaDursley = new Muggle("Petunia Dursley", 100);
        petuniaDursley.setEdad(44); // -Nacio en 1949- Edad en el momento que HP recibe la carta.
        petuniaDursley.setParentescoHarry("Tía");

        this.muggles.add(petuniaDursley);

        Muggle dudleyDursley = new Muggle("Dudley Dursley", 100);
        dudleyDursley.setEdad(13); // -Pelicula 1- Nivel 1.
        dudleyDursley.setParentescoHarry("Primo");

        this.muggles.add(dudleyDursley);

    }
    // ELFOS

    public void inicializarElfos() {
        Elfo elfo = new Elfo("Dobby", 100, 150);
        elfo.setEdad(200);
        List<Hechizo> DobbyHechizos = new ArrayList<>();
        DobbyHechizos.add(this.hechizosDefensa.get(0));
        DobbyHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(DobbyHechizos);

        this.elfos.add(elfo);

        elfo = new Elfo("Kreacher", 100, 150);
        elfo.setEdad(550);
        List<Hechizo> KreacherHechizos = new ArrayList<>();
        KreacherHechizos.add(this.hechizosDefensa.get(0));
        KreacherHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(KreacherHechizos);

        this.elfos.add(elfo);

        elfo = new Elfo("Winky", 100, 150);
        elfo.setEdad(270);
        List<Hechizo> WinkyHechizos = new ArrayList<>();
        WinkyHechizos.add(this.hechizosDefensa.get(0));
        WinkyHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(WinkyHechizos);

        this.elfos.add(elfo);

    }

    // CRIATURAS

    public void inicializarCriatura() {
        Criatura criatura = new Criatura("Acromántula", 100);
        criatura.setEdad(60);

        this.criaturas.add(criatura);

        criatura = new Criatura("Auguerey", 100); // FENIX

        this.criaturas.add(criatura);

        criatura = new Criatura("Basilisco", 100);

        this.criaturas.add(criatura);

    }

    private void inicializarHechizos() {
        this.hechizos.clear();
        this.hechizosAtaque.clear();

        ///////////////////////DEFENSA///////////////////
        
        CaveInimicum caveInimicum = new CaveInimicum();
        caveInimicum.setNombre("CaveInimicum");
        caveInimicum.setDescripcion("Defensa");
        caveInimicum.setEnergiaMagica(20);
        caveInimicum.setEsOscuro(false);
        caveInimicum.setNivelCuracion(15);  
        caveInimicum.setNivelDanio(0);
        hechizosDefensa.add(caveInimicum);
        
        HechizoDefensa expelliarmus = new HechizoDefensa();
        expelliarmus.setNombre("Expelliarmus");
        expelliarmus.setDescripcion("Defensa");
        expelliarmus.setEnergiaMagica(30);
        expelliarmus.setEsOscuro(false);
        expelliarmus.setNivelCuracion(10);
        expelliarmus.setNivelDanio(20);
        hechizosDefensa.add(expelliarmus);

        HechizoDefensa levicorpus = new HechizoDefensa();
        levicorpus.setNombre("Levicorpus");
        levicorpus.setDescripcion("Defensa");
        levicorpus.setEnergiaMagica(20);
        levicorpus.setEsOscuro(false);
        levicorpus.setNivelCuracion(10);
        levicorpus.setNivelDanio(20);
        hechizosDefensa.add(levicorpus);

        HechizoDefensa petrificusTotalus = new HechizoDefensa();
        petrificusTotalus.setNombre("Petrificus Totalus");
        petrificusTotalus.setDescripcion("Defensa");
        petrificusTotalus.setEnergiaMagica(20);
        petrificusTotalus.setEsOscuro(false);
        petrificusTotalus.setNivelCuracion(0);
        petrificusTotalus.setNivelDanio(10);
        hechizosDefensa.add(petrificusTotalus);
        

        /////////////////////////ATAQUE/////////////////////////////

        SectumSempra sectumSempra = new SectumSempra();
        sectumSempra.setNombre("Sectum Sempra");
        sectumSempra.setDescripcion("Ataque");
        sectumSempra.setEnergiaMagica(30);
        sectumSempra.setEsOscuro(true);
        sectumSempra.setNivelCuracion(0);
        sectumSempra.setNivelDanio(40);
        hechizosAtaque.add(sectumSempra);

        HechizoAtaque crucio = new HechizoAtaque();
        crucio.setNombre("Crucio");
        crucio.setDescripcion("Ataque");
        crucio.setEnergiaMagica(30);
        crucio.setEsOscuro(true);
        crucio.setNivelCuracion(0);
        crucio.setNivelDanio(40);
        hechizosAtaque.add(crucio);
        
        HechizoAtaque oppugno = new HechizoAtaque();
        oppugno.setNombre("Oppugno");
        oppugno.setDescripcion("Ataque");
        oppugno.setEnergiaMagica(20);
        oppugno.setEsOscuro(false);
        oppugno.setNivelCuracion(0);
        oppugno.setNivelDanio(30);
        hechizosAtaque.add(oppugno);
                
        HechizoAtaque morsmordre = new HechizoAtaque();
        morsmordre.setNombre("Morsmordre");
        morsmordre.setDescripcion("Ataque");
        morsmordre.setEnergiaMagica(20);
        morsmordre.setEsOscuro(true);
        morsmordre.setNivelCuracion(0);
        morsmordre.setNivelDanio(30);
        hechizosAtaque.add(morsmordre);

        ///////////////////////CURACION//////////////////////////////

        HechizoCuracion episkey = new HechizoCuracion();
        episkey.setNombre("Episkey");
        episkey.setDescripcion("Curacion");
        episkey.setEnergiaMagica(30);
        episkey.setEsOscuro(false);
        episkey.setNivelCuracion(30);
        episkey.setNivelDanio(0);
        hechizosCuracion.add(episkey);

  
        
        /////////////////////////OCIO/////////////////////////////

        HechizoOcio accio = new HechizoOcio();
        accio.setNombre("Accio");
        accio.setDescripcion("Ocio");
        accio.setEnergiaMagica(30);
        accio.setEsOscuro(false);
        accio.setNivelCuracion(0);
        accio.setNivelDanio(20);
        hechizosOcio.add(accio);


        //Hechizos para aprender
        HechizoOcio wingardiumLeviosa = new HechizoOcio();
        wingardiumLeviosa.setNombre("Wingardium Leviosa");
        wingardiumLeviosa.setDescripcion("Ocio");
        wingardiumLeviosa.setEnergiaMagica(10);
        wingardiumLeviosa.setEsOscuro(false);
        wingardiumLeviosa.setNivelCuracion(0);
        wingardiumLeviosa.setNivelDanio(10);
        hechizos.add(wingardiumLeviosa);

        HechizoAtaque imperius = new HechizoAtaque();
        imperius.setNombre("Imperius");
        imperius.setDescripcion("Ocio");
        imperius.setEnergiaMagica(40);
        imperius.setEsOscuro(true);
        imperius.setNivelCuracion(0);
        imperius.setNivelDanio(30);
        hechizos.add(imperius);

        HechizoDefensa riddiculus = new HechizoDefensa();
        riddiculus.setNombre("Ridduculus");
        riddiculus.setDescripcion("Defensa");
        riddiculus.setEnergiaMagica(15);
        riddiculus.setEsOscuro(false);
        riddiculus.setNivelCuracion(0);
        riddiculus.setNivelDanio(15);
        hechizos.add(riddiculus);

        HechizoCuracion patronus = new HechizoCuracion();
        patronus.setNombre("Patronus");
        patronus.setDescripcion("Curacion");
        patronus.setEnergiaMagica(15);
        patronus.setEsOscuro(false);
        patronus.setNivelCuracion(0);
        patronus.setNivelDanio(15);
        hechizos.add(patronus);

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

    public List<Muggle> getMuggles() {
        return this.muggles;
    }

    public void setMuggles(List<Muggle> muggles) {
        this.muggles = muggles;
    }

    public List<Criatura> getCriaturas() {
        return this.criaturas;
    }

    public void setCriaturas(List<Criatura> criaturas) {
        this.criaturas = criaturas;
    }
    
    public List<Hechizo> getHechizos() {
        return this.hechizos;
    }

    public void setHechizos(List<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }


    public void comenzarJuego() {

        JuegoHP juego = new JuegoHP();

        System.out.println("Bienvenido al Mundo Mágico de Harry Potter");

        juego.inicializarWizards();

        System.out.println("Selecciona el personaje del primer jugador (Ingrese el numero del personaje deseado): ");
        int index = 1;
        for (Wizard wizard : juego.getWizards()) {
            System.out.println((index++) + " - " + wizard.getNombre());
        }

        int personajeSeleccionado1 = Teclado.nextInt() - 1;
        Teclado.nextLine();

        Wizard p1 = juego.getWizards().get(personajeSeleccionado1);

        System.out.println("Selecciona el personaje del segundo jugador (Ingrese el numero del personaje deseado): ");
        index = 1;
        for (Wizard wizard : juego.getWizards()) {
            System.out.println((index++) + " - " + wizard.getNombre());
        }

        int personajeSeleccionado2 = Teclado.nextInt() - 1;
        Teclado.nextLine();

        Wizard p2 = juego.getWizards().get(personajeSeleccionado2);

        System.out.println("Personaje 1 es: " + p1.getNombre());
        System.out.println("Varita mágica: " + p1.getVarita());
        System.out.println("Personaje 2 es: " + p2.getNombre());
        System.out.println("Varita mágica: " + p2.getVarita());

        boolean turnoP1 = true;

        System.out.println("Comienza la batalla!");

        // mientras ambos tengan salud, pelear entre si
        // gameloop
        while (p1.estaVivo() && p2.estaVivo()) {
            Personaje atacante;
            Personaje oponente;

            if (turnoP1) {
                atacante = p1;
                oponente = p2;
            } else {
                atacante = p2;
                oponente = p1;
            }

            System.out.println("Ingrese el numero del hechizo que desea utilizar " + ((Wizard) atacante).getNombre());
            index = 1;
            for (Hechizo hechizo : ((Wizard) atacante).getHechizos()) {
                System.out.println((index++) + " - " + hechizo.getNombre() + " : " + hechizo.getDescripcion());
            }

            int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
            Teclado.nextLine();

            Hechizo hechizo = ((Wizard) atacante).getHechizos().get(IndiceHechizoSeleccionado);

            System.out.println(((Wizard) atacante).getNombre() + " ataca a " + ((Wizard) oponente).getNombre());

            System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
            System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());

            System.out.println("Salud del oponente: " + ((Wizard) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

            ((Wizard) atacante).atacar(oponente, hechizo);

            System.out.println("Salud del oponente: " + ((Wizard) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

            System.out.println("A " + ((Personaje) oponente).getNombre() + " le queda " + ((Wizard) oponente).getSalud()
                    + " de salud");

            turnoP1 = !turnoP1;

        }

        // Declaramos un ganador para jugar la proxima ronda
        Wizard ganador;

        if (p1.estaVivo()) {
            System.out.println(p1.getNombre() + " gano!!!");
            ganador = p1;
        } else {
            System.out.println(p2.getNombre() + " gano!!!");
            ganador = p2;
        }
        
        //////////////////APRENDER NUEVO HECHIZO///////////////////////////////
        
        System.out.println("Felicidades ganaste aprender un nuevo hechizo");

        System.out.println("Selecciona el hechizo " + ganador.getNombre());
        

        int index2 = 1;
        List<Hechizo> listaHechizos = juego.getHechizos();
        System.out.println("Cantidad de Hechizos " + listaHechizos.size());
        
        for (Hechizo hechizo : listaHechizos) {
            
            System.out.println((index2++) + "-" + hechizo.getNombre());
            
        }

        int indiceHechizoSeleccionado = Teclado.nextInt() - 1;
        Teclado.nextLine(); 

        ganador.aprender(listaHechizos.get(indiceHechizoSeleccionado));



        ///////////////////// EMPIEZA LA 2DA PELEA////////////////////////////////

        juego.inicializarElfos();

        System.out.println("Comieza la segunda batalla");
        System.out.println("El ganador se enfrentara con un Elfo Magico!");
        System.out.println("Selecciona el personaje Elfo (Ingrese el numero del personaje deseado): ");

        p1 = ganador;

        index = 1;
        for (Elfo elfo : juego.getElfos()) {
            System.out.println((index++) + " - " + elfo.getNombre());
        }

        int personajeSeleccionado3 = Teclado.nextInt() - 1;
        Teclado.nextLine();

        Elfo p3 = juego.getElfos().get(personajeSeleccionado3);

        System.out.println("Personaje 1 es: " + p1.getNombre());
        System.out.println("Personaje 2 es: " + p3.getNombre());

        turnoP1 = true;

        System.out.println("Comienza la batalla!");

        // mientras ambos tengan salud, pelear entre si
        // gameloop
        while (p1.estaVivo() && p3.estaVivo()) {
            Object atacante;
            Personaje oponente;

            if (turnoP1) {
                atacante = p1;
                oponente = p3;
            } else {
                atacante = p3;
                oponente = p1;
            }

            System.out
                    .println("Ingrese el numero del hechizo que desea utilizar " + ((Personaje) atacante).getNombre());
            index = 1;

            Hechizo hechizo;

            if (atacante == p1) {
                for (Hechizo h : ((Wizard) atacante).getHechizos()) {
                    System.out.println((index++) + " - " + h.getNombre() + " : " + h.getDescripcion());
                }
                int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
                Teclado.nextLine();
                hechizo = ((Wizard) atacante).getHechizos().get(IndiceHechizoSeleccionado);
                
      
                System.out.println(((Personaje) atacante).getNombre() + " ataca a " + ((Personaje) oponente).getNombre());

                System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
                System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());

                System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
                System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

                ((Wizard) atacante).atacar(oponente, hechizo);

                System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
                System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

            } else {

                for (Hechizo h : ((Elfo) atacante).getHechizos()) {
                    System.out.println((index++) + " - " + h.getNombre() + " : " + h.getDescripcion());
                }
                int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
                Teclado.nextLine();
                hechizo = ((Elfo) atacante).getHechizos().get(IndiceHechizoSeleccionado);

                System.out
                        .println(((Personaje) atacante).getNombre() + " ataca a " + ((Personaje) oponente).getNombre());

                System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
                System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());

                System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
                System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

                ((Elfo) atacante).atacar(oponente, hechizo);

                System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
                System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

            }

            System.out.println("A " + ((Personaje) oponente).getNombre() + " le queda "
                    + ((Personaje) oponente).getSalud() + " de salud");

            turnoP1 = !turnoP1;

        }

        if (p1.estaVivo()) {
            System.out.println(p1.getNombre() + " gano!!!");
        } else {
            System.out.println(p3.getNombre() + " gano!!!");
        }

    }

    ///////////////////////////////////// MINIJUEGO///////////////////////////////////////////////

    public void miniJuego() {

        String palabraScreta = getPalabraSecreta();

        char[] palabraGuiones = getGuionesDePalabra(palabraScreta);

        boolean juegoTerminado = false;

        Scanner teclado = new Scanner(System.in);

        int intentos = 7;

        do {

            System.out.println("Tienes " + intentos + " intentos");

            System.out.println(palabraGuiones);

            System.out.println("");

            System.out.println("Introduzca una letra");

            char letra = teclado.next().charAt(0);

            boolean algunaLetraAcertada = false;

            for (int i = 0; i < palabraScreta.length(); i++) {
                if (palabraScreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    algunaLetraAcertada = true;
                }
            }
            if (!algunaLetraAcertada)
                System.out.println("No has acertado ninguna letra");
            --intentos;
            if (intentos == 0) {
                System.out.println("Has perdido porque agotaste los intentos");
                juegoTerminado = true;

            }

            else {

                boolean juegoGanado = !hayGuiones(palabraGuiones);

                if (juegoGanado) {

                    System.out.println("Ganaste, tu premio es usar un nuevo hechizo de defensa");
                    juegoTerminado = true;
                }

            }

        } while (!juegoTerminado);
        teclado.close();

    }

    static String getPalabraSecreta() {

        String[] palabras =

                { "varita", /* 1 */
                        "escoba", /* 2 */
                        "piedra", /* 3 */
                        "capa", /* 4 */
                        "tren", /* 5 */
                        "elfo", /* 6 */
                };

        Random r = new Random();
        int n = r.nextInt(palabras.length);
        return palabras[n];
    }

    static char[] getGuionesDePalabra(String palabra) {
        int nLetrasPalabraSecreta = palabra.length();

        char[] palabraGuiones = new char[nLetrasPalabraSecreta];

        for (int i = 0; i < palabraGuiones.length; i++) {
            palabraGuiones[i] = '_';
        }

        return palabraGuiones;

    }

    static boolean hayGuiones(char[] array) {
        for (char l : array) {
            if (l == '_')
                return true;
        }
        return false;
    }

}
