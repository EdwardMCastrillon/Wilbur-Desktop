/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class DatosPerfil {

    private String numCedula,  perfil,usuario, contraIngreso, RepetirContraIngreso, nombre  ; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    } 
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    } 

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraIngreso() {
        return contraIngreso;
    }

    public void setContraIngreso(String contraIngreso) {
        this.contraIngreso = contraIngreso;
    }

    public String getRepetirContraIngreso() {
        return RepetirContraIngreso;
    }

    public void setRepetirContraIngreso(String RepetirContraIngreso) {
        this.RepetirContraIngreso = RepetirContraIngreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    private Date fecha;

}
