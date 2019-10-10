/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idad.edu.pe.clase03.abstraccion;

/**
 *
 * @author SYSTEM
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        // Persona persona = new Persona();
        // persona.validar();
        
        Polimorfismo poli = new Polimorfismo();
        poli.ejecuta(new Alumno());
    
    }
    
    public void ejecuta( Persona obj){ // Este metodo es una representacion de Polimorfismo
        System.out.println("Se ejecuta un Objeto persona ==> Polimorfismo pe causa xD");
    } 
    
}
