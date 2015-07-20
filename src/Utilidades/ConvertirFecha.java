/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;

/** 
 * Clase publica que parsea una variable tipo <code>java.util.Date</code> a <code>String</code> y parsea una variable
 * tipo <code>String</code> a <code>java.sql.Date</code>.
 * 
 * @version 1.0
 * 
 * @author Juan Esteban Acevedo Gallego
 * 
 * @author Iván Darío Villa Ramírez
 * 
 */
public class ConvertirFecha{
    
    /**
     * Constructor.
     */
    public ConvertirFecha()
    {
    }
    
    /**
     * Método que convierte un parámetro de tipo <code>java.util.Date</code> con formato "yyyy-MM-dd" y retorna 
     * un <code>String</code> con la fecha en el mismo tipo de formato.
     * 
     * @param date de tipo <code>java.util.Date</code>.
     * 
     * @return <code>String</code> con el resultado de los primeros 10 caracteres del parseo de la fecha "yyyy-MM-dd".
     * 
     */
    public String convertirFechaString(Date date)
    {
        /**
         * Variable fecha de tipo <code>String</code>, la cual será retornada
         * por la función.
         *
         */
        String fecha;
        
        /**
         * Variable formato de tipo <code>Format</code>, se instancia como
         * objeto de la clase <code>SimpleDateFormat</code> para acceder a sus
         * métodos y hacer la conversión.
         *
         */
        Format formato;
        
        formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fecha = formato.format(date).substring(0, 10);
        return fecha;
    }
    
    /**
     * Método que convierte un parámetro de tipo <code>String</code> con formato "yyyy-MM-dd" y retorna 
     * un <code>java.sql.Date</code> con la fecha en el mismo tipo de formato.
     * 
     * @param fecha de tipo <code>String</code> con formato "yyyy-MM-dd".
     * 
     * @return <code>java.sql.Date</code> con el resultado del parseo de la fecha "yyyy-MM-dd".
     * 
     */
    public Date convertirStringaFecha(String fecha){
        
        /**
         * Variable formato de tipo <code>SimpleDateFormat</code>, se instancia
         * como objeto de la clase <code>SimpleDateFormat</code> y se envía como
         * parámetro el formato que se desea "yyyy-MM-dd".
         *
         */
        SimpleDateFormat formato;
        
        /**
         * Variable fecha1 de tipo <code>java.sql.Date</code>, la cual será
         * retornada por la función se le asigna valor = <code>null</code>.
         *
         */
        Date fecha1;
        
        /**
         * Variable date de tipo <code>java.sql.Date</code>, se
         * instancia como objeto de la clase <code>java.sql.Date</code> para
         * acceder a sus métodos y hacer la conversión.
         *
         */
        Date date;
        
        formato = new SimpleDateFormat("yyyy-MM-dd");
        fecha1 = null;
        
        try 
        {
            fecha1 = formato.parse(fecha);          
	} catch (ParseException e) {
            return null;
	}
        
        date= new java.sql.Date(fecha1.getTime());
        return date;     
    }
}
