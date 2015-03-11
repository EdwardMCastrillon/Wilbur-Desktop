/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import Identidades.Razas;

/**
 *
 * @author Edward
 */
public class NodoRazas {
    private Razas raza;
    private NodoRazas liga;

    public Razas getRaza() {
        return raza;
    }

    public void setRaza(Razas raza) {
        this.raza = raza;
    }

    public NodoRazas getLiga() {
        return liga;
    }

    public void setLiga(NodoRazas liga) {
        this.liga = liga;
    }
    
    
}
