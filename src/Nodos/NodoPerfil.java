/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Identidades.DatosPerfil;

/**
 *
 * @author Ivan
 */
public class NodoPerfil {

    private DatosPerfil perfil;
    private NodoPerfil liga;

    public DatosPerfil getPerfil() {
        return perfil;
    }

    public void setPerfil(DatosPerfil perfil) {
        this.perfil = perfil;
    }

    public NodoPerfil getLiga() {
        return liga;
    }

    public void setLiga(NodoPerfil liga) {
        this.liga = liga;
    }

}
