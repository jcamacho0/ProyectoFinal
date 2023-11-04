package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Entrenador {

    public static void entrenador() {
        int opcEntrenador = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige una opcion para el entrenador del gimnasio: "
                + "\n1. Ver y reservar horas para el entrenador"
                + "\n2. Modificar o eliminar reservas con el entrenador"
                + "\n3. Regresar"));

        switch (opcEntrenador) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
            default:
                System.out.println("Opcion no Valida");
                System.exit(1);
        }//fin del switch opcEntrenador
    }//fin del metodo entrenador
}
