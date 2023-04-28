/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertameniii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vice1
 */
public class Universidada {
    
    ArrayList <Carreras> carreritas = new ArrayList <>();

    public ArrayList<Carreras> getCarreritas() {
        return carreritas;
    }

    public void setCarreritas(ArrayList<Carreras> carreritas) {
        this.carreritas = carreritas;
    }

    public Universidada() {
    }
    
    void mostrarCarreras(){
        for(Carreras carrera : carreritas){
            System.out.println("Nombre de carrera:"+ carrera.getNombre());
            System.out.println("ID de carrera:"+ carrera.getID());
            System.out.println("Area de saber de carrera:"+ carrera.getAreaSaber());
            System.out.println("\n");
        }
    }

    
    boolean verificarCarrera(int idCarrera){
        int i;
        
        for(i = 0 ; i < carreritas.size() ; i++){
            if(idCarrera == carreritas.get(i).getID()){
                return true;
            }
        }
        
        return false;
    }
    
    boolean agregarCarrera(Carreras carrera){
        int i =0;
        for (i = 0 ; i < carreritas.size(); i++){
            if(carreritas.get(i).ID == carrera.ID){
                return false;
            }
        }
        carreritas.add(carrera);
        return true;
    }
    
    boolean agregarAlumno(int idCarrera , Alumnos alumno){
        int i;
        for(i = 0 ; i < carreritas.size() ; i++){
            if(idCarrera == carreritas.get(i).getID()){
                carreritas.get(i).getEstudiantes().add(alumno);
                return true;
            }

        }        
        return false;
    }
    
    Alumnos obtenerAlumno(int rutAlumno){
        int i , j = 0;
        for(i = 0 ; i < carreritas.size() ; i++){
            for(j = 0 ; j < carreritas.get(i).getEstudiantes().size() ; j++){
                if(rutAlumno == carreritas.get(i).getEstudiantes().get(j).getRut()){
                    System.out.println("El estudiante ha sido encontrado");
                    return carreritas.get(i).getEstudiantes().get(j);
                }
            }
        }
        System.out.println("El estudiante no ha sido encontrado");
        return null;
    }
    
    boolean elimiarAlumnos(int rutAlumno){
        int i , j = 0;
        for(i = 0 ; i < carreritas.size() ; i++){
            for(j = 0 ; j < carreritas.get(i).getEstudiantes().size() ; j++){
                if(rutAlumno == carreritas.get(i).getEstudiantes().get(j).getRut()){
                    carreritas.get(i).getEstudiantes().remove(j);
                    return true;
                }
            }
        }
        return false;
    } 
    
    void modificarDatosAlumno(int rutAlumnmo){
        Scanner opcion = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        int opcion1;
        int i , j;
        for(i = 0 ; i < carreritas.size() ; i++){
            for(j = 0 ; j < carreritas.get(i).getEstudiantes().size() ; j++){
                if(rutAlumnmo == carreritas.get(i).getEstudiantes().get(j).getRut()){
                    System.out.println("Se ha encontrado el alumno");
                    do{
                        System.out.println("Que desea cambiar?");
                        System.out.println("1- Nombre");
                        System.out.println("2- RUT?");
                        System.out.println("3- Carrera");
                        opcion1 = opcion.nextInt();
                        
                        switch(opcion1){
                            
                            case 1:
                                System.out.println("Ingrese el nombre a cambiar");
                                String nombre = entrada.next();
                                carreritas.get(i).getEstudiantes().get(j).setNombre(nombre);
                                break;
                        
                    }
                }while(opcion1 != 0);
            }
        }
        
        
        
        
    }
    
    
}
}
