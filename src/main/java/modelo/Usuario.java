package modelo;
// Generated 21/03/2018 11:34:09 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nombre;
     private Date fechanac;
     private String correo;
     private Character rol;
     private String contrasena;
     private Set preguntas = new HashSet(0);
     private Set respuestas = new HashSet(0);

    public Usuario() {
    }
    
   public Usuario(String nombre, Date fechanac, String correo, Character rol, String contrasena) {
       this.nombre = nombre;
       this.fechanac = fechanac;
       this.correo = correo;
       this.rol = rol;
       this.contrasena = contrasena;
}   
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Character getRol() {
        return this.rol;
    }
    
    public void setRol(Character rol) {
        this.rol = rol;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Set getPreguntas() {
        return this.preguntas;
    }
    
    public void setPreguntas(Set preguntas) {
        this.preguntas = preguntas;
    }
    public Set getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set respuestas) {
        this.respuestas = respuestas;
    }




}


