/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesempresa;

/**
 *
 * @author rodri
 */
class Clase {
    private String tipo; //ya sea yoga o de la clase de baile 
    private String horario;
    private Empleado[] empleados;
    private static final int MAX_ESPACIOS = 30;
    private int espaciosDisponibles;

    public Clase(String tipo, String horario) {
        this.tipo = tipo;
        this.horario = horario;
        this.empleados = new Empleado[MAX_ESPACIOS];
        this.espaciosDisponibles = MAX_ESPACIOS;
    }

    public void reservarEspacio(Empleado empleado) {
        if (espaciosDisponibles > 0) {
            empleados[MAX_ESPACIOS - espaciosDisponibles] = empleado;
            espaciosDisponibles--;
        }
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    @Override
    public String toString() {
        return "Clase de " + tipo + " a las " + horario + ": " +
                (MAX_ESPACIOS - espaciosDisponibles) + " espacios reservados de " + MAX_ESPACIOS;
    }
}
    
