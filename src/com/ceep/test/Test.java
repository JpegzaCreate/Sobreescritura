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
        emp1.mostrarDetalles();
        
        Gerente geren1 = new Gerente ("Luis",35000,"IT");
        geren1.mostrarDestalles();
    }
    
}
