/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.vista;

import javax.swing.JOptionPane;
import java.util.List;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import co.edu.udea.MVCDAO.control.EstudianteControl;
/**
 *
 * @author claudia serna
 */
public class EstudianteVista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteControl control = new EstudianteControl();
        String opcion = "";
        do {
            opcion = JOptionPane.showInputDialog("Bienvenido: \n 1. Resgistrar Estudiante. "
                    + "\n 2. Listar Estudiantes. \n 3. Salir");
          switch(opcion){ 
          case "1":
            String nombre = JOptionPane.showInputDialog("ingrese el nombre");
            String apellido = JOptionPane.showInputDialog("ingrese el apellido");
            String identificacion = JOptionPane.showInputDialog("ingrese la identificacion");
            char genero = JOptionPane.showInputDialog("ingrese el genero").charAt(0);
            EstudianteDTO estudiante = new EstudianteDTO(nombre,apellido,genero,identificacion);
            if(control.almacenarEstudiante(estudiante)){
               JOptionPane.showMessageDialog(null, "estudiante guardado");
            }else{
               JOptionPane.showMessageDialog(null, "estudiante no pudo ser ingresado"); 
            }
          break;
             case "2":  
                 //mostrar estudiantes  
          break; 
          }
          
          
        }while(!"3".equals(opcion));
    }
    
}
