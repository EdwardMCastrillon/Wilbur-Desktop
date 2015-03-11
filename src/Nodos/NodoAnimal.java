
package Nodos;

/**
 *
 * @author Edward
 */

import porcicolawilbur.*;

import Identidades.*;


public class NodoAnimal {
    private DatosAnimal Animal;
    private NodoAnimal Liga;

    public DatosAnimal getAnimal() {
        return Animal;
    }

    public void setAnimal(DatosAnimal Animal) {
        this.Animal = Animal;
    }

    public NodoAnimal getLiga() {
        return Liga;
    }

    public void setLiga(NodoAnimal Liga) {
        this.Liga = Liga;
    }
    
}
