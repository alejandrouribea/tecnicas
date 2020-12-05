/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.dao.impl;

import java.util.List;
import java.util.ArrayList;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import co.edu.udea.MVCDAO.dao.EstudianteDAO;
/**
 *
 * @author claudia serna
 */
public class EstudianteDAOList implements EstudianteDAO{
    public static final List<EstudianteDTO> estudiantesBD = new ArrayList<EstudianteDTO>();

	public boolean almacenarEstudiante(EstudianteDTO estudiante) {
		//no lo implemento porque se adicionan uno a uno los estudiantes
                //ese proceso ya esta implementado en en estudiantesDAOFile
	    return estudiantesBD.add(estudiante);
        }
     
	@Override
        public List<EstudianteDTO>listarEstudiantes(){
            List<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
            for(EstudianteDTO estudiante: estudiantesBD){
                estudiantes.add(estudiante);
            }
            return estudiantes;
        }
        
        public boolean actualizarEstudiantes(){
            return false;
        }//DAOList
        
    
        public boolean eliminarEstudiantes(){
            return false;
        }//DAOList

    @Override
    public List<EstudianteDTO> consultarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   
        
 /*       public PersonaDTO consultarPersona(String identificacion) {
		for (PersonaDTO persona : personasBD) {
			if (persona.getDocumento().equals(identificacion))
				return persona;
		}
		return null;
	}

	@Override
	public List<PersonaDTO> consultarPersonas() {
		List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
		for (PersonaDTO persona : personasBD) {
			personas.add(persona);
		}
		return personas;
	}

	@Override
	public boolean eliminarPersona(String identificacion) {
		for (PersonaDTO persona : personasBD) {
			if (persona.getDocumento().equals(identificacion)) {
				personasBD.remove(persona);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean actualizarPersona(PersonaDTO parametro) {
		for (PersonaDTO persona : personasBD) {
			if (persona.getDocumento().equals(parametro.getDocumento())){
				personasBD.remove(persona);
				personasBD.add(parametro);
				return true;
			}
				
		}
		return false;
	}
}*/

