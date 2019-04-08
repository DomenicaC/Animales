/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import ec.edu.ups.clase.Carrera;
import ec.edu.ups.clase.Estudiante;
import ec.edu.ups.clase.Grupo;
import ec.edu.ups.clase.HistorialCalificacion;
import ec.edu.ups.clase.Materia;
import ec.edu.ups.clase.Profesor;
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
        //System.out.println(car);
        Carrera car1 = new Carrera( 2, "Telematica", 1, 15, "Telematico");
        Carrera car2 = new Carrera( 3, "Mecatronica", 1, 44, "Ingeniero Mecatronico");
     
        
        //sede 
        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "166415241");
        System.out.println(sedeCuenca);
            
        //Materia
        
        Materia mate = new Materia(1 , "Matematicas Avanzadas", 2, 130, 4);
        Materia etica = new Materia(2 , "Etica", 3, 80, 5);
        Materia algebra = new Materia(3 , "Algebra", 6, 100, 4);
        Materia progra = new Materia(4 , "Programacion", 6, 260, 6);
        Materia esc = new Materia(5 , "Estrutura de datos", 5, 200, 3);
        Materia logica = new Materia(6 , "Logica", 1, 80, 7);
        
        
        
        //Profesor
        Profesor pro= new Profesor("Ingeniero", 500.5, "Profesor", 1, "Pedro", "0246897563","0946256785", "Eloy Alfaro","pedro@est.ups.edu.ec");
        Profesor pro1= new Profesor("Licenciado", 400.6, "Profesor", 2, "Rosa", "0365484578","0963259712", "Calle vieja", "rosa@est.ups.edu.ec");
        Profesor pro2= new Profesor("Doctor", 400.6, "Director de carrera", 2, "Cleo", "0469215678", "0965478213", "Baños", "cleo@est.ups.edu.ec");
                
        //grupo
        Grupo gru = new Grupo(1, "Grupo 8", 1);
        Grupo gru1 = new Grupo(2, "Grupo 11", 5);
        Grupo gru2 = new Grupo(3, "Grupo 1", 3);
        
        //historial
        HistorialCalificacion hist = new HistorialCalificacion(1, 10, 2, 7);
        HistorialCalificacion hist1 = new HistorialCalificacion(1, 5, 2, 8);
        HistorialCalificacion hist2 = new HistorialCalificacion(1, 4, 2, 5);
        
        
        //carreraAgregar        //carreraAgregar

        car.agregarMateria(mate);
        car.agregarMateria(etica);
        System.out.println("Carrera de Computacion");
        System.out.println(car);
        
        car1.agregarMateria(algebra);
        car1.agregarMateria(progra);
        System.out.println("Carrera de Telematica");
        System.out.println(car1);
        
        car2.agregarMateria(esc);
        car2.agregarMateria(logica);
        System.out.println("Carrera de Mecatronica");
        System.out.println(car2);
        
        //sedeAgredar
        sedeCuenca.agregarCarrera(car);
        sedeCuenca.agregarCarrera(car1);
        sedeCuenca.agregarCarrera(car2);
        System.out.println("Carreras de la Sede Cuenca");
        System.out.println(sedeCuenca);
        
        //agregarHistorial
        hist.agregarEstudiante(est);
        hist1.agregarEstudiante(est1);
        hist2.agregarEstudiante(est2);
        
        //agregar
        //sedeCuenca.agregarCarrera(car);
                //carrera 2 materias
                //materia i grupo y un profesor con set 
                //2grupos
                //historial saolo de un estudiante
                //4 listas 1 mateia notas
        
    }
}
