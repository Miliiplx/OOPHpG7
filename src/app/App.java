package app;

import java.util.Scanner;

import app.personajes.Wizard;
import app.poderes.hechizos.Hechizo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Teclado = new Scanner(System.in);

        JuegoHP juego = new JuegoHP();

        System.out.println("Bienvenido al Mundo Mágico de Harry Potter");

        juego.inicializarWizards();

        System.out.println("Selecciona el personaje del primer jugador (Ingrese el numero del personaje deseado): ");
        int index = 1;
        for (Wizard wizard : juego.getWizards()) {
            System.out.println((index++) + " - " + wizard.getNombre());
        }

        int personajeSeleccionado1 = Teclado.nextInt() - 1;

        Wizard p1 = new Wizard();
        p1 = juego.getWizards().get(personajeSeleccionado1);
        
        System.out.println("Selecciona el personaje del segundo jugador (Ingrese el numero del personaje deseado): ");
        index = 1;
        for (Wizard wizard : juego.getWizards()) {
            System.out.println((index++) + " - " + wizard.getNombre());
        }
        
        int personajeSeleccionado2 = Teclado.nextInt() - 1;
        
        Wizard p2 = new Wizard();
        p2 = juego.getWizards().get(personajeSeleccionado2);
        
        System.out.println("Personaje 1 es: " + p1.getNombre());
        System.out.println("Personaje 2 es: " + p2.getNombre());

        boolean turnoP1 = true;

        System.out.println("Comienza la batalla!");
        
        //mientras ambos tengan salud, pelear entre si
        //gameloop
        while(p1.estaVivo() && p2.estaVivo()){
            Wizard atacante;
            Wizard oponente;

            if (turnoP1){
                atacante = p1;
                oponente = p2;
            }
            else{
                atacante = p2;
                oponente = p1;
            }

            System.out.println("Ingrese el numero del hechizo que desea utilizar " + atacante.getNombre());
            index = 1;
            for (Hechizo hechizo : atacante.getHechizos()) {
                    System.out.println((index++) + " - " + hechizo.getNombre() +  " : " + hechizo.getDescripcion());
            }

            int IndiceHechizoSeleccionado = Teclado.nextInt() - 1;

            System.out.println(atacante.getNombre() + " ataca a "+ oponente.getNombre());
            
            atacante.atacar(oponente, atacante.getHechizos().get(IndiceHechizoSeleccionado));
            
            System.out.println("A "+ oponente.getNombre() + " le queda "+ oponente.getSalud() + " de salud");

            turnoP1 = !turnoP1;

            //Pausa el programa por 2 segundos(2000 milisegundos = 2 segundos)
            Thread.sleep(1000);
        }

        if (p1.estaVivo()){
            System.out.println(p1.getNombre() + " gano!!!");
        }
        else{
            System.out.println( p2.getNombre() + " gano!!!");
        }

    }
}
