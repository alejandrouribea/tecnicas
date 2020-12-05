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
/**
 *
 * @author claudia serna
 */
public class EstudianteDAOFile implements EstudianteDAO {
    private static final String DELIMITADOR = ",";
    private static final String ARCHIVO = "Documentos";
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
       return false; 
    }

    @Override
    public List<EstudianteDTO> consultarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
