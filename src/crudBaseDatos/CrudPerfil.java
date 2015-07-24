/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudBaseDatos;

import Formularios.MenuPrincipal;
import Identidades.DatosPerfil;
import Identidades.DatosPersonal;
import Identidades.DatosDependencias;
import Utilidades.Validaciones;
import java.sql.Connection;
import java.sql.Date;
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
public class CrudPerfil {

    private Validaciones validar;

    public CrudPerfil() {
        validar = new Validaciones();
    }

    public boolean validarUsuario(String usuario, String clave) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            String consulta = ("SELECT TPE.NOM_TPERFIL FROM PERFILES PE INNER JOIN TIPO_PERFIL TPE ON PE.TPERFIL = TPE.ID_TPERFIL"
                    + " WHERE NOM_USUARIO = '" + usuario + "' AND CLAVE = '" + clave + "'");
            Statement st = connection.createStatement();
            ResultSet respu = st.executeQuery(consulta);
            if (respu.next()) {
                respuesta = true;
            }            
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        return respuesta;
    }

    /**
     * Método para la inserción de datos nuevos a la base de datos de la Granja
     * Wilbur
     *
     * @param perfil recibe un objeto de tipo <code>DatosPerfil</code> con el
     * contenido de los datos a insertar.
     * @see <code>DatosPerfil</code>
     */
    public boolean ingresarDatosAsignarPerfil(DatosPerfil perfil) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            PreparedStatement insertarDatos;

            insertarDatos = connection.prepareStatement("INSERT INTO PERFILES (ID_PERFIL, NOM_USUARIO, "
                    + "CLAVE, TPERFIL, NUM_DOC_USU) VALUES(?, ?, ?, ?, ?)");

            insertarDatos.setInt(1, perfil.getIdPerfil());
            insertarDatos.setString(2, perfil.getUsuario());
            insertarDatos.setString(3, perfil.getContraIngreso());
            insertarDatos.setInt(4, perfil.getTipoPerfil());
            insertarDatos.setInt(5, perfil.getNumCedula());
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
     * @param modificarPerfil recibe un objeto de tipo <code>Reservas</code> con
     * el contenido de los datos modificados para actualizar en la base de
     * datos.
     * @see <code>DatosPerfil</code>
     */
    public boolean modificarDatosPerfiles(DatosPerfil modificarPerfil) {
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

            modificarSQL = ("UPDATE PERFILES SET "
                    + "NOM_USUARIO = '" + modificarPerfil.getUsuario() + "', "
                    + "CLAVE = '" + modificarPerfil.getContraIngreso() + "', "
                    + "TPERFIL = " + modificarPerfil.getTipoPerfil()
                    + "WHERE NUM_DOC_USU = " + modificarPerfil.getNumCedula());

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
     * @param idPerfil recibe un dato <code>int</code> con el número de la
     * reserva a eliminar de la base de datos.
     */
    public boolean eliminarRegistro(int idPerfil) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM PERFILES WHERE ID_PERFIL = " + idPerfil);

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

    public DatosPerfil consultarPerfil(int id, String campo) {
        DatosPerfil perfil = null;
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConection();
        String consulta = "SELECT * FROM PERFILES WHERE " + campo + " = " + id;
        try {
            Statement consultaperfil = connection.createStatement();
            ResultSet respuesta = consultaperfil.executeQuery(consulta);
            if (respuesta.next()) {
                perfil = new DatosPerfil();
                perfil.setIdPerfil(respuesta.getInt("ID_PERFIL"));
                perfil.setUsuario(respuesta.getString("NOM_USUARIO"));
                perfil.setContraIngreso(respuesta.getString("CLAVE"));
                perfil.setTipoPerfil(respuesta.getInt("TPERFIL"));
                perfil.setNumCedula(respuesta.getInt("NUM_DOC_USU"));

            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perfil;
    }
    
    public DatosPerfil consultarPerfilUsuario(String usuario) {
        DatosPerfil perfil = null;
        Conexion conexion = new Conexion();
        Connection connection = conexion.getConection();
        String consulta = "SELECT * FROM PERFILES WHERE NOM_USUARIO = '" + usuario + "'";
        try {
            Statement consultaperfil = connection.createStatement();
            ResultSet respuesta = consultaperfil.executeQuery(consulta);
            if (respuesta.next()) {
                perfil = new DatosPerfil();
                perfil.setIdPerfil(respuesta.getInt("ID_PERFIL"));
                perfil.setUsuario(respuesta.getString("NOM_USUARIO"));
                perfil.setContraIngreso(respuesta.getString("CLAVE"));
                perfil.setTipoPerfil(respuesta.getInt("TPERFIL"));
                perfil.setNumCedula(respuesta.getInt("NUM_DOC_USU"));

            }
            conexion.cerrarConexion(connection);
        } catch (SQLException ex) {
            Logger.getLogger(CrudPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perfil;
    }

    public boolean consultarUsuContra(String consulta, String campo) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String sql;

            sql = ("SELECT * FROM PERFILES WHERE " + campo + " = '" + consulta + "'");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                if (resultSet.getString(campo).equals(consulta)) {
                    respuesta = true;
                }
            }
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    public java.util.List<DatosPerfil> cargarPerfiles() {
        java.util.List<DatosPerfil> listaPerfil = new ArrayList<DatosPerfil>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosPerfil perfil;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT PE.ID_PERFIL, PE.NUM_DOC_USU, PE.NOM_USUARIO, TPE.NOM_TPERFIL "
                    + "FROM PERFILES PE INNER JOIN TIPO_PERFIL TPE ON PE.TPERFIL = TPE.ID_TPERFIL");
            while (respuesta.next()) {
                perfil = new DatosPerfil();
                perfil.setIdPerfil(respuesta.getInt("ID_PERFIL"));
                perfil.setUsuario(respuesta.getString("NOM_USUARIO"));
                perfil.setNombrePerfil(respuesta.getString("NOM_TPERFIL"));
                perfil.setNumCedula(respuesta.getInt("NUM_DOC_USU"));
                listaPerfil.add(perfil);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPerfil;
    }
    
    public boolean validarDocumentoPer(int documento) {
        boolean respu = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM PERFILES WHERE NUM_DOC_USU = " + documento);
            while (respuesta.next()) {
                if (respuesta.getInt("NUM_DOC_USU") == documento){
                    respu = true;
                }
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respu;
    }

    public DatosPersonal validarDocumento(int documento) {
        DatosPersonal persona = null;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            String consulta = "SELECT * FROM USUARIOS WHERE NUM_DOC = " + documento;
            Statement consultaPersonal = connection.createStatement();
            ResultSet respuesta = consultaPersonal.executeQuery(consulta);
            if (respuesta.next()) {
                persona = new DatosPersonal(
                        respuesta.getString("NOMBRES"),
                        respuesta.getString("APELLIDO1")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudPerfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persona;
    }

    public java.util.List<DatosDependencias> cargarTipoPerfil() {
        java.util.List<DatosDependencias> listaTipoPerfil = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias perfil;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM TIPO_PERFIL ORDER BY NOM_TPERFIL");
            while (respuesta.next()) {
                perfil = new DatosDependencias();
                perfil.setId(respuesta.getInt("ID_TPERFIL"));
                perfil.setNombre(respuesta.getString("NOM_TPERFIL"));
                listaTipoPerfil.add(perfil);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaTipoPerfil;
    }

}
