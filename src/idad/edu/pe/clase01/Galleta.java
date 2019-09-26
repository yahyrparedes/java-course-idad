// Clase: Es un molde 
// 
package idad.edu.pe.clase01;

/**
 *
 * @author Administrador
 */
public class Galleta {
    
    //Atributos o caracteristicas de la clase :D 
    String sabor; // String es un tipo de dato complejo.
    String marca;
        
    // Java te otorga un constructor por defecto
//     Galleta galleta = new Galleta();
    // CLase referencia = nuevo Constructor
    
//Tipo de dato:
// Tipos de datos primitivos:
// Enteros 
    // --> byte --> short --> int --> long --> 
// Caracter
    //--> char
// Condicional 1-0
    //-->  boolean
//Coma flotante
    //-->float --> double
    
// Tipos de metodos
    // Con retorno
    // Sin retorno
    

// Un metodo es una orden u sentencia que se ejecuta
    public void abrir(){
        // void = sin retrorno
    } 
    
    public int obtenerPrecion(){
        // Defines el tipo de retorno.
        return (int) Math.random() * 1;
    }
            
    public static void main(String[] args){
        Galleta g = new Galleta();
        System.out.println(g.obtenerPrecion());
    }
    

// Herramientas de programacion
    // Java + Alice
    // Java + GreenFoot
    // Java + BlueJ
    // Java + Eclipse
    
}
