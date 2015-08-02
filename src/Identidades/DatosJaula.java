/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Date;

/**
 *
 * @author ivan
 */
public class DatosJaula {
    
    private int codJaula, estado, numCerdos;
    private String nombre;
    private Date fechaCons;
    private float area;
    
    public DatosJaula(){}

    public int getCodJaula() {
        return codJaula;
    }

    public void setCodJaula(int codJaula) {
        this.codJaula = codJaula;
    }

    public int getNumCerdos() {
        return numCerdos;
    }

    public void setNumCerdos(int numCerdos) {
        this.numCerdos = numCerdos;
    }

    
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCons() {
        return fechaCons;
    }

    public void setFechaCons(Date fechaCons) {
        this.fechaCons = fechaCons;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    
}
