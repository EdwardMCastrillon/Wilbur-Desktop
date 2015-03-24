/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Identidades.*;
import Nodos.*;

/**
 *
 * @author Edward
 */

public class ListaPartos {

    private NodoParto primero;
    private NodoParto ultimo;
    private int counter = 0;
    
    public ListaPartos(){
        primero = null;
        ultimo = null;
        
    }

    public boolean guardarParto(Granja P) {
        boolean sw = false;
        NodoParto N = new NodoParto();
        N.setParto(P);

        if (primero == null) {
            primero = N;
            ultimo = N;
            primero.setLiga(null);
            sw = true;
            counter++;
        } else {
            N.setLiga(null);
            ultimo.setLiga(N);
            ultimo = N;
            sw = true;
        }

        return sw;
    }

    public boolean modificarParto(Granja p) {
        boolean sw = false;
        NodoParto temp = primero;

        while (temp != null && sw == false) {
            if (temp.getParto().getCodPart().equals(p.getCodPart())) {
                temp.setParto(p);
                sw = true;
            }
            temp = temp.getLiga();
        }
        return sw;
    }

    public Granja cargarParto(String codigo) {
        NodoParto p = primero;
        Granja result = null;
        while (p != null) {
            if (p.getParto().getCodPart().equals(codigo)) {
                result = p.getParto();
            }
            p = p.getLiga();
        }

        return result;
    }
    
    public Granja cargarPartoCodigoMadre(String codigo) {
        NodoParto p = primero;
        Granja result = null;
        while (p != null) {
            if (p.getParto().getCodigo().equals(codigo)) {
                result = p.getParto();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean eliminarParto(String codigo) {
        boolean sw = false;

        NodoParto p = primero;
        NodoParto ant = primero;
        while (p != null) {
            if (p.getParto().getCodPart().equals(codigo)) {
                if (p == primero) {
                    primero = primero.getLiga();
                } else {
                    if (p == ultimo) {
                        ultimo = ant;
                    }
                    ant.setLiga(p.getLiga());

                }
                sw = true;
            }
            ant = p;
            p = p.getLiga();
        }

        return sw;
    }

    public boolean existe(String codigo) {
        boolean sw = false;
        NodoParto p = primero;
        while (p != null) {
            if (p.getParto().getCodPart().equals(codigo)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    } 

    public int NuevoCod() {
        return counter + 1;
    }

    public NodoParto getPrimero() {
        return primero;
    }

    public void setPrimero(NodoParto primero) {
        this.primero = primero;
    }

    public NodoParto getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoParto ultimo) {
        this.ultimo = ultimo;
    }
}
