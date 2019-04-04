/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

/**
 *
 * @author Domenica Cañizares
 */
public class Grupo {
    private int codigoG;
    private String nomG;
    private int cupo;

    //set
    public void setCodigoG(int codigoG) {
        this.codigoG = codigoG;
    }

    public void setNomG(String nomG) {
        this.nomG = nomG;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    //get
    public int getCodigoG() {
        return codigoG;
    }

    public String getNomG() {
        return nomG;
    }

    public int getCupo() {
        return cupo;
    }
    
    //to String

    @Override
    public String toString() {
        return "Grupo{" + "Codigo Grupo= " + codigoG + ", Nombre Grupo= " + nomG + ", Cupo= " + cupo + '}';
    }
    
    
}
