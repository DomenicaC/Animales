/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class Estudiante extends Persona{
    private Carrera carrera;
    
    //set
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    //get
    public Carrera getCarrera() {
        return carrera;
    }

    //to String

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.setCarrera(carrera);
    }
    
}
