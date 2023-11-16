package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Entrenador {

    public static void entrenador() {
        
        while(true){
        int opcEntrenador = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige una opcion para el entrenador del gimnasio: "
                + "\n1. Mostrar horas para el entrenador"
                + "\n2. Reservar horas para el entrenador"
                + "\n2. Modificar o eliminar reservas con el entrenador"
                + "\n3. Regresar"));

        switch (opcEntrenador) {
            case 1:
                return;
            case 2:
                return;
            case 3:
                break;
            default:
                System.err.println("Opcion no Valida");
                System.exit(1);
        }//fin del switch opcEntrenador
    }//fin del metodo entrenador
}//fin del while true
}
