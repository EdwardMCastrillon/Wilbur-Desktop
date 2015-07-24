/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identidades;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class DatosPersonal {
    
    private int tipoDoc,profesion, documento, telefono, movil, depart, ciudad, rh, sangre, estado,cargo, tipoContrato;
    private String direccion, nombre, correo,rutaImagen, primerApellido, segundoApellido;
    private String  otroEst, obtenidoEstudio, nombreTipoDoc, nombreProf, nombreCargo, nombreTipoCont;
    private Date fechaNacimiento, fechaTitulo, fechaOtroEst, fechaContrato;
    
    public  DatosPersonal(){}

    public DatosPersonal(int documento, int tipoDoc, String nombre, String primerApellido, String segundoApellido,
           Date fechaNacimiento, int depart, int ciudad, int sangre, int rh, int estado, String direccion, 
           int telefono, int movil, String correo, int profesion, Date fechaTitulo, int cargo, Date fechaContrato, 
           int tipoContrato, String rutaImagen, String otroEst, String obtenidoEstudio, Date fechaOtroEst) {
        this.tipoDoc = tipoDoc;
        this.profesion = profesion;
        this.documento = documento;
        this.telefono = telefono;
        this.movil = movil;
        this.depart = depart;
        this.ciudad = ciudad;
        this.rh = rh;
        this.sangre = sangre;
        this.estado = estado;
        this.cargo = cargo;
        this.tipoContrato = tipoContrato;
        this.direccion = direccion;
        this.nombre = nombre;
        this.correo = correo;
        this.rutaImagen = rutaImagen;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.otroEst = otroEst;
        this.obtenidoEstudio = obtenidoEstudio;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaTitulo = fechaTitulo;
        this.fechaOtroEst = fechaOtroEst;
        this.fechaContrato = fechaContrato;
    }

    public DatosPersonal(String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public DatosPersonal(int documento, String nombreTipoDoc, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, String direccion, int telefono, String correo,  String nombreProf, String nombreCargo, String nombreTipoCont, Date fechaContrato) {
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
        this.correo = correo;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombreTipoDoc = nombreTipoDoc;
        this.nombreProf = nombreProf;
        this.nombreCargo = nombreCargo;
        this.nombreTipoCont = nombreTipoCont;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }
    
    

    public String getNombreTipoDoc() {
        return nombreTipoDoc;
    }

    public void setNombreTipoDoc(String nombreTipoDoc) {
        this.nombreTipoDoc = nombreTipoDoc;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getNombreTipoCont() {
        return nombreTipoCont;
    }

    public void setNombreTipoCont(String nombreTipoCont) {
        this.nombreTipoCont = nombreTipoCont;
    }

    public int getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getProfesion() {
        return profesion;
    }

    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public int getSangre() {
        return sangre;
    }

    public void setSangre(int sangre) {
        this.sangre = sangre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getOtroEst() {
        return otroEst;
    }

    public void setOtroEst(String otroEst) {
        this.otroEst = otroEst;
    }

    public String getObtenidoEstudio() {
        return obtenidoEstudio;
    }

    public void setObtenidoEstudio(String obtenidoEstudio) {
        this.obtenidoEstudio = obtenidoEstudio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaTitulo() {
        return fechaTitulo;
    }

    public void setFechaTitulo(Date fechaTitulo) {
        this.fechaTitulo = fechaTitulo;
    }

    public Date getFechaOtroEst() {
        return fechaOtroEst;
    }

    public void setFechaOtroEst(Date fechaOtroEst) {
        this.fechaOtroEst = fechaOtroEst;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }
    
    
}
