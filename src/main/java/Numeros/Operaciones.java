/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

/**
 *
 * @author Vane
 */
public class Operaciones {
    
    //1. Abstraccion - Definicion de los atributos 
    private int Num1;
    private int Num2;
    private int Res;
    
    //2. Polimorfismo - Basado en metodo constructor: Para iniciar los objetos. 
    // Reglas para contructor: 1. Obligatorio publico nivel accesibilidad. 2. Nombre igual a la case 3. debe contener parametros
    public Operaciones () 
    {
        
    }
    //contructor con parametros para inicializacion diferente al constructor vacio. 
    // Se crean parametros para proceso de asignacion n1,n2,
    public Operaciones (int n1, int n2)
    // Se realiza proceso de asignacion con palabr this que hace referencia a la clase, deben llegar del exterior       
    {
        this.Num1 = n1;
        this.Num2 = n2;
        this.Res = 0; 
    }
    
    // 3. Encapsulamiento
    // Metodo get (obtiene valor del atributo ) y set (coloca valor al atributo)
    // publica para ser visto en todo package, devuelve un int o void 
    public int getNum1 ()
    {
        return this.Num1;
    }
    //Set == Coloar el valor 
    // el valor es asignado, no me retorna nada, queda en void
    public void setNum1 (int n)
    {
        this.Num1 = n;
    }
    
    
    /**
     * @return the Num2
     */
    public int getNum2() {
        return Num2;
    }

    /**
     * @param Num2 the Num2 to set
     */
    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }

    /**
     * @return the Res
     */
    public int getRes() {
        return Res;
    }
    
  
    
    // 4.Metodos (sumar restar or arrancar apagar carro)
    
    
    /**
     * @return Retorna la suma de los dos operandos, no es necesario envair parametros
     */
    public int Sumar ()
    {
        this.Res = this.Num1 + this.getNum2();
        return this.getRes();
        
    }

    
    
}
