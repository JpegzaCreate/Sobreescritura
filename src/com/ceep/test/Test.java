/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.test;

import com.ceeo.dominio.Empleado;
import com.ceeo.dominio.Gerente;

/**
 *
 * @author javip
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Santiago", 23000);
        //emp1.mostrarDetalles();
        
        Gerente geren1 = new Gerente ("Luis",35000,"IT");
        //geren1.mostrarDestalles();
        
        mostrar(emp1);
        determinarTipo(emp1);
        
        mostrar(geren1);
        determinarTipo(geren1);
        
        
        
        
    }
    
    
    public static void mostrar(Empleado em1){
        em1.mostrarDetalles();
        System.out.println("");
    }
    public static void mostrar(Gerente g1) {
        g1.mostrarDestalles();
        System.out.println("");
    }
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Empleado es de tipo Gerente");
            System.out.println("");
        } else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("");
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
            System.out.println("");
        }
        
    }
}
