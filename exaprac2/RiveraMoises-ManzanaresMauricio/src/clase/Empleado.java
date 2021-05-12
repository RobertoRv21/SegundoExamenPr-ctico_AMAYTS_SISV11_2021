/*
 * Segundo examen práctico de AMAYTS Grupo SISV11 - 2021

 * Estudiantes:

        -Manzanares, Mauricio 209620
        -Rivera, Moises Roberto 206020
 
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    private String nombre;
    private double salarioxhora;
    private double horastrabajadas;
    private double salariototal;
    private double planillatotal;
    private double salariomayor;
    private String empmejorpagado;

    public Empleado() {
        
        
    }

    public Empleado(String nombre, double salarioxhora, double horastrabajadas, double salariototal, double planillatotal, double salariomayor, String empmejorpagado) {
        this.nombre = nombre;
        this.salarioxhora = salarioxhora;
        this.horastrabajadas = horastrabajadas;
        this.salariototal = salariototal;
        this.planillatotal = planillatotal;
        this.salariomayor = salariomayor;
        this.empmejorpagado = empmejorpagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioxhora() {
        return salarioxhora;
    }

    public void setSalarioxhora(double salarioxhora) {
        this.salarioxhora = salarioxhora;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getSalariototal() {
        return salariototal;
    }

    public void setSalariototal(double salariototal) {
        this.salariototal = salariototal;
    }

    public double getPlanillatotal() {
        return planillatotal;
    }

    public void setPlanillatotal(double planillatotal) {
        this.planillatotal = planillatotal;
    }

    public double getSalariomayor() {
        return salariomayor;
    }

    public void setSalariomayor(double salariomayor) {
        this.salariomayor = salariomayor;
    }

    public String getEmpmejorpagado() {
        return empmejorpagado;
    }

    public void setEmpmejorpagado(String empmejorpagado) {
        this.empmejorpagado = empmejorpagado;
    }

   
                
    
    
}
