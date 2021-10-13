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
public class Gerente extends Empleado{
    private String departamento;

    public Gerente( String empleado,int sueldo ,String departamento) {
        super(empleado , sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    
    
    public void mostrarDestalles(){
        
        System.out.println("Nombre: " + this.empleado );
        System.out.println("Sueldo: " + this.sueldo );
        System.out.println("Departamento: " + this.departamento );
    }
    
}
