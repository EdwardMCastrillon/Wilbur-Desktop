/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudBaseDatos;

import Identidades.DatosDependencias;
import Identidades.DatosPersonal;
import Utilidades.Validaciones;
import java.util.List;
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
public class CrudPersonal {

    private Validaciones validar;

    public CrudPersonal() {
        validar = new Validaciones();
    }

    public boolean ingresarDatosPersonal(DatosPersonal personal) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            PreparedStatement insertarDatos
                    = connection.prepareStatement("INSERT INTO USUARIOS (NUM_DOC, TIPO_DOC,"
                            + "NOMBRES, APELLIDO1, APELLIDO2, FECHA_NAC, DEPARTAMENTO, CIUDAD, TIPO_SANGRE,"
                            + "TIPO_RH, ESTADO, DIRECCION, TEL_FIJO, TEL_MOVIL,EMAIL,PROFESION,FECHA_OBT_TITULO,"
                            + "CARGO, FECHA_CONTRATO, TIPO_CONTR, FOTO, OTROS_ESTUDIO, TITULO_OBTE, FECHA_FINAL)"
                            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            insertarDatos.setInt(1, personal.getDocumento());
            insertarDatos.setInt(2, personal.getTipoDoc());
            insertarDatos.setString(3, personal.getNombre());
            insertarDatos.setString(4, personal.getPrimerApellido());
            insertarDatos.setString(5, personal.getSegundoApellido());
            insertarDatos.setDate(6, new java.sql.Date(personal.getFechaNacimiento().getTime()));
            insertarDatos.setInt(7, personal.getDepart());
            insertarDatos.setInt(8, personal.getCiudad());
            insertarDatos.setInt(9, personal.getSangre());
            insertarDatos.setInt(10, personal.getRh());
            insertarDatos.setInt(11, personal.getEstado());
            insertarDatos.setString(12, personal.getDireccion());
            insertarDatos.setInt(13, personal.getTelefono());
            insertarDatos.setInt(14, personal.getMovil());
            insertarDatos.setString(15, personal.getCorreo());
            insertarDatos.setInt(16, personal.getProfesion());
            insertarDatos.setDate(17, new java.sql.Date(personal.getFechaTitulo().getTime()));
            insertarDatos.setInt(18, personal.getCargo());
            insertarDatos.setDate(19, new java.sql.Date(personal.getFechaContrato().getTime()));
            insertarDatos.setInt(20, personal.getTipoContrato());
            insertarDatos.setString(21, personal.getRutaImagen());
            insertarDatos.setString(22, personal.getOtroEst());
            insertarDatos.setString(23, personal.getObtenidoEstudio());
            insertarDatos.setDate(24, new java.sql.Date(personal.getFechaOtroEst().getTime()));
            insertarDatos.executeUpdate();
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e.getMessage());
            return respuesta;
        }
        return respuesta;
    }

    /**
     * Método para modificar los datos existentes de un registro almacenado en
     * la base de datos de la empresa Oncaribean.
     *
     * @param modificarPersonal recibe un objeto de tipo <code>Reservas</code>
     * con el contenido de los datos modificados para actualizar en la base de
     * datos.
     * @see <code>Reservas</code>
     */
    public boolean modificarDatosTablaPersonal(DatosPersonal modificarPersonal) {
        boolean respuesta = false;

        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            /**
             * Variable modificarSQL de tipo <code>String</code> en la cual se
             * cargara la petición a la base de datos para insertar los datos.
             */
            String modificarSQL;

            modificarSQL = ("UPDATE USUARIOS SET "
                    + "TIPO_DOC = " + modificarPersonal.getTipoDoc() + ","
                    + "NOMBRES = '" + modificarPersonal.getNombre() + "', "
                    + "APELLIDO1 = '" + modificarPersonal.getPrimerApellido() + "', "
                    + "APELLIDO2 = '" + modificarPersonal.getSegundoApellido() + "',"
                    + "FECHA_NAC = to_date('" + new java.sql.Date(modificarPersonal.getFechaNacimiento().getTime()) + "','YYYY-MM-DD'),"
                    + "DEPARTAMENTO = " + modificarPersonal.getDepart() + ", "
                    + "CIUDAD = " + modificarPersonal.getCiudad() + ", "
                    + "TIPO_SANGRE = " + modificarPersonal.getSangre() + ", "
                    + "TIPO_RH = " + modificarPersonal.getRh() + ", "
                    + "ESTADO = " + modificarPersonal.getEstado() + ", "
                    + "DIRECCION = '" + modificarPersonal.getDireccion() + "', "
                    + "TEL_FIJO = " + modificarPersonal.getTelefono() + ","
                    + "TEL_MOVIL = " + modificarPersonal.getMovil() + ", "
                    + "EMAIL = '" + modificarPersonal.getCorreo() + "', "
                    + "PROFESION = " + modificarPersonal.getProfesion() + ", "
                    + "FECHA_OBT_TITULO = to_date('" + new java.sql.Date(modificarPersonal.getFechaTitulo().getTime()) + "','YYYY-MM-DD'),"
                    + "CARGO = " + modificarPersonal.getCargo() + ", "
                    + "FECHA_CONTRATO = to_date('" + new java.sql.Date(modificarPersonal.getFechaContrato().getTime()) + "','YYYY-MM-DD'),"
                    + "TIPO_CONTR = " + modificarPersonal.getTipoContrato() + ", "
                    + "FOTO = '" + modificarPersonal.getRutaImagen() + "', "
                    + "OTROS_ESTUDIO = '" + modificarPersonal.getOtroEst() + "', "
                    + "TITULO_OBTE = '" + modificarPersonal.getObtenidoEstudio() + "', "
                    + "FECHA_FINAL = to_date('" + new java.sql.Date(modificarPersonal.getFechaOtroEst().getTime()) + "','YYYY-MM-DD')"
                    + "WHERE NUM_DOC = " + modificarPersonal.getDocumento());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(modificarSQL);
            respuesta = true;
            conexion.cerrarConexion(connection);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
            return respuesta;
        }
        return respuesta;
    }

    /**
     * Método para eliminar un registro especifico almacenado en la base de
     * datos de la empresa Oncaribean.
     *
     * @param codReserva recibe un dato <code>int</code> con el número de la
     * reserva a eliminar de la base de datos.
     */
    public boolean eliminarUsuario(int numDoc) {
        boolean respuesta = false;
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM USUARIOS WHERE NUM_DOC = " + numDoc);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(eliminarSQL);
            System.out.println("se elimino");
            respuesta = true;
            conexion.cerrarConexion(connection);

        } catch (Exception e) {
            respuesta = false;
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
        return respuesta;
    }

    public DatosPersonal obtenerUsuario(int numDoc) {

        String sql;
        DatosPersonal personal;

        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();

            personal = null;

            sql = ("SELECT * FROM USUARIOS WHERE NUM_DOC = " + numDoc);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {

                personal = new DatosPersonal(
                        resultSet.getInt("NUM_DOC"),
                        resultSet.getInt("TIPO_DOC"),
                        resultSet.getString("NOMBRES"),
                        resultSet.getString("APELLIDO1"),
                        resultSet.getString("APELLIDO2"),
                        resultSet.getDate("FECHA_NAC"),
                        resultSet.getInt("DEPARTAMENTO"),
                        resultSet.getInt("CIUDAD"),
                        resultSet.getInt("TIPO_SANGRE"),
                        resultSet.getInt("TIPO_RH"),
                        resultSet.getInt("ESTADO"),
                        resultSet.getString("DIRECCION"),
                        resultSet.getInt("TEL_FIJO"),
                        resultSet.getInt("TEL_MOVIL"),
                        resultSet.getString("EMAIL"),
                        resultSet.getInt("PROFESION"),
                        resultSet.getDate("FECHA_OBT_TITULO"),
                        resultSet.getInt("CARGO"),
                        resultSet.getDate("FECHA_CONTRATO"),
                        resultSet.getInt("TIPO_CONTR"),
                        resultSet.getString("FOTO"),
                        resultSet.getString("OTROS_ESTUDIO"),
                        resultSet.getString("TITULO_OBTE"),
                        resultSet.getDate("FECHA_FINAL"));
            }
            conexion.cerrarConexion(connection);
            return personal;

        } catch (SQLException e) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public java.util.List<DatosPersonal> cargarUsuarios() {
        java.util.List<DatosPersonal> listaPersonal = new ArrayList<DatosPersonal>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosPersonal personal;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM USUARIOS");
            while (respuesta.next()) {
                personal = new DatosPersonal(
                        respuesta.getInt("NUM_DOC"),
                        respuesta.getInt("TIPO_DOC"),
                        respuesta.getString("NOMBRES"),
                        respuesta.getString("APELLIDO1"),
                        respuesta.getString("APELLIDO2"),
                        respuesta.getDate("FECHA_NAC"),
                        respuesta.getInt("DEPARTAMENTO"),
                        respuesta.getInt("CIUDAD"),
                        respuesta.getInt("TIPO_SANGRE"),
                        respuesta.getInt("TIPO_RH"),
                        respuesta.getInt("ESTADO"),
                        respuesta.getString("DIRECCION"),
                        respuesta.getInt("TEL_FIJO"),
                        respuesta.getInt("TEL_MOVIL"),
                        respuesta.getString("EMAIL"),
                        respuesta.getInt("PROFESION"),
                        respuesta.getDate("FECHA_OBT_TITULO"),
                        respuesta.getInt("CARGO"),
                        respuesta.getDate("FECHA_CONTRATO"),
                        respuesta.getInt("TIPO_CONTR"),
                        respuesta.getString("FOTO"),
                        respuesta.getString("OTROS_ESTUDIO"),
                        respuesta.getString("TITULO_OBTE"),
                        respuesta.getDate("FECHA_FINAL")
                );
                listaPersonal.add(personal);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaPersonal;
    }

    public List obtenerDependencias(String tabla, String id, String nombre) {

        List<DatosDependencias> listaDependencias = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias dependencia;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM " + tabla + " ORDER BY " + nombre);
            while (respuesta.next()) {
                dependencia = new DatosDependencias();
                dependencia.setId(respuesta.getInt(id));
                dependencia.setNombre(respuesta.getString(nombre));
                listaDependencias.add(dependencia);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaDependencias;
    }
    
    public List obtenerTipoDocumento() {

        List<DatosDependencias> listaTipoDocumentos = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias documen;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM TIPO_DOCUMENTO ORDER BY NOM_DOC");
            while (respuesta.next()) {
                documen = new DatosDependencias();
                documen.setId(respuesta.getInt("ID_DOCUM"));
                documen.setNombre(respuesta.getString("NOM_DOC"));
                listaTipoDocumentos.add(documen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTipoDocumentos;
    }

    public List obtenerTipoRh() {

        List<DatosDependencias> listaTipoRh = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias rh;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM TIPO_RH ORDER BY NOM_RH");
            while (respuesta.next()) {
                rh = new DatosDependencias();
                rh.setId(respuesta.getInt("ID_RH"));
                rh.setNombre(respuesta.getString("NOM_RH"));
                listaTipoRh.add(rh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTipoRh;
    }

    public List obtenerTipoSangre() {

        List<DatosDependencias> listaTipoSangre = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias sangre;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM TIPO_SANGRE ORDER BY NOM_SANGRE");
            while (respuesta.next()) {
                sangre = new DatosDependencias();
                sangre.setId(respuesta.getInt("ID_SANGRE"));
                sangre.setNombre(respuesta.getString("NOM_SANGRE"));
                listaTipoSangre.add(sangre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTipoSangre;
    }

    public List obtenerTipoContrato() {

        List<DatosDependencias> listaTipoContrato = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias contrato;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM TIPO_CONTRATO ORDER BY NOM_TCONT");
            while (respuesta.next()) {
                contrato = new DatosDependencias();
                contrato.setId(respuesta.getInt("ID_TCONT"));
                contrato.setNombre(respuesta.getString("NOM_TCONT"));
                listaTipoContrato.add(contrato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTipoContrato;
    }

    public List obtenerTipoProfesiones() {

        List<DatosDependencias> listaTipoProfesiones = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias profesion;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM PROFESIONES ORDER BY NOM_PROF");
            while (respuesta.next()) {
                profesion = new DatosDependencias();
                profesion.setId(respuesta.getInt("ID_PROF"));
                profesion.setNombre(respuesta.getString("NOM_PROF"));
                listaTipoProfesiones.add(profesion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTipoProfesiones;
    }

    public List obtenerTipoCargos() {

        List<DatosDependencias> listaCargos = new ArrayList<DatosDependencias>();
        try {
            Conexion conexion = new Conexion();
            Connection connection = conexion.getConection();
            DatosDependencias cargo;
            Statement statement = connection.createStatement();
            ResultSet respuesta = statement.executeQuery("SELECT * FROM CARGOS ORDER BY NOM_CARGO");
            while (respuesta.next()) {
                cargo = new DatosDependencias();
                cargo.setId(respuesta.getInt("ID_CARGO"));
                cargo.setNombre(respuesta.getString("NOM_CARGO"));
                listaCargos.add(cargo);
            }
            conexion.cerrarConexion(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCargos;
    }

    public int obtenerCodigoTipoDocumento(String tDoc) {
        return 0;
    }

    public int obtenerCodigoPerfil(String perfil) {
        return 0;
    }

    /**
     * Método que retorna el resultado de una consulta a la base de datos de la
     * empresa Oncaribean.
     *
     * @return un <code>ResultSet</code> con la información consultada a la base
     * de datos.
     */
    /*  public ResultSet listarReservas() {
        
     /**
     * Variable consultaSQL de tipo <code> String</code> a la cual se le
     * asignara la petición para la base de datos.
     */
    /*      String consultaSQL;
                
     try {
     conectar();
            
     consultaSQL = ("SELECT R.COD_RESERV, R.FECHA_INI, R.FECHA_FIN, C.NOMBRE_CLI, C.APELLIDO1_CLI, "
     + "C.APELLIDO2_CLI, CI.NOM_CIUDAD FROM RESERVACIONES R INNER JOIN CLIENTE C "
     + "ON CLIENTE = ID_CLIENTE INNER JOIN PAQUETE P ON R.PAQUETE = P.COD_PAQUETE "
     + "INNER JOIN HOTELES H ON P.HOTEL = H.COD_HOTEL INNER JOIN CIUDAD CI ON "
     + "H.UBICACION = CI.COD_CIUDAD ORDER BY COD_RESERV");

     statement = conexion.createStatement();
     resultSet = statement.executeQuery(consultaSQL);

     //conexion.close();
     } catch (SQLException e) {
            
     Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
     return null;
     }
     return resultSet;
     }*/
}
