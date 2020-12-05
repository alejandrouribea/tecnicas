 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.dao;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import java.util.List;

/**
 *
 * @author claudia serna
 */
public interface EstudianteDAO {
    public boolean almacenarEstudiante(EstudianteDTO estudiante);
    public List<EstudianteDTO> listarEstudiantes();
    public List<EstudianteDTO> consultarEstudiante();
    public boolean eliminarEstudiante();
    public boolean actualizarEstudiante();    
}
