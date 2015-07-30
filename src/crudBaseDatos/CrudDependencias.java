/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudBaseDatos;

import Identidades.DatosDependencias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexion;

/**
 *
 * @author ivan
 */
public class CrudDependencias {

    public CrudDependencias() {
    }

    public boolean insertarDependencia(String tabla, String id, String nombre, DatosDependencias dependencia) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            PreparedStatement insertar = connection.prepareStatement("INSERT INTO " + tabla + " (" + id + ", " + nombre + ") "
                    + "VALUES (?, ?)");
            insertar.setInt(1, dependencia.getId());
            insertar.setString(2, dependencia.getNombre());
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean modificarDependencia(String tabla, String id, String nombre, DatosDependencias dependencia) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            PreparedStatement insertar = connection.prepareStatement("UPDATE " + tabla + " SET " + nombre + " = ? WHERE " + id + " = ? ");
            insertar.setString(1, dependencia.getNombre());
            insertar.setInt(2, dependencia.getId());
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean eliminarDependencia(String tabla, String id, int cod) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            PreparedStatement insertar = connection.prepareStatement("DELETE FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            insertar.executeQuery();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public boolean validarDependencia(String tabla, String id, int cod) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            PreparedStatement insertar = connection.prepareStatement("SELECT * FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            ResultSet res = insertar.executeQuery();
            if (res.next()) {
                respuesta = true;
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    public DatosDependencias consultarDependencia(String tabla, String id, String nombre, int cod) {
        DatosDependencias dependencia = null;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            PreparedStatement insertar = connection.prepareStatement("SELECT * FROM " + tabla + " WHERE " + id + " = ? ");
            insertar.setInt(1, cod);
            ResultSet respu = insertar.executeQuery();
            if (respu.next()) {
                dependencia = new DatosDependencias();
                dependencia.setId(respu.getInt(id));
                dependencia.setNombre(respu.getString(nombre));
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependencia;
    }

    public DatosDependencias cargarDependencia(String tabla, String id, String nombre) {
        DatosDependencias dependencia = null;
        List<DatosDependencias> listaDependencia = new ArrayList<>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            String consulta = "SELECT * FROM " + tabla;
            Statement insertar = connection.createStatement();
            ResultSet respu = insertar.executeQuery(consulta);
            while (respu.next()) {
                dependencia = new DatosDependencias();
                dependencia.setId(respu.getInt(id));
                dependencia.setNombre(respu.getString(nombre));
                listaDependencia.add(dependencia);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudDependencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dependencia;
    }

}
