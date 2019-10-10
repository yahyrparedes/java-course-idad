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
public abstract class Persona {
    // No se puede crear objetos apartir de clases abstractas
    
    
    /*
    ** NO SE PUEDE **
    public Persona persona = new new Persona
    
    */
 
    public abstract void validar(); // Esto no ayuda para hacer polimorfismo
    public void verDomicilio(){
        
    }
    
}
