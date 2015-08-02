/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudBaseDatos;

import Identidades.DatosJaula;
import Identidades.DatosPerfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author ivan
 */
public class CrudJaula {
    
    public CrudJaula(){}
    
     /**
     * Método para la inserción de datos nuevos a la base de datos de la Granja
     * Wilbur
     *
     * @param perfil recibe un objeto de tipo <code>DatosPerfil</code> con el
     * contenido de los datos a insertar.
     * @see <code>DatosPerfil</code>
     */
    public boolean ingresarDatosJaula(DatosJaula jaula) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            PreparedStatement insertarDatos;

            insertarDatos = connection.prepareStatement("INSERT INTO JAULAS (ID_JAULA, NOM_JAULA, "
                    + "AREA_MTS, FECHA_CONST, ESTADO, NUM_CERDOS) VALUES(?, ?, ?, ?, ?, ?)");

            insertarDatos.setInt(1, jaula.getCodJaula());
            insertarDatos.setString(2, jaula.getNombre());
            insertarDatos.setFloat(3, jaula.getArea());
            insertarDatos.setDate(4, new java.sql.Date(jaula.getFechaCons().getTime()));
            insertarDatos.setInt(5, jaula.getEstado());
            insertarDatos.setInt(6, jaula.getNumCerdos());
            insertarDatos.executeUpdate();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    /**
     * Método para modificar los datos existentes de un registro almacenado en
     * la base de datos de la Granja Wilbur.
     *
     * @param modificarJaula recibe un objeto de tipo <code>Reservas</code> con
     * el contenido de los datos modificados para actualizar en la base de
     * datos.
     * @see <code>DatosPerfil</code>
     */
    public boolean modificarDatosJaula(DatosJaula modificarJaula) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            /**
             * Variable modificarSQL de tipo <code>String</code> en la cual se
             * cargara la petición a la base de datos para insertar los datos a
             * actualizar.
             */
            String modificarSQL;

            modificarSQL = ("UPDATE JAULAS SET "
                    + "NOM_JAULA = '" + modificarJaula.getNombre() + "', "
                    + "AREA_MTS = " + modificarJaula.getArea() + ", "
                    + "FECHA_CONST = to_date('" + new java.sql.Date(modificarJaula.getFechaCons().getTime()) + "','YYYY-MM-DD'),"
                    + "ESTADO = " + modificarJaula.getEstado() + ", "
                    + "NUM_CERDOS = " + modificarJaula.getNumCerdos() 
                    + "WHERE ID_JAULA = " + modificarJaula.getCodJaula());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(modificarSQL);
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    /**
     * Método para eliminar un registro especifico almacenado en la base de
     * datos de la Granja Wilbur.
     *
     * @param idJaula recibe un dato <code>int</code> con el número de la
     * reserva a eliminar de la base de datos.
     */
    public boolean eliminarRegistro(int idJaula) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM JAULAS WHERE ID_JAULA = " + idJaula);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(eliminarSQL);
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    public DatosJaula consultarJaula(int id) {
        DatosJaula jaula = null;
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConection();
        String consulta = "SELECT * FROM JAULAS WHERE  ID_JAULA = "  + id;
        try {
            Statement consultaperfil = connection.createStatement();
            ResultSet respuesta = consultaperfil.executeQuery(consulta);
            if (respuesta.next()) {
                jaula = new DatosJaula();
                jaula.setCodJaula(respuesta.getInt("ID_JAULA"));
                jaula.setNombre(respuesta.getString("NOM_JAULA"));
                jaula.setArea(respuesta.getFloat("AREA_MTS"));
                jaula.setFechaCons(respuesta.getDate("FECHA_CONST"));
                jaula.setEstado(respuesta.getInt("ESTADO"));
                jaula.setNumCerdos(respuesta.getInt("NUM_CERDOS"));

            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jaula;
    }

    public java.util.List<DatosJaula> cargarJaulas() {
        java.util.List<DatosJaula> listaPerfil = new ArrayList<DatosJaula>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosJaula jaula;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM JAULAS");
            while (respuesta.next()) {
                jaula = new DatosJaula();
                jaula.setCodJaula(respuesta.getInt("ID_JAULA"));
                jaula.setNombre(respuesta.getString("NOM_JAULA"));
                jaula.setArea(respuesta.getFloat("AREA_MTS"));
                jaula.setFechaCons(respuesta.getDate("FECHA_CONST"));
                jaula.setEstado(respuesta.getInt("ESTADO"));
                jaula.setNumCerdos(respuesta.getInt("NUM_CERDOS"));
                listaPerfil.add(jaula);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPerfil;
    }
    
    public boolean validarJaula(int idJaula) {
        boolean respu = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM JAULAS WHERE ID_JAULA = " + idJaula);
            while (respuesta.next()) {
                if (respuesta.getInt("ID_JAULA") == idJaula){
                    respu = true;
                }
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respu;
    }
    
}
