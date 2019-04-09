/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.clase.Perro;

/**
 *
 * @author Domenica Cañizares
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro = new Perro();
        
        perro.setNombre("Pancho");
        perro.setEdad(1);
        perro.setPeso(8.2);
        perro.setSexo("Macho");
        
        perro.comer();
        perro.dormir();
        perro.momerse();
        perro.jugar();
        perro.reproducirse();
        perro.datos();
        
    }
    
}
