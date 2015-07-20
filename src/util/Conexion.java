/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivan
 */
public class Conexion {
    
    public  Connection conection;
    
    public Conexion(){
        conection = null;
    }
    
    public Connection getConection(){
        if ( conection != null){
            return conection;
        }else{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String username = "idvr";
                String password = "1234";
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                conection = DriverManager.getConnection(url, username, password);
                System.out.println("Conectado");
            } catch (Exception e) {
                System.out.println("Desconectado");
                System.out.println(e.getMessage());
            }
            return conection;
        }
    }
    
    public void cerrarConexion(Connection conexion)    {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
