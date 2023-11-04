package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Proyectofinal10 {

    public static void main(String[] args) {

        //creando las nuevas instancias de las clases
        Secretaria secretaria = new Secretaria();
        Cine cine = new Cine();
        Entrenador entrenador = new Entrenador();
        Yoga yoga = new Yoga();
        Baile baile = new Baile();

        //metodo para ingresar al programa
        secretaria.ingresar();

        //opciones
        int reserva = Integer.parseInt(JOptionPane.showInputDialog(
                "Crear reserva: "
                + "\n1. Salas de peliculas"
                + "\n2. Entrenador personal en el Gimnasio"
                + "\n3. Clases de yoga"
                + "\n4. Clases de baile"));

        // switch para elegir la reserva a crear
        switch (reserva) {
            case 1:
                cine.peliculas();
                break;

            case 2:
                entrenador.entrenador();
                break;

            case 3:
                yoga.yoga();
                break;

            case 4:
                baile.baile();
                break;

            default:
                System.err.println("Error vuelve a intentar");
                System.exit(1);
        }//finalde switch 

    }//final de la clase



}//final del main
