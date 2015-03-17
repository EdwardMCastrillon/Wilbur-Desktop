
package Utilidades;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import Identidades.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author EDWARD:..
 */
public class Validaciones {
    
    ImageIcon icoMensajeInfor = new ImageIcon("C:\\Users\\Ivan\\Desktop\\Proyecto Git\\src\\Imagenes\\IconoInformacion.jpg");;
    
   public static boolean validarEmail (String email) {
	
	    // Establecer el patron
	    Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");
	
	    // Asociar el string al patron
	    Matcher m = p.matcher(email);
	
	   // Comprobar si encaja
	   return m.matches();
	
	}
   public String Validacion(DatosPersonal u){
       String s="";
        if(!validarEmail(u.getCorreo()))
        {
            s="Correo no valido";
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
      
    public void validarObligatorios( JTextField j , String mensajeVentana){
        
        if ( j.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Campo obligatorio", mensajeVentana, JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            j.requestFocusInWindow();
        }
    }
    
    public void validarObligatoriosPas( JPasswordField j , String mensajeVentana){
        
        if ( j.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Campo obligatorio", mensajeVentana, JOptionPane.YES_OPTION,
                    icoMensajeInfor);
            j.requestFocusInWindow();
        }
    }
      
    public boolean validarContraseñ(String contra, int control[]){
		
		int sum=0,j,i;
		int numero , tama = contra.length(); 
		for (j = 0; j < (tama-1); j++){ 
			numero = (int) (contra.charAt(j));
			if ((numero > 32 && numero < 40) || (numero > 41 && numero < 48) || (numero > 57 && numero < 65)){
        	
	       		control[0] = 1;
	        }else{
	        	if ((numero > 47 && numero <58)){
	        		
	        		control[1] = 2;	
	        	}else{
	        		
	        		 if ((numero > 64 && numero < 91)){
	        		 	
	        		 	control[2] = 3;
	        		 }else{
	        		 	if ((numero > 96 && numero < 123)){
	        		 		
	        		 		control[3] = 4;
	        		 	}	
	        		 }  
	        	}
	        }
		}
		for (i = 0; i < 4; i++){
			
			sum = sum + control[i];
		}
		if (sum == 10 && tama > 7){
			
			return true;
		}else{ 
			
			return false;
		}  
	}
    
    public static String convertirPassword(char[] cPassword)
        {
                // Declare variables
                String strRet = new String("");
                
                // Go through each character
                for (int i = 0; i < cPassword.length; i++)
                {
                        strRet += cPassword[i];
                }
                
                return strRet;
        }
    
}
