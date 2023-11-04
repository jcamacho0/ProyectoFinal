package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Baile {

    public static void baile() {
        int opcBaile = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige una opcion para la clase de Baile: "
                + "\n1. Reservar espacio para la clase de baile"
                + "\n2. Modificar o eliminar reservas de la clase de baile"
                + "\n3. Regresar"));

        switch (opcBaile) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
            default:
                System.out.println("Opcion no Valida");
                System.exit(1);
        }//fin del switch opcBaile
    }//fin del metodo baile
}
