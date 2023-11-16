package proyectofinal1.pkg0;

import javax.swing.JOptionPane;
import javax.swing.*;

public class Yoga {

    public static final int MAX = 30;//Max espacios, final significa que no se podra superar los 30
    private Empleado[] empleados;
    public int espacios; //espacios disponibles

    //constructor
    public Yoga() {
        this.empleados = new Empleado[MAX];
        this.espacios = MAX;
    }//fin del constructor

    public void yoga() {
        //ventana de yoga
        JFrame frame = new JFrame("Clases de Yoga");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        //crear botones para las acciones
        JButton reservarButton = new JButton("Reservar clase de Yoga");
        JButton mostHorarioButton = new JButton("Mostrar horario de Yoga");
        JButton modEliminarButton = new JButton("Modificar o eliminar reservas");

        //configurar las acciones de cada boton
        reservarButton.addActionListener(e -> reservarEspacio());
        mostHorarioButton.addActionListener(e -> mostHorario());
        modEliminarButton.addActionListener(e -> modEliminar());

        //crear panel para organizar los botones
        JPanel panel = new JPanel();
        panel.add(reservarButton);
        panel.add(mostHorarioButton);
        panel.add(modEliminarButton);

        //agregar al jframe
        frame.getContentPane().add(panel);

        //hacerlo visible
        frame.setVisible(true);

    }//fin del metodo yoga

    public void reservarEspacio() {
        if (espacios > 0) {
            Empleado empleado = obtenerEmpleado();
            empleados[MAX - espacios] = empleado;
            espacios--;
            JOptionPane.showMessageDialog(null, "Reservando espacio para empleado " + empleado.getId());
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacios disponibles");
        }//fin del else
    }//fin del metodo reservaEspacio

    public void mostHorario() {
        StringBuilder horario = new StringBuilder("Horario de clases:\n");

        //los espacios reservados y mostrar informacion sobre los empleados
        for (int i = 0; i < MAX - espacios; i++) {
            horario.append("Espacio ").append(i + 1).append(": ");
            if (empleados[i] != null) {
                horario.append("Reservado para empleado ").append(empleados[i].getId()).append(empleados[i].getNombre());
            } else {
                horario.append("No reservado");
            }
            horario.append("\n");
        }

        JOptionPane.showMessageDialog(null, horario.toString());
    }

    public void modEliminar() {
        if (espacios < MAX) {
            String[] options = new String[MAX - espacios];
            for (int i = 0; i < MAX - espacios; i++) {
                options[i] = "Empleado " + empleados[i].getId();
            }//fin del for 

            String selectedOption = (String) JOptionPane.showInputDialog(null,
                    "Selecciona el empleado:",
                    "Modificar o Eliminar reserva",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (selectedOption != null) {
                int selectedIn = Integer.parseInt(selectedOption.replaceAll("\\D+", "")) - 1;
                Empleado selectedEmpleado = empleados[selectedIn];

                //modificar o borrar
                empleados[selectedIn] = null;
                espacios++;
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }//fin del if 
        } else {
            JOptionPane.showMessageDialog(null, "No hay reserva para modificar o eliminar");
        }//fin del else
    }//fin del metodo modificar y eliminar reservas

    private Empleado obtenerEmpleado() {
        //obtener un empleado 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        return new Empleado(nombre, id);
    }

}//fin de la clase
