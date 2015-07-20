/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Identidades.DatosPersonal;
import Utilidades.DepartamentosMunicipios;
import crudBaseDatos.CrudPersonal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static porcicolawilbur.PorcicolaWilbur.ruta;

/**
 *
 * @author ivan
 */
public class Test {

    private static Connection cone;
    private static Conexion co;

    public static void main(String[] agrs) { 
       /* int conse= 0;
        DepartamentosMunicipios depar = new DepartamentosMunicipios();
        String[][] dep = depar.getDeparMuni();
        co = new Conexion();
        cone = co.getConection();
       for (int i = 0; i < 33; i++) {
            try {
                PreparedStatement departa
                        = cone.prepareStatement("INSERT INTO DEPARTAMENTOS(ID_DEPART, NOM_DEPART, ID_PAIS) VALUES(?, ?, ?)");
                departa.setInt(1, i + 1);
                departa.setString(2, dep[i][0]);
                departa.setInt(3, 1);
                departa.executeUpdate();
                System.out.println("departamento " + dep[i][0] + " insertado");
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       co.cerrarConexion(cone);
        PreparedStatement departa;
        for (int i = 0; i < 33; i++) {
        co = new Conexion();
        cone = co.getConection();
            for (int j = 1; j < 125; j++) {
                if (dep[i][j] == null) {
                    j = 127;
                } else {
                    conse = conse + 1;
                    try {
                        departa = cone.prepareStatement("INSERT INTO CIUDADES(ID_CIUDAD, NOM_CIUDAD, ID_DEPART) VALUES(?, ?, ?)");
                        departa.setInt(1, conse);
                        departa.setString(2, dep[i][j]);
                        departa.setInt(3, i+1);
                        departa.executeUpdate();
                        System.out.println("ciudad " + dep[i][j] + " insertado");
                    } catch (SQLException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("\n");
            System.out.println("\n");
            co.cerrarConexion(cone);
        }*/
        java.util.Date utilDate = new java.util.Date();

java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

System.out.println("java.util.Date: " + utilDate);
System.out.println("java.sql.Date.: " + sqlDate);
        CrudPersonal base = new CrudPersonal();
      /*  DatosPersonal persona = new DatosPersonal();
    	persona.setTipoDoc(1);
    	persona.setDocumento(8359459);
    	persona.setNombre("Ivan Dario");
        persona.setPrimerApellido("Villa");
        persona.setSegundoApellido("Ramirez");
    	persona.setDepart(1);
    	persona.setCiudad(1);
    	persona.setSangre(2);
    	persona.setRh(1);
    	persona.setEstado(1);
    	persona.setRutaImagen("ivan");
    	persona.setDireccion("Calle 40A # 35 60");
    	persona.setTelefono(2154879);
    	persona.setCorreo("trezeguet55@gmail.com");
    	persona.setMovil(3213658);
    	persona.setProfesion(2);
    	persona.setOtroEst("Bacteriologo");
    	persona.setObtenidoEstudio("Si");
    	persona.setCargo(2); 
    	persona.setTipoContrato(1); 
    	persona.setFechaContrato(new Date(110,8,3));
    	persona.setFechaTitulo(new Date(112,8,10));
    	persona.setFechaOtroEst(new Date(109,06,15));
    	persona.setFechaNacimiento(new Date(85,10,01));	
        if (base.ingresarDatosPersonal(persona)){
            System.out.println("Se guardo");
        }else{
            System.out.println("No se guardo");
        }
        
        DatosPersonal persona = new DatosPersonal();
    	persona.setTipoDoc(1);
    	persona.setDocumento(2222);
    	persona.setNombre("Juan Esteban");
        persona.setPrimerApellido("Acevedo");
        persona.setSegundoApellido("Ramirez");
    	persona.setDepart(1);
    	persona.setCiudad(1);
    	persona.setSangre(2);
    	persona.setRh(1);
    	persona.setEstado(1);
    	persona.setRutaImagen("ivan");
    	persona.setDireccion("Calle 40A # 35 60");
    	persona.setTelefono(2154879);
    	persona.setCorreo("trezeguet55@gmail.com");
    	persona.setMovil(3213658);
    	persona.setProfesion(2);
    	persona.setOtroEst("Bacteriologo");
    	persona.setObtenidoEstudio("Si");
    	persona.setCargo(2); 
    	persona.setTipoContrato(1); 
    	persona.setFechaContrato(new Date(110,8,3));
    	persona.setFechaTitulo(new Date(112,8,10));
    	persona.setFechaOtroEst(new Date(109,06,15));
    	persona.setFechaNacimiento(new Date(85,10,01));	
        if (base.modificarDatosTablaPersonal(persona)){
            System.out.println("Se actualizo");
        }else{
            System.out.println("No se actualizo");
        }
        DatosPersonal con = null;
        con = base.obtenerUsuario(2222);
        if (con != null){
            System.out.println("el usuario "+ con.getNombre() + " " + con.getPrimerApellido() + " fue consultado");
        }else{
            System.out.println("no consulto");
        }*/
        base.eliminarUsuario(2222);
    }

}
