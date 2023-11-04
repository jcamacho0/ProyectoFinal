package proyectofinal1.pkg0;

import javax.swing.JOptionPane;

public class Yoga {

    public static void yoga() {
        int opcYoga = Integer.parseInt(JOptionPane.showInputDialog(
                "Elige una opcion para la clase de Yoga: "
                + "\n1. Reservar espacio para la clase de yoga"
                + "\n2. Modificar o eliminar reservas de la clase de yoga"
                + "\n3. Regresar"));

        switch (opcYoga) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
            default:
                System.out.println("Opcion no Valida");
                System.exit(1);
        }//fin del switch opcYoga
    }//fin del metodo yoga
}
