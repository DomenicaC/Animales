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
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class Interfaz {
    public static void main(String [] args){
        
        //sede 
        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle vieja", "166415241");
        //System.out.println(sedeCuenca);
        
        //carrera
        Carrera car = new Carrera(1, "Computacion", 1, 12, "Ingeniero en Ciencias de la Computacion");
        //System.out.println(car);
        Carrera car1 = new Carrera( 2, "Telematica", 1, 15, "Telematico");
        Carrera car2 = new Carrera( 3, "Mecatronica", 1, 44, "Ingeniero Mecatronico");
        
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
        //Profesor pro2= new Profesor("Doctor", 400.6, "Director de carrera", 2, "Cleo", "0469215678", "0965478213", "Baños", "cleo@est.ups.edu.ec");
            
        //Estudiante
        Estudiante est = new Estudiante(1, "Pepito", "0123465789", "0965478235", "Luis Cordero", "pepito@upsedu.ec");
        Estudiante est1 = new Estudiante(2, "Juanito", "0129876543", "0986479215", "Remigio Crespo", "juanito@upsedu.ec");
        Estudiante est2 = new Estudiante(3, "Marta", "0265478935", "0975698231", "Max. uhle", "pepito@upsedu.ec");
        Estudiante est3 = new Estudiante(4, "Cecilia", "032564789", "0345216983", "Pio Bravo", "cecilia@est.ups.edu.ec");
        
        //grupo
        Grupo gru = new Grupo(1, "Grupo 8", 1);
        Grupo gru1 = new Grupo(2, "Grupo 11", 5);
        /*
        //historial
        calificacionAlgebraEst.setMateria(Algebra);
        calificacionAlgebraEst.setMateria(Algebra);       
        calificacionAlgebraEst.setMateria(Algebra);       
        calificacionAlgebraEst.setMateria(Algebra);
        calificacionAlgebraEst.setMateria(Algebra);
        calificacionAlgebraEst.setMateria(Algebra);
        */
                
                
        
        HistorialCalificacion hist = new HistorialCalificacion(1, 10, 2, 7);
        HistorialCalificacion hist1 = new HistorialCalificacion(1, 5, 2, 8);
        HistorialCalificacion hist2 = new HistorialCalificacion(1, 4, 2, 5);
        
        //sedeAgredar/carrera
        sedeCuenca.agregarCarrera(car);
        sedeCuenca.agregarCarrera(car);
        sedeCuenca.agregarCarrera(car2);
        System.out.println("Sede Cuenca \n"+sedeCuenca);
        
        //carreraAgregar   -materia
        car.agregarMateria(mate);
        car.agregarMateria(etica);
        
        car1.agregarMateria(algebra);
        car1.agregarMateria(progra);
        
        car2.agregarMateria(esc);
        car2.agregarMateria(logica);
         //System.out.println("Sede Cuenca 2"+ sedeCuenca);
         
         //materia /grupo
         
         mate.setGrupos(gru1);
         mate.setProfesores(pro1);
         
         algebra.setGrupos(gru);
         algebra.setProfesores(pro);
         
         progra.setGrupos(gru1);
         progra.setProfesores(pro);
         
         esc.setGrupos(gru1);
         esc.setProfesores(pro1);
         
         etica.setGrupos(gru);
         etica.setProfesores(pro);
         
         logica.setGrupos(gru);
         logica.setProfesores(pro1);
         
         //System.out.println("Sede Cuenca 3"+ sedeCuenca);
         
         //estudiante/carrera/calificaciones
         
         est.setCarrera(car2);
         est1.setCarrera(car);
         est2.setCarrera(car1);
         
         System.out.println("Datos Estudiante 1 \n"+est);
         System.out.println("Datos Estudiante 2 \n"+est1);
         System.out.println("Datos Estudiante 3 \n"+est2);
        /*
        
        
         
        
        
        //agregarHistorial
        hist.agregarEstudiante(est);
        
        hist1.agregarEstudiante(est1);
        
        hist2.agregarEstudiante(est2);
        
        //agregar
        est.agregarCali(hist);
        est1.agregarCali(hist1);
        est2.agregarCali(hist2);
        
        //imprimir
        System.out.println(sedeCuenca);
        System.out.println(est);
        System.out.println(est1);
        System.out.println(est2);
        
        
        
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(154);
        estudiante.setNombre("Pedro");
        estudiante.setCedula("0145698723");
        estudiante.setTelefono("3012113");
        estudiante.setDireccion("Miraflores");
        estudiante.setCorreo("pedro@est.ups.edu.ec");
        
        //Grupo
        Grupo gru1 = new Grupo();
        gru1.setCodigoG(1);
        gru1.setNomG("Grupo 1");
        gru1.setCupo(6);
        
        //Materia
        Materia mate1 = new Materia();
        mate1.setCodigoM(2);
        mate1.setGrupos(gru1);
        mate1.setNivelM(4);
        mate1.setNombreM("Matematicas Avanzadas");
        mate1.setNumCreditos(4);
        mate1.setNumHoras(260);
        
        //Carrera
        Carrera compu = new Carrera();
        compu.setCodigoC(3);
        compu.setNombreC("Ingenieria en Computación");
        compu.agregarMateria(mate1);
        compu.setNumEst(100);
        compu.setNumSemestre(10);
        compu.setTitulo("Ingeniero en ciencias de la computación");
        
        //Sede
        Sede cue = new Sede();
        cue.setCarreras((List<Carrera>) compu);
        cue.setCodigoS(4);
        cue.setDirecS("Calle Vieja");
        cue.setNomS("El vecino");
        cue.setTelfS("74632879");
        
        //Profesor
        Profesor profesor = new Profesor();
        profesor.setCargo("Profesor");
        profesor.setCedula("0136524931");
        profesor.setCodigo(5);
        profesor.setCorreo("julio@ups.edu.ec");
        profesor.setDireccion("El Batan");
        profesor.setNombre("Julio");
        profesor.setSalario(500);
        profesor.setSede(cue);
        
        System.out.println(profesor);
        
        //HistorialCalificaciones
        HistorialCalificacion historial = new HistorialCalificacion();
        historial.setAprovechamiento1(20);
        historial.setExamen1(15);
        historial.setMateria(mate1);
        historial.agregarEstudiante(estudiante);
        
        //agregar
        //sedeCuenca.agregarCarrera(car);
                //carrera 2 materias
                //materia i grupo y un profesor con set 
                //2grupos
                //historial saolo de un estudiante
                //4 listas 1 mateia notas
        */
    }
}
