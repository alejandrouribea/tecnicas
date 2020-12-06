/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.dao.impl;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.List;
import co.edu.udea.MVCDAO.dao.EstudianteDAO;
import static co.edu.udea.MVCDAO.dao.impl.EstudianteDAOList.estudiantesBD;
/**
 *
 * @author claudia serna
 */
public class EstudianteDAOFile implements EstudianteDAO {
    private static final String DELIMITADOR = ",";
    private static final String ARCHIVO = "estudiantes.txt";
    private BufferedWriter escritorBuffer;
    private FileWriter escritorFile;
    private File archivoEstudiante;
    private Scanner lector;

    public EstudianteDAOFile () {
        archivoEstudiante = new File(ARCHIVO);
        try{
            lector = new Scanner(archivoEstudiante);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error al abrir el archivo");
        } 
    }
    
    @Override
    public boolean almacenarEstudiante(EstudianteDTO estudiante){
        StringBuilder sb =new StringBuilder();
        sb.append(estudiante.getNombre());
        sb.append(DELIMITADOR);
        sb.append(estudiante.getApellido());
        sb.append(DELIMITADOR);
        sb.append(estudiante.getGenero());
        sb.append(DELIMITADOR);
        sb.append(estudiante.getDocumento());
        try{
            escritorFile =new FileWriter(archivoEstudiante);
            escritorBuffer = new BufferedWriter(escritorFile);
            escritorBuffer.write(sb.toString());
            escritorBuffer.newLine();
            escritorBuffer.close();  
            return true;                           
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "error al intentar almacenar un estudiante");
            e.printStackTrace();
        }        
        return false;
    }
    
    public List<EstudianteDTO> listarEstudiantes(){
        return null; //null, no tiene el proceso DAOList
    }
    
    public boolean eliminarEstudiante(){
      return false;  
    }
    
    public boolean actualizarEstudiante(){
       int opc = 0, indice = 0;
        String id;
        boolean x = false;
        //pedir  id para buscar estudiante
        id = JOptionPane.showInputDialog("ingrese documento para  buscar estudiante");
        System.out.println("tamaño "+estudiantesBD.size());
        for (int i = 0; i < estudiantesBD.size(); i++) {
            
            if (estudiantesBD.get(i).getDocumento().equals(id)) {
                indice = i;
                System.out.println("esto es indice "+ indice);
            }
        }
        //menu para  cambiar  dato
        do {
            opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite opcion a modificar 1. Nombre  2. Apellido  3. Genero  4.Documento"));
        } while (opc < 0 && opc > 6);

        //opera la  opcion  a  actaulizar  dato
        switch (opc) {
            case 1:
                //nombre
                String nombre = JOptionPane.showInputDialog("ingrese el nombre");
                estudiantesBD.get(indice).setNombre(nombre);
                x=true;
                break;
            case 2:
                //apellido
                String apellido = JOptionPane.showInputDialog("ingrese el apellido");
                estudiantesBD.get(indice).setApellido(apellido);
                x=true;
                break;
            case 3:
                //genero
                char genero = JOptionPane.showInputDialog("ingrese el genero").charAt(0);
                estudiantesBD.get(indice).setGenero(genero);
                x=true;
                break;
            case 4:
                //documento
                String identificacion = JOptionPane.showInputDialog("ingrese la identificacion");
                estudiantesBD.get(indice).setDocumento(identificacion);
                x=true;
                break;
            case 0:
                //salir
                System.exit(opc);
                break;
        }
        //toca  mirar   como funciona  el  boolean para crear variable   y  modificar  su  valor  sea  necesario
        return x;
    }

    @Override
    public List<EstudianteDTO> consultarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
