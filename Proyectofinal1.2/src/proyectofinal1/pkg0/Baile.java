package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Baile {

    public static void baile() {
        int opcBaile = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige una opcion para la clase de Baile: "
                + "\n1. Reservar espacio para la clase de baile"
                + "\n2. Mostrar los horarios de las clases de baile"
                + "\n3. Modificar o eliminar reservas de la clase de baile"
                + "\n4. Regresar"));

        switch (opcBaile) {
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                break;
            default:
                System.err.println("Opcion no Valida");
                System.exit(1);
        }//fin del switch opcBaile
    }//fin del metodo baile
}
