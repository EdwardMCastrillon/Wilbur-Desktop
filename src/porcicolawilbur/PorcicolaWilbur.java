/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcicolawilbur;

import Formularios.Ingreso;
import Identidades.DatosPersonal;
import Identidades.Razas;
import Listas.ListaAnimal;
import Listas.ListaPartos;
import Listas.*;
import java.io.File;
import java.util.Date;

/**
 *
 * @author Edward
 */
public class PorcicolaWilbur {

    
    public static File ruta = new File("C:\\Users\\Ivan\\Desktop\\Proyecto Git\\src\\Imagenes\\Admin");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaRazas R = new ListaRazas();
        Razas H = new Razas();
        H.setCodigoRaza("1");
        H.setNombreRaza("Hampshire");
        R.guardarRaza(H);
        
        Razas d = new Razas();
        d.setCodigoRaza("1");
        d.setNombreRaza("Duroc");
        R.guardarRaza(d);
        
        Razas p = new Razas();
        p.setCodigoRaza("1");
        p.setNombreRaza("Pietrain");
        R.guardarRaza(p);
        
        Razas L = new Razas();
        L.setCodigoRaza("1");
        L.setNombreRaza("Landrace");
        R.guardarRaza(L);
        
        Razas Y = new Razas();
        Y.setCodigoRaza("1");
        Y.setNombreRaza("Yorkshire (Large White)");
        R.guardarRaza(Y);
        
        ListaAnimal A = new ListaAnimal();
        ListaUsuario U = new ListaUsuario();
        ListaPartos P = new ListaPartos();
        String[][] usuarios = new String[8][4];
        
        usuarios[0][0] = "Edward Monsalve Castrillon";
        usuarios[0][1] = "Edward";
        usuarios[0][2] = "Edward6628";
        usuarios[0][3] = "Administrador";
                
        usuarios[1][0] = "Juan Esteban Acevedo Gallego";
        usuarios[1][1] = "Juan";
        usuarios[1][2] = "Ju@N1984";
        usuarios[1][3] = "Administrador";
        
        usuarios[2][0] = "Ivan Dario Villa";
        usuarios[2][1] = "Ivan";
        usuarios[2][2] = "Ivan.1585";
        usuarios[2][3] = "Veterinario";
        
        DatosPersonal persona = new DatosPersonal();
    	persona.setTipoDoc("Cedula de Ciudadania");
    	persona.setDocumento("8359459");
    	persona.setNombre("Ivan Dario Villa");
    	persona.setDepart("Antioquia");
    	persona.setCiudad("Medellin");
    	persona.setSangre("B");
    	persona.setRh("+");
    	persona.setEstado("Activo");
    	persona.setRutaImagen(ruta.toString());
    	persona.setDireccion("CALLE 40A NUM 35 60");
    	persona.setTelefono("2154879");
    	persona.setCorreo("trezeguet55@gmail.com");
    	persona.setMovil("3213658421");
    	persona.setProfesion("VETERINARIO");
    	persona.setOtroEst("ADMINISTRACION DE EMPRESAS");
    	//persona.set("Si");
    	persona.setCargo("Administrador");
        persona.setPerfil("Administrador");
    	persona.setTipoContrato("TERMINO FIJO"); 
    	persona.setFechaContrato(new Date(110,8,3));
    	persona.setFechaTitulo(new Date(112,8,10));
    	persona.setFechaOtroEst(new Date(109,06,15));
    	persona.setFechaNacimiento(new Date(85,10,01));	
    	U.guardarUsuario(persona);
   

        new Ingreso(usuarios,U,P,A,R);

        // TODO code application logic here
    }

}
