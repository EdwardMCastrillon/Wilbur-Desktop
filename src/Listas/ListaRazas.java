
package Listas;

import Identidades.Razas;
import Nodos.NodoRazas;

/**
 *
 * @author Edward
 */
public class ListaRazas {

    private NodoRazas primero;
    private NodoRazas ultimo;
    private int counter = 0;

    public ListaRazas() {
        primero = null;
        ultimo = null;

    }

    public boolean guardarRaza(Razas P) {
        boolean sw = false;
        NodoRazas N = new NodoRazas();
        N.setRaza(P);

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
            counter++;
        }

        return sw;
    }

    public boolean modificarRaza(Razas p) {
        boolean sw = false;
        NodoRazas temp = primero;

        while (temp != null && sw == false) {
            if (temp.getRaza().getCodigoRaza().equals(p.getCodigoRaza())) {
                temp.setRaza(p);
                sw = true;
            }
            temp = temp.getLiga();
        }
        return sw;
    }

    public Razas cargarRaza(String codigo) {
        NodoRazas p = primero;
        Razas result = null;
        while (p != null) {
            if (p.getRaza().getCodigoRaza().equals(codigo)) {
                result = p.getRaza();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean eliminarRaza(String codigo) {
        boolean sw = false;

        NodoRazas p = primero;
        NodoRazas ant = primero;
        while (p != null) {
            if (p.getRaza().getCodigoRaza().equals(codigo)) {
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
        NodoRazas p = primero;
        while (p != null) {
            if (p.getRaza().getCodigoRaza().equals(codigo)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }

    public int NuevoCod() {
        return counter + 1;
    }

    public NodoRazas getPrimero() {
        return primero;
    }

    public void setPrimero(NodoRazas primero) {
        this.primero = primero;
    }

    public NodoRazas getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoRazas ultimo) {
        this.ultimo = ultimo;
    }
}
