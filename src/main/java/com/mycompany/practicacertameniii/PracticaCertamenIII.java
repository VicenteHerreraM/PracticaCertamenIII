/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicacertameniii;

import java.util.Scanner;

/**
 *
 * @author vice1
 */
public class PracticaCertamenIII {

    public static void main(String[] args) {
        Universidada U = new Universidada();
        Universidada Uni = new Universidada();
        Carreras C = new Carreras();
        Scanner entrada = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        int opcion1;
        Carreras carrera = null;
        Alumnos alumno;
        
        do{
            System.out.println("1 Agregar Carrera");
            System.out.println("2 Mostrar carreras");
            System.out.println("3 Agregar alumno");
            System.out.println("4 Obtener alumno");
            System.out.println("5 Eliminar alumno");
            System.out.println("6 Modificar datos del alumno");
            System.out.println("7 Mostrar Alumnos");
            System.out.println("0 Salir");
            opcion1 = opcion.nextInt();
            
            switch(opcion1){
                case 1:
                    System.out.println("Ingrese los datos de la carrera");
                    System.out.println("Nombre");
                    String nombre = entrada.next();
                    System.out.println("ID");
                    int id = entrada.nextInt();
                    System.out.println("Area de saber");
                    String areaSaber = entrada.next();
                    
                    carrera = new Carreras(id , nombre , areaSaber);
                    
                    if(U.agregarCarrera(carrera)){
                        System.out.println("Se ha agredado correctamente la carrera");
                    }
                    break;
                case 2:
                    U.mostrarCarreras();
                    break;
                case 3:
                    System.out.println("Ingrese el id de la carrera");
                    int idCarrera = entrada.nextInt();
                    if(U.verificarCarrera(idCarrera)){
                        System.out.println("Nombre de alumno");
                        String nombreAlumno = entrada.next();
                        System.out.println("Rut de alumno");
                        int rutAlumno = entrada.nextInt();
                    
                        alumno = new Alumnos (rutAlumno , nombreAlumno);
                        
                        if(U.agregarAlumno(idCarrera, alumno))
                            System.out.println("Se ha agredado correctamente el alumno");

                    }else{
                        System.out.println("No ha sido podible agregar al alumno");

                    }
                    break;
                case 4:
                    System.out.println("Ingrede el rut del alumno que desea buscar");
                    int rutAlumno = entrada.nextInt();
                    U.obtenerAlumno(rutAlumno);
                    break;
                    
                case 5:
                    System.out.println("Ingrede el rut del alumno que desea eliminar");
                    int idAlumno = entrada.nextInt();
                    if(U.elimiarAlumnos(idAlumno)){
                        System.out.println("El alumno ha sido eliminado");
                    }else{
                        System.out.println("No ha sido posible encontrar al alumno, porfavor revisar los datos ingresados");

                    }
                    break;
                 
                case 6:
                    System.out.println("Ingrede su rut para poder identificarlo");
                    int alumnoID = entrada.nextInt();
                    /*if(C.verificarAlumno(alumnoID)){
                        U.modificarDatosAlumno(rutAlumno);
                    }*/
                    U.modificarDatosAlumno(alumnoID);
                    break;
                case 7:
                    int i;
                    System.out.println("Datos de alumnos ");
                    
                    for(Carreras carrerita : U.carreritas){
                        System.out.println("Carrera "+carrerita.getNombre());
                        for(Alumnos alumnito : carrerita.getEstudiantes()){
                            System.out.println("Nombre alumno "+alumnito.getNombre());
                            System.out.println("Rut alumno "+alumnito.getRut());
                        }
                    }

                    break;
                default:
                        
                    break;
            }
        }while(opcion1 != 0);
    }
}
