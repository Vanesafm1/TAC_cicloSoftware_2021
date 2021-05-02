/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TACciclodesoftware2021;

/**
 *
 * @author Vane
 */

// **1 importar clase 

import Numeros.Operaciones;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos  una instancia 
        // nombre clase  + nombre instancia = new + metodo constructor  
        Operaciones op1 = new Operaciones (2,4);
        // importamos las clases  que desconozca el main ver **1
        //op1.Num1 cuando es public, pero es mala practica, se debe acceder a los atributos por medio de metodos.
        System.out.println(op1.getNum1());
        op1.setNum1(5);
        System.out.println(op1.getNum1());
        
    }
    
}
