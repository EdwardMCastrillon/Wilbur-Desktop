package Utilidades;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import Identidades.*;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author EDWARD:..
 */
public class Validaciones {

    ImageIcon icoMensajeInfor = new ImageIcon("C:\\OriginalPorcicolaWilbur\\src\\Imagenes\\IconoInformacion.jpg");

    ;
    
   public static boolean validarEmail(String email) {

        // Establecer el patron
        Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

        // Asociar el string al patron
        Matcher m = p.matcher(email);

        // Comprobar si encaja
        return m.matches();

    }

    public String Validacion(DatosPersonal u) {
        String s = "";
        if (!validarEmail(u.getCorreo())) {
            s = "Correo no valido";
        }
        return s;
    }

    public void soloNumeros(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar();//lee el caracter presionado
        int numero = (int) (caracter);
        if (numero == 10)//para activar letra enter
        {
            j.requestFocus();
        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    public void soloLetras(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar(); // para leer el caracter correspondiente a la tecla
        int numero = (int) (caracter);
        if (numero == 10)// PARA LA TECLA ENTER
        {
            j.requestFocus();
        }
        if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    public void validarLongitud(int l, JTextField j, java.awt.event.KeyEvent e) {

        if (j.getText().length() == l) {
            e.consume();
        }

    }

    public void validarLongitudPas(int l, JPasswordField j, java.awt.event.KeyEvent e) {

        if (j.getText().length() == l) {
            e.consume();
        }

    }

    public void validarObligatorios(JTextField j, String mensajeVentana) {

        if (j.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", mensajeVentana, JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            j.requestFocusInWindow();
        }
    }

    public void validarObligatoriosPas(JPasswordField j, String mensajeVentana) {

        if (j.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Campo obligatorio", mensajeVentana, JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            j.requestFocusInWindow();
        }
    }

    public boolean validarContraseñ(String contra, int control[]) {

        int sum = 0, j, i;
        int numero, tama = contra.length();
        for (j = 0; j < (tama - 1); j++) {
            numero = (int) (contra.charAt(j));
            if ((numero > 32 && numero < 40) || (numero > 41 && numero < 48) || (numero > 57 && numero < 65)) {

                control[0] = 1;
            } else {
                if ((numero > 47 && numero < 58)) {

                    control[1] = 2;
                } else {

                    if ((numero > 64 && numero < 91)) {

                        control[2] = 3;
                    } else {
                        if ((numero > 96 && numero < 123)) {

                            control[3] = 4;
                        }
                    }
                }
            }
        }
        for (i = 0; i < 4; i++) {

            sum = sum + control[i];
        }
        if (sum == 10 && tama > 7) {

            return true;
        } else {

            return false;
        }
    }
    
    public long  calcularDias(JDateChooser fecha){
		
		final long  MILI_SEGU_SEMANA = 24 * 60 * 60 * 1000 * 7;
		DateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		Date fechaActual;
		Date fechaNaci=null;
		long  diferencia=0;
		String fe = formato.format(fecha.getDate()); 
		
		try {

    		fechaNaci = formato.parse(fe);

		} catch (ParseException ex) {

   			ex.printStackTrace();

		} 
		fechaActual = new Date();
		
		diferencia=(fechaActual.getTime()-fechaNaci.getTime())/MILI_SEGU_SEMANA;
		
		return diferencia;
	}

    public static String convertirPassword(char[] cPassword) {
        // Declare variables
        String strRet = new String("");

        // Go through each character
        for (int i = 0; i < cPassword.length; i++) {
            strRet += cPassword[i];
        }

        return strRet;
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
    public String convertirFechaString(java.sql.Date date)
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
        java.sql.Date date;
        
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
    
    public int capturarIdDependencia(List<DatosDependencias> listaDependencia, int index){
        int id;
        id = listaDependencia.get(index - 1).getId();
        return id;
    }

}
