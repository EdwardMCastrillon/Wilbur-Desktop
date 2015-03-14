/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Granja {

    //Variables para JFramePartos
    private String CodPart, Codigo, NroVivos, NroMuertos, Totcamada, Edad, Raza;
    private Date fechaParto;

    //Variables para RegistroPersonal
    

   

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }


    

    public Date getFechaParto() {
        return fechaParto;
    }

    public void setFechaParto(Date fechaParto) {
        this.fechaParto = fechaParto;
    }



    public String getCodPart() {
        return CodPart;
    }

    public void setCodPart(String CodPart) {
        this.CodPart = CodPart;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNroVivos() {
        return NroVivos;
    }

    public void setNroVivos(String NroVivos) {
        this.NroVivos = NroVivos;
    }

    public String getNroMuertos() {
        return NroMuertos;
    }

    public void setNroMuertos(String NroMuertos) {
        this.NroMuertos = NroMuertos;
    }

    public String getTotcamada() {
        return Totcamada;
    }

    public void setTotcamada(String Totcamada) {
        this.Totcamada = Totcamada;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
}
