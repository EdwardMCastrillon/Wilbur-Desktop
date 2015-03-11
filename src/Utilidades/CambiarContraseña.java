
package Utilidades;

// @author Juan Esteban Acevedo Gallego

import javax.swing.JOptionPane;


public class CambiarContraseña {
    
    String userName, actPass, newPass, confPass;
    String[][] usuario;
    int posPerfil;
    
       public CambiarContraseña(String userName, String actPass, String newPass, String confPass){
        this.userName = userName;
        this.actPass = actPass;
        this.newPass = newPass;
        this.confPass = confPass;        
    }
    
    public boolean CamposObligatorios() {
        
        if (actPass.equals("") || newPass.equals("") || confPass.equals("")) {
            return (true);
        }
        return (false);       
    }
    
    public boolean LongPass(){
        
        if (newPass.length()<= 4){
            return (true);
        }
        
        return(false);
    }
    
    public boolean EqualPass(){
        
        if (newPass.equals(confPass)){
            return (false);
        }
        return (true);
    }
    
    public boolean CaracterEspecial() {

        int cantChar = newPass.length();
        int cant = 0;
        char c;

        for (int i = 0; i < cantChar; i++) {
            c = newPass.charAt(i);
            if ((((int) c >= 33) && ((int) c <= 47)) || (((int) c >= 58) && ((int) c <= 125))) {
                cant++;
            }
        }

        if (cant >= 1) {
            return (true);
        }
        return (false);
    }
    
    public void ChangePassword(String newUsuario[][]){
        
        usuario = newUsuario;
        
        for (int i = 0; i <= this.usuario.length; i++) {
            
            if (this.usuario[i][1] == null) {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña no coinciden.");
                i = this.usuario.length;
            }else{
            
            if ((this.usuario[i][1].equalsIgnoreCase(userName)) && (usuario[i][2].equals(actPass))) {
                this.usuario[i][2] = newPass;
                i = this.usuario.length;
            }
        }
        }        
    }
    
}
