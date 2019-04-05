/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clase.Carrera;
import ec.edu.ups.clase.Estudiante;
import ec.edu.ups.clase.Materia;
import ec.edu.ups.clase.Sede;

/**
 *
 * @author Domenica Cañizares
 */
public class Interfaz {
    public static void main(String [] args){
        //Estudiante
        Estudiante est = new Estudiante(1, "Pepito", "0123465789", "0965478235", "Luis Cordero", "pepito@upsedu.ec");
        Estudiante est1 = new Estudiante(2, "Juanito", "0129876543", "0986479215", "Remigio Crespo", "juanito@upsedu.ec");
        Estudiante est2 = new Estudiante(3, "Marta", "0265478935", "0975698231", "Max. uhle", "pepito@upsedu.ec");
        
        
        //carrera
        Carrera car = new Carrera(1, "Computacion", 1, 12, "Ingeniero");
        System.out.println(car);
        Carrera car1 = new Carrera( 2, "Telematica", 1, 15, "Telematico");
        Carrera car2 = new Carrera( 3, "Mecatronica", 1, 44, "Ingeniero Mecatronico");
     
        
        //sede 
        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "166415241");
            
        //Materia
        
        Materia mate = new Materia(1 , "Matematicas Avanzadas", 2, 130, 4);
        Materia etica = new Materia(2 , "Etica", 3, 80, 5);
        Materia algebra = new Materia(3 , "Algebra", 6, 100, 4);
        Materia progra = new Materia(4 , "Programacion", 6, 260, 6);
        Materia esc = new Materia(5 , "Estrutura de datos", 5, 200, 3);
        Materia logica = new Materia(6 , "Logica", 1, 80, 7);
        
        
        
        //Profesor
        //Profesor por= Profesor()
        
        
                
        //agregar
        //sedeCuenca.agregarCarrera(car);
                //carrera 2 materias
                //materia i grupo y un profesor con set 
                //2grupos
                //historial saolo de un estudiante
                //4 listas 1 mateia notas
        
    }
}
