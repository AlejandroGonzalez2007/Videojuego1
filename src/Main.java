//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Videojuego;
public class Main {
    static void main() {
        Videojuego juego1= new Videojuego();
        Videojuego juego2= new Videojuego();
        Videojuego juego3= new Videojuego();

        juego1.activo = true;
        juego1.genero = "Terror";
        juego1.nombre = "FNAF";
        juego1.version = "6,7";

        juego2.activo = true;
        juego2.genero ="open world";
        juego2.nombre= "minecraft";
        juego2.version= "1.26.7";


        juego3.activo = true;
        juego3.genero ="Shooter";
        juego3.nombre= "Fortnite";
        juego3.version= "69";

        juego1.Inciar();
        juego1.mostrarInformacion();
        juego1.mostrarVersion();
        juego1.Cerrar();

        juego2.Inciar();
        juego2.mostrarInformacion();
        juego2.mostrarVersion();
        juego2.Cerrar();

        juego3.Inciar();
        juego3.mostrarInformacion();
        juego3.mostrarVersion();
        juego3.Cerrar();


    }
}
