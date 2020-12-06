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
import javax.swing.JOptionPane;

/**
 *
 * @author claudia serna
 */
public class EstudianteDAOList implements EstudianteDAO {

    public static final List<EstudianteDTO> estudiantesBD = new ArrayList<EstudianteDTO>();

    public boolean almacenarEstudiante(EstudianteDTO estudiante) {
        //no lo implemento porque se adicionan uno a uno los estudiantes
        //ese proceso ya esta implementado en en estudiantesDAOFile
        return estudiantesBD.add(estudiante);
    }

    @Override
    public List<EstudianteDTO> listarEstudiantes() {
        List<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();
        for (EstudianteDTO estudiante : estudiantesBD) {
            estudiantes.add(estudiante);
        }
        return estudiantes;
    }

    //por  revisar
    @Override
    public boolean actualizarEstudiante() {
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
    }//DAOList

    //por  revisar
    public boolean eliminarEstudiantes() {
        String id;
        boolean x = false;
        //pedir  id para buscar estudiante
        id = JOptionPane.showInputDialog("ingrese documento para  buscar estudiante");

        //recorrer  el  array list para   buscar  y  eliminar por indice
        for (int i = 0; i < estudiantesBD.size(); i++) {
            if (estudiantesBD.get(i).getDocumento().equals(id)) {
                estudiantesBD.remove(i);
                x=true;//mirar  si es  asi
            }
        }
        //toca  mirar   como funciona  el  boolean para crear variable   y  modificar  su  valor  sea  necesario
        return x;
    }//DAOList

    @Override
    public List<EstudianteDTO> consultarEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEstudiante() {
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
