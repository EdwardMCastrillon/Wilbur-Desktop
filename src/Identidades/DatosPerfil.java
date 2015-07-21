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

    private int idPerfil, numCedula,  tipoPerfil;
    private String usuario, contraIngreso; 
    private Date fecha;
    
    public DatosPerfil(){}
    
    

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
