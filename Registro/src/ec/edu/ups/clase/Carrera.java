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
public class Carrera {
    private int codigoC;
    private String nombreC;
    private List<Materia> materias;
    private int numSemestre;
    private int numEst;
    private String Titulo;

    public Carrera(){
         materias=new ArrayList<>();
     }
    
    //set
    public void setCodigoC(int codigoC) {
        this.codigoC = codigoC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public void setNumEst(int numEst) {
        this.numEst = numEst;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    //get
    public int getCodigoC() {
        return codigoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public int getNumEst() {
        return numEst;
    }

    public String getTitulo() {
        return Titulo;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
    
    //to Stirng

    @Override
    public String toString() {
        return "Carrera{" + "codigoC=" + codigoC + ", nombreC=" + nombreC + ", materias=" + materias + ", numSemestre=" + numSemestre + ", numEst=" + numEst + ", Titulo=" + Titulo + '}';
    }
    
    
}
