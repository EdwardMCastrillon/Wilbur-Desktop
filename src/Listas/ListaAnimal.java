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
import Identidades.DatosAnimal;

public class ListaAnimal {

    private NodoAnimal primero;
    private NodoAnimal ultimo;
    private int counter = 0;
    
    public ListaAnimal(){
        
        primero = null;
        ultimo = null;
        
    }

    public boolean guardarCerdo(DatosAnimal A) {
        boolean sw = false;
        NodoAnimal p = new NodoAnimal();
        p.setAnimal(A);

        if (primero == null) {
            primero = p;
            ultimo = p;
            primero.setLiga(null);
            sw = true;
            counter++;
        } else {
            p.setLiga(null);
            ultimo.setLiga(p);
            ultimo = p;
            sw = true;
            counter++;
            
        }

        return sw;
    }

    public boolean modificarCerdo(DatosAnimal p) {
        boolean sw = false;
        NodoAnimal temp = primero;

        while (temp != null && sw == false) {
            if (temp.getAnimal().getCod_animal().equals(p.getCod_animal())) {
                temp.setAnimal(p);
                sw = true;
            }
            temp = temp.getLiga();
        }
        return sw;
    }

    public DatosAnimal cargarCerdo(String codigo) {
        NodoAnimal p = primero;
        DatosAnimal result = null;
        while (p != null) {
            if (p.getAnimal().getCod_animal().equals(codigo)) {
                result = p.getAnimal();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean EliminarCerdo(String codigo) {
        boolean sw = false;

        NodoAnimal p = primero;
        NodoAnimal ant = primero;
        while (p != null) {
            if (p.getAnimal().getCod_animal().equals(codigo)) {
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
        NodoAnimal p = primero;
        while (p != null) {
            if (p.getAnimal().getCod_animal().equals(codigo)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }
    
    public DatosAnimal verificarReproductora(String codigo){
    		
    	NodoAnimal auxiliar = primero;
    	while ( auxiliar !=null ){
    		
    		if ( auxiliar.getAnimal().getCod_animal().equals(codigo) && auxiliar.getAnimal().getTipoCerdo().equals("Reemplazo")
                    && auxiliar.getAnimal().getSexo().equals("Hembra")){
    			
    			return auxiliar.getAnimal();
    		}else{
    			
    			auxiliar = auxiliar.getLiga();
    		}    		
    	}
    	return  null;
    } 

    public int NuevoCod() {
        return counter + 1;
    }

    public NodoAnimal getPrimero() {
        return primero;
    }

    public void setPrimero(NodoAnimal primero) {
        this.primero = primero;
    }

    public NodoAnimal getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoAnimal ultimo) {
        this.ultimo = ultimo;
    }

}
