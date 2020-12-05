/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.MVCDAO.modelo;
import org.omg.CORBA.IdentifierHelper;
//POJO de estudiante Plain Old Java Object
//DTO Data Transfer 
/**
 *
 * @author claudia serna
 */
public class EstudianteDTO {
    private String nombre;
    private String apellido;
    private char genero;
    private String documento;

    public EstudianteDTO() {
    }

    public EstudianteDTO(String nombre, String apellido, char genero, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    
    @Override
    public String toString() {
        return "EstudianteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", documento=" + documento + '}';
    }

    
}