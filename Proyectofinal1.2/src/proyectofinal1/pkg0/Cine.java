package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Cine {

    public void peliculas() {
        while (true) {
            int opcPelicula = Integer.parseInt(JOptionPane.showInputDialog(
                    "Elige una opcion para las salas de Peliculas: "
                    + "\n1. Mostrar salas y peliculas"
                    + "\n2. Reservar las salas de peliculas"
                    + "\n3. Modificar las salas de peliculas"
                    + "\n4. Regresar"));

            switch (opcPelicula) {
                case 1:
                    mostrar();
                    return;
                case 2:
                    reservar();
                    return;
                case 3:
                    modificar();
                    return;
                case 4:
                    break;
                default:
                    System.err.println("Opcion no Valida");
                    System.exit(1);
            }//fin del switch opcPelicula
        }//fin del while, permite regresar al menu previo.
    }//fin del metodo peliculas

    public void mostrar() {

    }
    public void reservar(){
        
    }

    public void modificar() {

    }

}//fin de la clase peliculas
