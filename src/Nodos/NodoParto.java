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
public class NodoParto {
    
    private Granja Parto;
    private NodoParto Liga;

    public Granja getParto() {
        return Parto;
    }

    public void setParto(Granja Parto) {
        this.Parto = Parto;
    }

    public NodoParto getLiga() {
        return Liga;
    }

    public void setLiga(NodoParto Liga) {
        this.Liga = Liga;
    }
}
