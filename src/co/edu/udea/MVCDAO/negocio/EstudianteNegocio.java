/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.negocio;

import java.util.List;
import java.util.ArrayList;

import co.edu.udea.MVCDAO.dao.EstudianteDAO;
import co.edu.udea.MVCDAO.dao.impl.EstudianteDAOFile;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;

/**
 *
 * @author claudia serna
 */
public class EstudianteNegocio {
    EstudianteDAOFile EstudianteDAO =new EstudianteDAOFile();
    
    public boolean almacenarEstudiante(EstudianteDTO estudiante){
        boolean resultado = EstudianteDAO.almacenarEstudiante(estudiante);
        return resultado;
        
    }
    public List<EstudianteDTO> consultarEstudiante(){
      return EstudianteDAO.consultarEstudiante();
    } 
    public boolean modificarEstudiante(){
        boolean resultado = EstudianteDAO.actualizarEstudiante();
        return resultado;
    }
}
