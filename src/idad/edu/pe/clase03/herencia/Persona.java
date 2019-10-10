/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idad.edu.pe.clase03.herencia;

/**
 *
 * @author KillerYpa
 */
public class Persona{
    
    public String dni;
    
    public Persona(String nombre){
        
    }
    
    public Persona(){ }
    
    public void validar(){
        System.out.println("Mi DNI = " + dni);
    }
    
    public static void main(String[] args) {
        Persona persona  = new Alumno();
        persona.dni = "123";
        // persona.verNotas();
        
        Alumno a1 = (Alumno) persona;
        a1.verNotas() ;
    }
    
    
}
