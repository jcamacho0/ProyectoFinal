package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Cine {

    public void peliculas() {
        while (true) {
            int opcPelicula = Integer.parseInt(JOptionPane.showInputDialog(
                    "Elige una opcion para las salas de Peliculas: "
                    + "\n1. Ver y reservar salas y peliculas"
                    + "\n2. Modificar las salas de peliculas"
                    + "\n3. Regresar"));

            switch (opcPelicula) {
                case 1:
                    verYreservar();
                    break;
                case 2:
                    modificar();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opcion no Valida");
                    System.exit(1);
            }//fin del switch opcPelicula
        }//fin del while, permite regresar al menu previo.
    }//fin del metodo peliculas

    public void verYreservar() {

    }

    public void modificar() {

    }

}//fin de la clase peliculas
