package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Proyectofinal10 {

    public static void main(String[] args) {
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
                peliculas();
                break;
                
            case 2:
                entrenador();
                break;
                
            case 3:
                yoga();
                break;
                
            case 4:
                baile();
                break;
                
            default:
                throw new AssertionError();
        }//finalde switch

    }//final de la clase
    
    public static void peliculas(){
        int opcPelicula = Integer.parseInt(JOptionPane.showInputDialog(
        "Elige una opcion para las salas de Peliculas: "
        + "\n1. Ver y reservar salas y peliculas"
        + "\n2. Modificar las salas de peliculas"
        + "\n3. Regresar"));
        
        switch(opcPelicula){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }//fin del switch opcPelicula
    }//fin del metodo peliculas
    
    public static void entrenador(){
        int opcEntrenador = Integer.parseInt(JOptionPane.showInputDialog(
        "Elige una opcion para el entrenador del gimnasio: "
        + "\n1. Ver y reservar horas para el entrenador"
        + "\n2. Modificar o eliminar reservas con el entrenador"
        + "\n3. Regresar"));
        
        switch (opcEntrenador){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }//fin del switch opcEntrenador
    }//fin del metodo entrenador

    public static void yoga(){
        int opcYoga = Integer.parseInt(JOptionPane.showInputDialog(
        "Elige una opcion para la clase de Yoga: "
        + "\n1. Reservar espacio para la clase de yoga"
        + "\n2. Modificar o eliminar reservas de la clase de yoga"
        + "\n3. Regresar"));
        
        switch (opcYoga){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }//fin del switch opcYoga
    }//fin del metodo yoga
    
        public static void baile(){
        int opcBaile = Integer.parseInt(JOptionPane.showInputDialog(
        "Elige una opcion para la clase de Baile: "
        + "\n1. Reservar espacio para la clase de baile"
        + "\n2. Modificar o eliminar reservas de la clase de baile"
        + "\n3. Regresar"));
        
        switch (opcBaile){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }//fin del switch opcBaile
    }//fin del metodo baile
}//final del main
