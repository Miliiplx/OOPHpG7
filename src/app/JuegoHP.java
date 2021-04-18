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
    private List<HechizoDefensa> hechizosDefensa = new ArrayList<>();
    private List<HechizoAtaque> hechizosAtaque = new ArrayList<>();
    private List<HechizoOcio> hechizosOcio =    new ArrayList<>();
    private List<HechizoCuracion> hechizosCuracion = new ArrayList<>();

    public void juntarPersonajes(){
        this.inicializarCriatura();
        this.inicializarElfos();
        this.inicializarMuggles();
        this.inicializarWizards();

        Object juntarPersonajes;
    }


    public void inicializarWizards() {
        // Harr Potter
        this.inicializarHechizos();

        Wizard HP = new Wizard("Harry Potter",100,"Gryffindor",120);
        //HP.setNombre("Harry Potter");
        //HP.setCasa("Gryffindor");
        HP.setEdad(15);
        //HP.setEnergiaMagica(120);
        //HP.setSalud(100);
        //HP.setEscoba(escoba);
        HP.setMagoOscuro(false);
        List<Hechizo> hpHechizos = new ArrayList<>();
        hpHechizos.add(this.hechizosDefensa.get(0));
        hpHechizos.add(this.hechizosAtaque.get(0));
        HP.setHechizos(hpHechizos);
        //Poder HPPoder = new Poder();
        //HPPoder.setNombre("Inivisibilidad");
        //HP.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a personaje al catalogo
        this.wizards.add(HP);

        this.inicializarHechizos();

        Wizard Bellatrix = new Wizard("Bellatrix Lestrange",100,"Slytherin",140);
        //Bellatrix.setNombre("Bellatrix Lestrange");
        //Bellatrix.setCasa("Slytherin");
        Bellatrix.setEdad(40);
        //Bellatrix.setEnergiaMagica(140);
        //Bellatrix.setSalud(100);
        //Bellatrix.setEscoba(escoba);
        Bellatrix.setMagoOscuro(true);
        List<Hechizo> BellatrixHechizos = new ArrayList<>();
        BellatrixHechizos.add(this.hechizosDefensa.get(0));
        BellatrixHechizos.add(this.hechizosAtaque.get(0));
        Bellatrix.setHechizos(BellatrixHechizos);
        //Poder BellatrixPoder = new Poder();
        //BellatrixPoder.setNombre("Inivisibilidad");
        //Bellatrix.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a personaje al catalogo
        this.wizards.add(Bellatrix);

        this.inicializarHechizos();

        Wizard Ron = new Wizard("Ron Weasley", 100, "Gryffindor",120);
        //Ron.setNombre("Ron Weasley");
        //Ron.setCasa("Gryffindor");
        Ron.setEdad(15);
        //Ron.setEnergiaMagica(120);
        //Ron.setSalud(100);
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

        Wizard Hermione = new Wizard("Hermione Granger",100,"Gryffindor",120);
        //Hermione.setNombre("Hermione Granger");
        //Hermione.setCasa("Gryffindor");
        Hermione.setEdad(15);
        //Hermione.setEnergiaMagica(120);
        //Hermione.setSalud(100);
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
        
        Wizard Voldemort = new Wizard("Lord Voldemort", 100, "Slytherin",150);
        //Voldemort.setNombre("Lord Voldemort");
        //Voldemort.setCasa("Slytherin");
        Voldemort.setEdad(66);
        //Voldemort.setEnergiaMagica(150);
        //Voldemort.setSalud(100);
        Voldemort.setMagoOscuro(true);
        List<Hechizo> VoldemortHechizos = new ArrayList<>();
        VoldemortHechizos.add(this.hechizosDefensa.get(0));
        VoldemortHechizos.add(this.hechizosAtaque.get(0));
        Voldemort.setHechizos(VoldemortHechizos);
        //Poder VoldemortPoder = new Poder();
        //VoldemortPoder.setNombre("Inivisibilidad");
        //Voldemort.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Voldemort);
        
        this.inicializarHechizos();

        Wizard Draco = new Wizard("Draco Malfoy",100,"Slyterin",120);
        //Draco.setNombre("Draco Malfoy");
        //Draco.setCasa("Slyterin");
        Draco.setEdad(15);
        //Draco.setEnergiaMagica(120);
        //Draco.setSalud(100);
        Draco.setMagoOscuro(true);
        List<Hechizo>DracoHechizos = new ArrayList<>();
        DracoHechizos.add(this.hechizosDefensa.get(0));
        DracoHechizos.add(this.hechizosAtaque.get(0));
        Draco.setHechizos(DracoHechizos);
        //Poder VoldemortPoder = new Poder();
        //VoldemortPoder.setNombre("Inivisibilidad");
        //Voldemort.setPoderInicial(poderInicial);
        // Recien ahora estoy agregando a Personaje al catalogo
        this.wizards.add(Draco);
        
        this.inicializarHechizos();

    }

    public void inicializarMuggles(){

        Muggle vernonDursley = new Muggle("Nernon Dursley", 100);
        vernonDursley.setEdad(65); //Nacio en 1928- Edad en el momento que HP recibe la carta.
        vernonDursley.setParentescoHarry("Tío");

        this.muggles.add(vernonDursley);

        Muggle petuniaDursley = new Muggle("Petunia Dursley", 100);
        petuniaDursley.setEdad(44); //-Nacio en 1949- Edad en el momento que HP recibe la carta.
        petuniaDursley.setParentescoHarry("Tía");

        this.muggles.add(petuniaDursley);

        Muggle dudleyDursley = new Muggle("Dudley Dursley", 100);
        dudleyDursley.setEdad(13); //-Pelicula 1- Nivel 1.
        dudleyDursley.setParentescoHarry("Primo");

        this.muggles.add(dudleyDursley);

    }
     //ELFOS

     public void inicializarElfos() {
         Elfo elfo = new Elfo("Dobby",100,150);
         elfo.setEdad(200);
        List<Hechizo> DobbyHechizos = new ArrayList<>();
        DobbyHechizos.add(this.hechizosDefensa.get(0));
        DobbyHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(DobbyHechizos);

        this.elfos.add(elfo); 
        
        elfo = new Elfo("Kreacher",100,150);
        elfo.setEdad(550);
        List<Hechizo> KreacherHechizos = new ArrayList<>();
        KreacherHechizos.add(this.hechizosDefensa.get(0));
        KreacherHechizos.add(this.hechizosAtaque.get(0));
        elfo.setHechizos(KreacherHechizos);

        this.elfos.add(elfo);


        
     }

     //CRIATURAS

     public void inicializarCriatura(){
         Criatura criatura = new Criatura("Acromántula", 100);
         criatura.setEdad(60);

         this.criaturas.add(criatura);

         criatura = new Criatura("Auguerey",100); //FENIX
     
        this.criaturas.add(criatura);

        criatura = new Criatura("Basilisco",100);

        this.criaturas.add(criatura);
         

     }

        

    private void inicializarHechizos() {

        CaveInimicum caveInimicum = new CaveInimicum();
        caveInimicum.setNombre("CaveInimicum");
        caveInimicum.setDescripcion("Defensa");
        caveInimicum.setEnergiaMagica(20);
        caveInimicum.setEsOscuro(false);
        caveInimicum.setNivelCuracion(15);
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

        HechizoDefensa expelliarmus = new HechizoDefensa();
        expelliarmus.setNombre("Expelliarmus");
        expelliarmus.setDescripcion("Defensa");
        expelliarmus.setEnergiaMagica(30);
        expelliarmus.setEsOscuro(false);
        expelliarmus.setNivelCuracion(10);
        expelliarmus.setNivelDanio(20);
        hechizosDefensa.add(expelliarmus);

        
        HechizoAtaque crucio = new HechizoAtaque();
        crucio.setNombre("Crucio");
        crucio.setDescripcion("Ataque");
        crucio.setEnergiaMagica(30);
        crucio.setEsOscuro(true);
        crucio.setNivelCuracion(0);
        expelliarmus.setNivelDanio(40);
        hechizosAtaque.add(crucio);

        HechizoOcio accio = new HechizoOcio();
        accio.setNombre("Accio");
        accio.setDescripcion("Ocio");
        accio.setEnergiaMagica(30);
        accio.setEsOscuro(false);
        accio.setNivelCuracion(0);
        accio.setNivelDanio(20);
        hechizosOcio.add(accio);

        HechizoCuracion episkey = new HechizoCuracion();
        episkey.setNombre("Episkey");
        episkey.setDescripcion("Curacion");
        episkey.setEnergiaMagica(30);
        episkey.setEsOscuro(false);
        episkey.setNivelCuracion(30);
        episkey.setNivelDanio(0);
        hechizosCuracion.add(episkey);



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

    public List<Muggle> getMuggles(){
        return this.muggles;
    }
    public void setMuggles(List<Muggle> muggles){
        this.muggles = muggles;
    }
    public List<Criatura> getCriaturas(){
        return this.criaturas;
    }
    public void setCriaturas(List<Criatura> criaturas){
        this.criaturas = criaturas;
    }


    public void comenzarJuego() throws InterruptedException{

        

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
        System.out.println("Personaje 2 es: " + p2.getNombre());

        boolean turnoP1 = true;

        System.out.println("Comienza la batalla!");
        
        //mientras ambos tengan salud, pelear entre si
        //gameloop
        while(p1.estaVivo() && p2.estaVivo()){
            Object atacante;
            Personaje oponente;

            if (turnoP1){
                atacante = p1;
                oponente = p2;
            }
            else{
                atacante = p2;
                oponente = p1;
            }

            System.out.println("Ingrese el numero del hechizo que desea utilizar " + ((Wizard) atacante).getNombre());
            index = 1;
            for (Hechizo hechizo : ((Wizard) atacante).getHechizos()) {
                    System.out.println((index++) + " - " + hechizo.getNombre() +  " : " + hechizo.getDescripcion());
            }

            int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
            Teclado.nextLine();

            Hechizo hechizo = ((Wizard) atacante).getHechizos().get(IndiceHechizoSeleccionado);

            System.out.println(((Wizard) atacante).getNombre() + " ataca a "+ ((Wizard) oponente).getNombre());
            
            System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
            System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());
            
            System.out.println("Salud del oponente: " + ((Wizard) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

            Thread.sleep(1000);

            ((Wizard) atacante).atacar(oponente, hechizo);

            System.out.println("Salud del oponente: " + ((Wizard) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Wizard) atacante).getEnergiaMagica());

            Thread.sleep(1000);
            
            System.out.println("A "+ ((Personaje) oponente).getNombre() + " le queda "+ ((Wizard) oponente).getSalud() + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(1000);
        }

        if (p1.estaVivo()){
            System.out.println(p1.getNombre() + " gano!!!");

            /////////////////////INICIAMOS LA SEGUNDA PELEA SI EL P1 GANA///////////////////////////////////////
            //SE ROMPE DESPUES DEL PRIMER ATAQUE DEL ELFO.

            juego.inicializarElfos();
        
            System.out.println("Comieza la segunda batalla");

        System.out.println("Selecciona el personaje Elfo (Ingrese el numero del personaje deseado): ");
        index = 1;
        for (Elfo elfo : juego.getElfos()) {
            System.out.println((index++) + " - " + elfo.getNombre());
        }

        int personajeSeleccionado3 = Teclado.nextInt() - 1;
        Teclado.nextLine();

        Elfo p3 = juego.getElfos().get(personajeSeleccionado3);
        
        System.out.println("Personaje 1 es: " + p1.getNombre());
        System.out.println("Personaje 2 es: " + p3.getNombre());

        boolean turnoP3 = true;

        System.out.println("Comienza la batalla!");
        
        //mientras ambos tengan salud, pelear entre si
        //gameloop
        while(p1.estaVivo() && p3.estaVivo()){
            Object atacante;
            Personaje oponente;

            if (turnoP1){
                atacante = p1;
                oponente = p3;
            }
            else{
                atacante = p3;
                oponente = p1;
            }

            System.out.println("Ingrese el numero del hechizo que desea utilizar " + ((Personaje) atacante).getNombre());
            index = 1;
            for (Hechizo hechizo : ((Elfo) atacante).getHechizos()) {
                    System.out.println((index++) + " - " + hechizo.getNombre() +  " : " + hechizo.getDescripcion());
            }

            int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
            Teclado.nextLine();

            Hechizo hechizo = ((Elfo) atacante).getHechizos().get(IndiceHechizoSeleccionado);

            System.out.println(((Personaje) atacante).getNombre() + " ataca a "+ ((Personaje) oponente).getNombre());
            
            System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
            System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());
            
            System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

            Thread.sleep(1000);

            ((Elfo) atacante).atacar(oponente, hechizo);

            System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

            Thread.sleep(1000);
            
            System.out.println("A "+ ((Personaje) oponente).getNombre() + " le queda "+ ((Wizard) oponente).getSalud() + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(1000);
        }

        if (p1.estaVivo()){
            System.out.println(p1.getNombre() + " gano!!!");
        }
        else{
            System.out.println( p3.getNombre() + " gano!!!");
        }

    }
        else{ //agregue una llave
            //////////////////////////SEGUNDA PELEA SI EL P2 GANA////////////////////////////////////////////////////
            //SE ROMPER DESPUES DEL PRIMER ATAQUE DEL ELFO.
            System.out.println( p2.getNombre() + " gano!!!");

            juego.inicializarElfos();
        
            System.out.println("Comieza la segunda batalla");

        System.out.println("Selecciona el personaje Elfo (Ingrese el numero del personaje deseado): ");
        index = 1;
        for (Elfo elfo : juego.getElfos()) {
            System.out.println((index++) + " - " + elfo.getNombre());
        }

        int personajeSeleccionado3 = Teclado.nextInt() - 1;
        Teclado.nextLine();

        Elfo p3 = juego.getElfos().get(personajeSeleccionado3);
        
        System.out.println("Personaje 1 es: " + p2.getNombre());
        System.out.println("Personaje 2 es: " + p3.getNombre());

        boolean turnoP3 = true;

        System.out.println("Comienza la batalla!");
        
        //mientras ambos tengan salud, pelear entre si
        //gameloop
        while(p2.estaVivo() && p3.estaVivo()){
            Object atacante;
            Personaje oponente;

            if (turnoP1){
                atacante = p2;
                oponente = p3;
            }
            else{
                atacante = p3;
                oponente = p2;
            }

            System.out.println("Ingrese el numero del hechizo que desea utilizar " + ((Personaje) atacante).getNombre());
            index = 1;
            for (Hechizo hechizo : ((Elfo) atacante).getHechizos()) {
                    System.out.println((index++) + " - " + hechizo.getNombre() +  " : " + hechizo.getDescripcion());
            }

            int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;
            Teclado.nextLine();

            Hechizo hechizo = ((Elfo) atacante).getHechizos().get(IndiceHechizoSeleccionado);

            System.out.println(((Personaje) atacante).getNombre() + " ataca a "+ ((Personaje) oponente).getNombre());
            
            System.out.println("Hechizo: nivel de daño: " + hechizo.getNivelDanio());
            System.out.println("Hechizo: nivel de energia: " + hechizo.getEnergiaMagica());
            
            System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

            Thread.sleep(1000);

            ((Elfo) atacante).atacar(oponente, hechizo);

            System.out.println("Salud del oponente: " + ((Personaje) oponente).getSalud());
            System.out.println("Energia del atacante: " + ((Elfo) atacante).getEnergiaMagica());

            Thread.sleep(1000);
            
            System.out.println("A "+ ((Personaje) oponente).getNombre() + " le queda "+ ((Wizard) oponente).getSalud() + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(1000);
        }

        if (p1.estaVivo()){
            System.out.println(p2.getNombre() + " gano!!!");
        }
        else{
            System.out.println( p3.getNombre() + " gano!!!");
        }


        }
    }
}
        
