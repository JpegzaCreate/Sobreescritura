/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceeo.dominio;

/**
 *
 * @author javip
 */
public class Empleado {
    int sueldo;
    String empleado;

    public Empleado( String empleado,int sueldo) {
        this.sueldo = sueldo;
        this.empleado = empleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    
    public void mostrarDetalles(){
        System.out.println("Sueldo:" + this.sueldo);
        System.out.println("Empleado:" + this.empleado);
    }
}
