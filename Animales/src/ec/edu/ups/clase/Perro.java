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
public class Perro extends Animal implements Acciones{
    
    
    
    @Override //sobre escritura de metodos polimorfismo
    
    public void comer() {
        
        
        
        System.out.println("El perro "+this.getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro "+this.getNombre()+" esta durmiendo");
    }

    @Override
    public void momerse() {
        System.out.println("El perro "+this.getNombre()+" esta moviendose");
    }

    @Override
    public void jugar() {
        System.out.println("El perro "+this.getNombre()+" esta juganado");
    }

    @Override
    public void reproducirse() {
        System.out.println("El perro "+this.getNombre()+" puede reproducir \n");
    }
    
    public void datos(){
        System.out.println("El nombre del perro es: "+this.getNombre());
        System.out.println("La edad del perro "+this.getNombre()+" es: "+this.getEdad()+" años");
        System.out.println("El sexo del perro " +this.getNombre()+" es: "+this.getSexo());
        System.out.println("El peso del perro "+this.getNombre()+" es: "+this.getPeso()+" kilos");
    }
    
}
