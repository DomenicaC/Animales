package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Domenica Cañizares
 */
public class Pez extends Animal implements Acciones{

    @Override
    public void comer() {
        System.out.println("El pez  "+this.getNombre()+" Esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El pez "+this.getNombre()+" esta durmiendo");
    }

    @Override
    public void momerse() {
        System.out.println("El pez "+this.getNombre()+" esta moviendose");
    }

    @Override
    public void jugar() {
        System.out.println("El pez "+this.getNombre()+" esta jugando");
    }

    @Override
    public void reproducirse() {
        System.out.println("El pez "+this.getNombre()+" esta reproduciendose");
    }
    
    
    
}
