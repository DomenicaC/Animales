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
public class Profesor {
    private String titulo;
    private double salario;
    private String cargo;
    private List<Persona> personasP;
    
    public Profesor(){
         personasP=new ArrayList<>();
     }

    //set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //get
    public String getTitulo() {
        return titulo;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void agregarPersona(Persona personaP){
        personasP.add(personaP);
    }
    
    
}
