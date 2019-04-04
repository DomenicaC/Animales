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
public class Estudiante {
    private Carrera carrera;
    private Persona persona;
    private List<Persona> personas;
    
    public Estudiante(){
         personas=new ArrayList<>();
     }

    //set
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    

    //get
    public Carrera getCarrera() {
        return carrera;
    }

    public Persona getPersona() {
        return persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }
    
    
    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    //to String

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + ", persona=" + persona + ", personas=" + personas + '}';
    }
    
    
}
