/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Identidades.*;

/**
 *
 * @author Edward
 */
public class NodoUsuario {
    private DatosPersonal Usuario;
    private NodoUsuario Liga;

    public DatosPersonal getUsuario() {
        return Usuario;
    }

    public void setUsuario(DatosPersonal Usuario) {
        this.Usuario = Usuario;
    }

    

    public NodoUsuario getLiga() {
        return Liga;
    }

    public void setLiga(NodoUsuario Liga) {
        this.Liga = Liga;
    }
            
}
