/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesempresa;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rodri
 */
class GestorClases {
    private static final int MAX_CLASES = 2;
    private Clase[] clases;

    public GestorClases() {
        this.clases = new Clase[MAX_CLASES];
        this.clases[0] = new Clase("Yoga", "7 pm");
        this.clases[1] = new Clase("Baile", "8 pm");
    }

    public void iniciarInterfaz() {
        JFrame frame = new JFrame("Gestión de Clases");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JButton reservarYogaButton = new JButton("Reservar para Clase de Yoga");
        JButton reservarBaileButton = new JButton("Reservar para Clase de Baile");
        JButton mostrarHorarioButton = new JButton("Mostrar Horarios Disponibles");

        reservarYogaButton.addActionListener(e -> reservarClase(0)); 
        reservarBaileButton.addActionListener(e -> reservarClase(1)); 
        mostrarHorarioButton.addActionListener(e -> mostrarHorario());

        JPanel panel = new JPanel();
        panel.add(reservarYogaButton);
        panel.add(reservarBaileButton);
        panel.add(mostrarHorarioButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    private void reservarClase(int indiceClase) {
        Clase claseSeleccionada = clases[indiceClase];
        if (claseSeleccionada != null) {
            if (claseSeleccionada.getEspaciosDisponibles() > 0) {
                Empleado empleado = obtenerEmpleado();
                claseSeleccionada.reservarEspacio(empleado);
                JOptionPane.showMessageDialog(null, "Reservando espacio para el empleado " + empleado.getId());
            } else {
                JOptionPane.showMessageDialog(null, "No hay espacios disponibles para la clase");
            }
        }
    }

    private void mostrarHorario() {
        StringBuilder horario = new StringBuilder("Horario de clases:\n");

        for (Clase clase : clases) {
            horario.append(clase.toString()).append("\n");
        }

        JOptionPane.showMessageDialog(null, horario.toString());
    }

    private Empleado obtenerEmpleado() {
        int id = obtenerNumero("Ingrese el ID del empleado:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        return new Empleado(nombre, id);
    }

    private int obtenerNumero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }
}
    

