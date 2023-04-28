/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertameniii;

/**
 *
 * @author vice1
 */
public class Alumnos {
    int rut;
    String nombre;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumnos(int rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }
    
    public Alumnos(){
        
    }
}
