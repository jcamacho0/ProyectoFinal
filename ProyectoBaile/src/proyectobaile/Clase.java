/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobaile;

import java.util.*;

class Clase {
    private String nombre;
    private int cupoMaximo;
    private int cupoActual;
    private List<String> participantes;

    public Clase(String nombre, int cupoMaximo) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.cupoActual = 0;
        this.participantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public boolean agregarParticipante(String nombreParticipante) {
        if (cupoActual < cupoMaximo) {
            participantes.add(nombreParticipante);
            cupoActual++;
            return true;
        } else {
            return false; 
        }
    }

    public void mostrarParticipantes() {
        System.out.println("Participantes en la clase de " + nombre + ":");
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }
}




