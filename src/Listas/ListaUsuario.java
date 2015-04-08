/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Edward
 */
import Nodos.*;
import porcicolawilbur.*;
import Identidades.*;

public class ListaUsuario {

    private NodoUsuario primero;
    private NodoUsuario ultimo;
    private int counter = 0;

    public boolean guardarUsuario(DatosPersonal U) {
        boolean sw = false;
        NodoUsuario p = new NodoUsuario();
        p.setUsuario(U); 

        if (primero == null) {
            primero = p;
            ultimo = p;
            primero.setLiga(null);
            sw = true;
            counter++;
        } else {
            ultimo.setLiga(p);
            ultimo = p;
            sw = true;
            counter++;
        }

        return sw;
    }

    public boolean modificarUsuario(DatosPersonal U) {
        boolean sw = false;
        NodoUsuario temp = primero;

        while (temp != null && sw == false) {
            if (temp.getUsuario().getDocumento().equals(U.getDocumento())) {
                temp.setUsuario(U);
                sw = true;
            }
            temp = temp.getLiga();
        }
        return sw;
    }

    public DatosPersonal cargarUsuario(String documento) {
        NodoUsuario p = primero;
        DatosPersonal result = null;
        while (p != null) {
            if (p.getUsuario().getDocumento().equals(documento)) {
                result = p.getUsuario();
            }
            p = p.getLiga();
        }

        return result;
    }
    
    public DatosPersonal cargarUsuarioCorreo(String correo) {
        NodoUsuario p = primero;
        DatosPersonal result = null;
        while (p != null) {
            if (p.getUsuario().getCorreo().equals(correo)) {
                result = p.getUsuario();
            }
            p = p.getLiga();
        }

        return result;
    }
    
    public DatosPersonal cargarUsuarioNombre(String nombre) {
        NodoUsuario p = primero;
        DatosPersonal result = null;
        while (p != null) {
            if (p.getUsuario().getNombre().equals(nombre)) {
                result = p.getUsuario();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean eliminarUsuario(String documento) {
        boolean sw = false;

        NodoUsuario p = primero;
        NodoUsuario ant = primero;
        while (p != null) {
            if (p.getUsuario().getDocumento().equals(documento)) {
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

    public boolean existe(String documento) {
        boolean sw = false;
        NodoUsuario p = primero;
        while (p != null && sw == false) {
            if (p.getUsuario().getDocumento().equals(documento)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }
    
    public boolean existeCorreo(String correo) {
        boolean sw = false;
        NodoUsuario p = primero;
        while (p != null && sw == false) {
            if (p.getUsuario().getCorreo().equals(correo)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }

    public int NuevoCod() {
        return counter + 1;
    }

    public NodoUsuario getPrimero() {
        return primero;
    }

    public void setPrimero(NodoUsuario primero) {
        this.primero = primero;
    }

    public NodoUsuario getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoUsuario ultimo) {
        this.ultimo = ultimo;
    }

}
