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
    private Granja Usuario;

    public Granja getUsuario() {
        return Usuario;
    }

    public void setUsuario(Granja Usuario) {
        this.Usuario = Usuario;
    }

    public NodoUsuario getLiga() {
        return Liga;
    }

    public void setLiga(NodoUsuario Liga) {
        this.Liga = Liga;
    }
    private NodoUsuario Liga;
            
}
