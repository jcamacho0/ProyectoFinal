/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectobaile;

/**
 *
 * @author rodri
 */

public class ControlClases {
    public static void main(String[] args) {
        Clase claseYoga = new Clase("Yoga", 30);
        Clase claseBaile = new Clase("Baile", 30);

        for (int i = 1; i <= 35; i++) {
            boolean agregadoYoga = claseYoga.agregarParticipante("Participante Yoga " + i);
            boolean agregadoBaile = claseBaile.agregarParticipante("Participante Baile " + i);

            if (!agregadoYoga) {
                System.out.println("No hay cupo en la clase de Yoga para el Participante Yoga " + i);
            }
            if (!agregadoBaile) {
                System.out.println("No hay cupo en la clase de Baile para el Participante Baile " + i);
            }
        }

        claseYoga.mostrarParticipantes();
        claseBaile.mostrarParticipantes();
    }
}
