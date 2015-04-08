/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porcicolawilbur;

import Formularios.Ingreso;
import Identidades.DatosPerfil;
import Identidades.DatosPersonal;
import Identidades.Razas; 
import Listas.*;
import java.io.File;
import java.util.Date;

/**
 *
 * @author Edward
 */
public class PorcicolaWilbur {

    
    public static File ruta = new File("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\Admin.jpg");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaRazas listaRaza = new ListaRazas();
        Razas H = new Razas();
        H.setCodigoRaza("1");
        H.setNombreRaza("Hampshire");
        listaRaza.guardarRaza(H);
        
        Razas d = new Razas();
        d.setCodigoRaza("1");
        d.setNombreRaza("Duroc");
        listaRaza.guardarRaza(d);
        
        Razas p = new Razas();
        p.setCodigoRaza("1");
        p.setNombreRaza("Pietrain");
        listaRaza.guardarRaza(p);
        
        Razas L = new Razas();
        L.setCodigoRaza("1");
        L.setNombreRaza("Landrace");
        listaRaza.guardarRaza(L);
        
        Razas Y = new Razas();
        Y.setCodigoRaza("1");
        Y.setNombreRaza("Yorkshire (Large White)");
        listaRaza.guardarRaza(Y);
        
        ListaAnimal listaAnimal = new ListaAnimal();
        ListaUsuario listaPersonal = new ListaUsuario();
        ListaPartos listaParto = new ListaPartos();
        ListaPerfil listaPerfil = new ListaPerfil(); 
        
        DatosPerfil perfil = new DatosPerfil();
    	perfil.setNumCedula("1000443942");
        perfil.setNombre("Edward Monsalve Cantrillon");
    	perfil.setPerfil("Administrador");
    	perfil.setUsuario("Edward");
    	perfil.setContraIngreso("Edward.6628");
    	perfil.setRepetirContraIngreso("Edward.6628"); 
    	perfil.setFecha(new Date(115,03,06));
    	listaPerfil.guardarPerfil(perfil);
    	
    	DatosPerfil perfil1 = new DatosPerfil();
    	perfil1.setNumCedula("8359459");
        perfil1.setNombre("Ivan Dario Villa Ramirez"); 
    	perfil1.setPerfil("Veterinario");
    	perfil1.setUsuario("Ivan");
    	perfil1.setContraIngreso("Ivan.1585");
    	perfil1.setRepetirContraIngreso("Ivan.1585"); 
    	perfil1.setFecha(new Date(115,04,04));
    	listaPerfil.guardarPerfil(perfil1);
        
        DatosPerfil perfil12= new DatosPerfil();
    	perfil12.setNumCedula("8359452");
        perfil12.setNombre("Juan Esteban Acevedo"); 
    	perfil12.setPerfil("Administrador");
    	perfil12.setUsuario("Juan");
    	perfil12.setContraIngreso("Ju@N1984");
    	perfil12.setRepetirContraIngreso("Ju@N1984");
    	perfil12.setFecha(new Date(115,03,01)); 
    	listaPerfil.guardarPerfil(perfil12); 
        
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
    	persona.setProfesion("Veterinario");
    	persona.setOtroEst("Bacteriologo");
    	persona.setObtenidoEstudio("Si");
    	persona.setCargo("Administrador"); 
    	persona.setTipoContrato("Termino Fijo"); 
    	persona.setFechaContrato(new Date(110,8,3));
    	persona.setFechaTitulo(new Date(112,8,10));
    	persona.setFechaOtroEst(new Date(109,06,15));
    	persona.setFechaNacimiento(new Date(85,10,01));	
    	listaPersonal.guardarUsuario(persona);
        
        DatosPersonal persona2 = new DatosPersonal();
    	persona2.setTipoDoc("Cedula de Ciudadania");
    	persona2.setDocumento("1000443942");
    	persona2.setNombre("Edward Monsalve Castrillon");
    	persona2.setDepart("Antioquia");
    	persona2.setCiudad("Medellin");
    	persona2.setSangre("O");
    	persona2.setRh("+");
    	persona2.setEstado("Activo");
    	persona2.setRutaImagen(ruta.toString());
    	persona2.setDireccion("CALLE 61 # 42-54");
    	persona2.setTelefono("2921766");
    	persona2.setCorreo("edwardm0213@gmail.com");
    	persona2.setMovil("3006550592");
    	persona2.setProfesion("Criador");
    	persona2.setOtroEst("Crianza de Cerdos");
    	persona2.setObtenidoEstudio("Si");
    	persona2.setCargo("Administrador"); 
    	persona2.setTipoContrato("Termino Fijo"); 
    	persona2.setFechaContrato(new Date(110,8,3));
    	persona2.setFechaTitulo(new Date(112,8,10));
    	persona2.setFechaOtroEst(new Date(109,06,15));
    	persona2.setFechaNacimiento(new Date(85,10,01));	
    	listaPersonal.guardarUsuario(persona2);
   

        new Ingreso(listaPersonal,listaParto,listaAnimal,listaRaza,listaPerfil);

        // TODO code application logic here
    }

}
