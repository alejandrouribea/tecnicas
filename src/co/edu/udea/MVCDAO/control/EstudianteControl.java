/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.control;
import java.util.List;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import co.edu.udea.MVCDAO.negocio.EstudianteNegocio;
/**
 *
 * @author claudia serna
 */
public class EstudianteControl {
    EstudianteNegocio estudianteNegocio = new EstudianteNegocio();
    public boolean almacenarEstudiante(EstudianteDTO estudiante){
        boolean respuesta = estudianteNegocio.almacenarEstudiante(estudiante);
        return respuesta;
    }
}
   