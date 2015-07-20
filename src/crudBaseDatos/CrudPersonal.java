/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudBaseDatos;

import Identidades.DatosPersonal;
import Utilidades.Validaciones;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author ivan
 */
public class CrudPersonal {
    
    private Connection connection;
    private Conexion conexion;
    private Validaciones validar; 
    private Date fechaSql;
    
    public CrudPersonal(){
        conexion = new Conexion();
        validar = new Validaciones();
    }

     public boolean ingresarDatosPersonal(DatosPersonal personal) {
        boolean respuesta = false;
        try {
            Connection connection = conexion.getConection();
            
            PreparedStatement insertarDatos = 
                    connection.prepareStatement("INSERT INTO USUARIOS (NUM_DOC, TIPO_DOC,"
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
            connection = conexion.getConection();
            
            /**
             * Variable modificarSQL de tipo <code>String</code> en
             * la cual se cargara la petición a la base de datos para insertar
             * los datos.
             */
            String modificarSQL;

            modificarSQL = ("UPDATE USUARIOS SET "
                    + "TIPO_DOC = " + modificarPersonal.getTipoDoc()+ ","
                    + "NOMBRES = " + modificarPersonal.getNombre()+ ", "
                    + "APELLIDO1 = " + modificarPersonal.getPrimerApellido() + ", "
                    + "APELLIDO2 = " + modificarPersonal.getSegundoApellido()+ ","
                    + "FECHA_NAC = " + new java.sql.Date(modificarPersonal.getFechaNacimiento().getTime()) + ", "
                    + "DEPARTAMENTO = " + modificarPersonal.getDepart() + ", "
                    + "CIUDAD = " + modificarPersonal.getCiudad() + ", "
                    + "TIPO_SANGRE = " + modificarPersonal.getSangre()+ ", "
                    + "TIPO_RH = " + modificarPersonal.getRh() + ", "
                    + "ESTADO = " + modificarPersonal.getEstado() + ", "
                    + "DIRECCION = " + modificarPersonal.getDireccion() + ", "
                    + "TEL_FIJO = " + modificarPersonal.getTelefono() + ","
                    + "TEL_MOVIL = " + modificarPersonal.getMovil() + ", "
                    + "EMAIL = " + modificarPersonal.getCorreo() + " "
                    + "PROFESION = " + modificarPersonal.getProfesion() + ", "
                    + "FECHA_OBT_TITULO = " +new java.sql.Date(modificarPersonal.getFechaTitulo().getTime()) +","
                    + "CARGO = " + modificarPersonal.getCargo() + ", "
                    + "FECHA_CONTRATO = " + new java.sql.Date(modificarPersonal.getFechaContrato().getTime())+","
                    + "TIPO_CONTR = " + modificarPersonal.getTipoContrato() + ", "
                    + "FOTO = " + modificarPersonal.getRutaImagen()+ ", "
                    + "OTROS_ESTUDIO = " + modificarPersonal.getOtroEst() + ", "
                    + "TITULO_OBTE = " + modificarPersonal.getObtenidoEstudio() + ", "
                    + "FECHA_FINAL = " + new java.sql.Date(modificarPersonal.getFechaOtroEst().getTime()) 
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
     * @param codReserva recibe un dato <code>int</code> con el número
     * de la reserva a eliminar de la base de datos.
     */
    public void eliminarUsuario(int numDoc) {
        
        try {
            connection = conexion.getConection();
            
            /**
             * Variable eliminarSQL de tipo <code>String</code> en la cual se
             * cargara la petición para eliminar el registro.
             */
            String eliminarSQL;

            eliminarSQL = ("DELETE FROM USUARIOS WHERE NUM_DOC = " + numDoc);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(eliminarSQL);
            System.out.println("se elimino");
            conexion.cerrarConexion(connection);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No ha sido posible la conexión a la Base de Datos \n" + e);
        }
    } 


    
    public DatosPersonal obtenerUsuario(int numDoc){
        
        String sql;
        DatosPersonal personal;
        
        try {           
            connection = conexion.getConection();
            
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
       
   /* public ResultSet obtenerTipoDocumento(){
        
        String sql;
                
        try {
            conectar();
            
            sql = ("SELECT * FROM TIPO_DOCUMENTO ORDER BY NOM_TDOC");

            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
           
        } catch (SQLException e) {
            
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
        return resultSet;
    }
    
 
            
    public int obtenerCodigoTipoDocumento(String tDoc){
        return 0;
    }
    
    public int obtenerCodigoPerfil(String perfil){
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
