package proyectofinal1.pkg0;

import javax.swing.*;

public class Proyectofinal10 {

    public static void main(String[] args) {

        //creando las nuevas instancias de las clases
        Secretaria secretaria = new Secretaria();
        Cine cine = new Cine();
        Entrenador entrenador = new Entrenador();
        Yoga yoga = new Yoga();
        Baile baile = new Baile();

        //crear empleados
        Empleado empleado1 = new Empleado("Sofia Vergara", 1234);
        Empleado empleado2 = new Empleado("Jimena Camacho", 2345);
        Empleado empleado3 = new Empleado("Manrique Torres", 3456);
        Empleado empleado4 = new Empleado("Moises Fonseca", 4567);
        
        //array de emleados
        Empleado[] empleados = {empleado1, empleado2, empleado3, empleado4};
        
        //metodo para ingresar al programa
        secretaria.ingresar();

        //crear la ventana principal
        JFrame frame = new JFrame("Programa de Resrvas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,160);
        
        //crear botones para cada opcion
        JButton cinesButton = new JButton("Salas de cines");
        JButton entrenadorButton = new JButton("Entrenador de Gimnasio");
        JButton yogaButton = new JButton("Clases de Yoga");
        JButton baileButton = new JButton("Clases de Baile");
        
        //configurar acciones
        cinesButton.addActionListener(e -> cine.peliculas());
        entrenadorButton.addActionListener(e -> entrenador.entrenador());
        yogaButton.addActionListener(e -> yoga.yoga());
        baileButton.addActionListener(e -> baile.baile());
        //e -> cine.peliculas() is a lambda expression that takes an event (e) as a parameter and 
        //invokes the peliculas() method on the cine object when the lambda is executed.
        //this is often used to provide a concise way of specifying the action that should be taken 
        //when an event (such as a button click) occurs. 
        
        //crear panel para organizar botones
        JPanel panel = new JPanel();
        panel.add(cinesButton);
        panel.add(entrenadorButton);
        panel.add(yogaButton);
        panel.add(baileButton);
        
        //agregar al jframe
        frame.getContentPane().add(panel);
        
        //hacerlo visible
        frame.setVisible(true);
        
        
        
        
    }//final de la clase

}//final del main
