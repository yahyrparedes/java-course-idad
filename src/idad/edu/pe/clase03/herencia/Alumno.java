/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idad.edu.pe.clase03.herencia;

/**
 *
 * @author SYSTEM
 */
public class Alumno extends Persona {
    
    public Alumno(){
        // super("Default"); // Sin constructor por default
        super(); // Con constructor por default
    }
    public void verNotas(){
        System.out.println("Ya Jale *");
    }
    
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        alumno.dni = "73884071";
        alumno.validar();
        
    }
    
}
