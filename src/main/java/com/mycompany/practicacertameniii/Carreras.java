/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertameniii;

import java.util.ArrayList;

/**
 *
 * @author vice1
 */
public class Carreras {
    int ID;
    String nombre, areaSaber;
    private ArrayList <Alumnos> estudiantes = new ArrayList <>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaSaber() {
        return areaSaber;
    }

    public void setAreaSaber(String areaSaber) {
        this.areaSaber = areaSaber;
    }

    public ArrayList<Alumnos> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Alumnos> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Carreras(int ID, String nombre, String areaSaber) {
        this.ID = ID;
        this.nombre = nombre;
        this.areaSaber = areaSaber;
    }
    public Carreras(){
        
    }
    
    boolean agergaarEstudiante(Alumnos alumno){
        int i;
        for(i = 0 ; i < estudiantes.size() ; i++){
            if(estudiantes.get(i).getRut() == alumno.getRut()){
                return false;
            }
        }
        estudiantes.add(alumno);
        return true;
    }
    
    Alumnos obtenerAlumno(Alumnos estudiante){
        int i;
        for(i = 0 ; i < estudiantes.size() ; i++){
            if(estudiante.getRut() == estudiante.getRut()){
                return estudiante;
            }
        }
        return null;
    }
    
    
    boolean verificarAlumno(int rut){
        int i;
        for(i = 0 ; i < estudiantes.size() ; i++){
            if(estudiantes.get(i).getRut() == rut){
                return true;
            }
        }
        return false;
    }
    
    
        
    void mostrarAlumnos(){
        int i;
        System.out.println("Datos de alumnos");
        for(i = 0 ; i < estudiantes.size(); i++){
            System.out.println("Nombre de estudiante"+estudiantes.get(i).getNombre());
            System.out.println("Rut de estudiante"+estudiantes.get(i).getRut());
            System.out.println("\n");
        }
    }
}
