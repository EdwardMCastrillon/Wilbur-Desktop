/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Identidades.DatosPerfil;
import Nodos.NodoPerfil;
import java.util.Date;

/**
 *
 * @author Ivan
 */
public class ListaPerfil {

    /**
     * primer nodo de la lista
     */
    private NodoPerfil cabeza;

    /**
     * ultimo nodo de la lista
     */
    private NodoPerfil ultimo;

    /**
     * milisegundos que contiened un día
     */
    private final long MILI_SEGU_DIA = 24 * 60 * 60 * 1000;

    public ListaPerfil() {

        cabeza = null;
        ultimo = null;
    }

    public NodoPerfil getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPerfil cabeza) {
        this.cabeza = cabeza;
    }

    public NodoPerfil getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoPerfil ultimo) {
        this.ultimo = ultimo;
    }
    
      public boolean guardarPerfil(DatosPerfil perfil){
    	
    	NodoPerfil nuevoPerfil = new NodoPerfil(); 
    	nuevoPerfil.setPerfil(perfil);
    	
    	if (cabeza==null){
    		
    		nuevoPerfil.setLiga(null);
    		cabeza=nuevoPerfil;
    		ultimo=nuevoPerfil;
    		return true;
    	}else{
    		
    		nuevoPerfil.setLiga(ultimo.getLiga());
    		ultimo.setLiga(nuevoPerfil);
    		ultimo=nuevoPerfil;
    		return true;
    	}
    }
    
    public boolean modificarPerfil(DatosPerfil perfil){
    	
    	NodoPerfil auxi=cabeza;
    	
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getNumCedula().equals(perfil.getNumCedula())){
    			
    			auxi.setPerfil(perfil);
    			return true;
    		}
    		auxi=auxi.getLiga();
    	}
    	return false;
    }
    
    public boolean eliminarPerfil(String doc){
    	
    	NodoPerfil auxi= cabeza;
        NodoPerfil ant= null;
        while(auxi!=null){
        	
            if(auxi.getPerfil().getNumCedula().equals(doc)){
            	
                if(auxi==cabeza)
                {
                    cabeza=cabeza.getLiga();
                    return true;
                    
                }
                else
                {
                    if(auxi==ultimo)
                    {
                        ant.setLiga(auxi.getLiga());
                        ultimo=ant;
                        return true;
                    }
                    ant.setLiga(auxi.getLiga());
                    
                }
            }
            ant=auxi;
            auxi=auxi.getLiga();
        }
        return false;
    }
    
    public DatosPerfil BuscarPerfil(String doc){
    	
    	NodoPerfil auxi=cabeza;
    	DatosPerfil perfil=null;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getNumCedula().equals(doc)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi=auxi.getLiga();
    	}
    	return perfil;
    }
    
    public DatosPerfil BuscarPerfilUsuario(String nombre){
    	
    	NodoPerfil auxi=cabeza;
    	DatosPerfil perfil=null;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getNombre().equals(nombre)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi=auxi.getLiga();
    	}
    	return perfil;
    }
    
    public DatosPerfil BuscarPerfilNomUsuario(String usuario){
    	
    	NodoPerfil auxi=cabeza;
    	DatosPerfil perfil=null;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getUsuario().equals(usuario)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi=auxi.getLiga();
    	}
    	return perfil;
    }
    
 /*   public DatosPerfil BuscarPerfilCorreo(String contra){
    	
    	NodoPerfil auxi=cabeza;
    	DatosPerfil perfil=null;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getCorreoCorpora().equals(contra)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi=auxi.getLiga();
    	}
    	return perfil;
    }
    */
    public boolean existePerfil(String doc){
    	
    	NodoPerfil auxi=cabeza;
    	while (auxi !=null){
    		
    		if (auxi.getPerfil().getNumCedula().equals(doc)){
    			
    			return true;
    		}
    		auxi=auxi.getLiga();
    	}
    	return false;
    }
    
    /** Metodo en el cual se confirman los datos del usuario para recuperar la contraseña en la lista de perfiles
     *
     *@param usuario nombre de usuario de ingreso al sistema
     *@param pregunta  pregunta secreta
     *@param respuesta respuesta a la pregunta secreta
     *@return retorna todos los datos del usuario consultado
     */
    public DatosPerfil confirmarDatosContra(String usuario, String pregunta,String respuesta){
    	
    	NodoPerfil auxi = cabeza;
    	DatosPerfil perfil=null;
    	while (auxi != null){
    		
    		if (auxi.getPerfil().getUsuario().equals(usuario)){
    			
    			perfil = auxi.getPerfil();
    			return perfil;
    		}
    		auxi = auxi.getLiga();
    	}
    	return perfil;
    }
    
    /** Metodo que confirmar los datos del usuario al ingreso al sistema en la lista de perfiles
     *
     *@param usuario nombre de usuario de ingreso al sistema
     *@param contra  contraseña de ingreso al sistema
     *@return retorna todos los datos del usuario de la contraseña dada
     */
    public DatosPerfil confirmarUsuario(String usuario, String contra){
    	
    	NodoPerfil auxi = cabeza;
    	while (auxi != null){
    		
    		if (auxi.getPerfil().getUsuario().equals(usuario) && auxi.getPerfil().getContraIngreso().equals(contra)){
    			return auxi.getPerfil();
    		}else{
    			
    			auxi = auxi.getLiga();
    		}
    	}
    	return null;
    }
    
    public long fechaCambioContra(Date fecha){
    	
    	Date fechaActual = new Date();
        long  dif = (fechaActual.getTime() - fecha.getTime())/MILI_SEGU_DIA; 
        return dif;
    }
    
    /** Metodo el cual modifica la contraseña de ingreso en la lista de perfiles
     *
     *@param perfil contiene los datos del perfil ya modificado 
     *@return retorna todos los datos del perfil modificado luego de guardarlo en la lista
     */
    public DatosPerfil modificarContraseñaIngrse(DatosPerfil perfil, String contra){
    	
    	NodoPerfil auxi = cabeza;
    	while ( auxi != null ){
    		
    		if (auxi.getPerfil().getUsuario().equals(perfil.getUsuario()) && auxi.getPerfil().getContraIngreso().equals(contra)){
    				
    				auxi.getPerfil().setContraIngreso(perfil.getContraIngreso());
    				auxi.getPerfil().setRepetirContraIngreso(perfil.getRepetirContraIngreso());
                                auxi.getPerfil().setFecha(perfil.getFecha());
    				return auxi.getPerfil();
    		}else{
    			
    			auxi = auxi.getLiga();
    		}
    	}
    	return null;
    }

}
