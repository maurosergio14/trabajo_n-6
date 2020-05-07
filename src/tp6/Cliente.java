package tp6;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    // int telefono;
    private long dni;

    public String toString(){
        return nombre+" "+apellido+" ";
}
    public Cliente(String nombre,String apellido,String ciudad,String direccion,long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        //this.telefono=telefono;
        this.dni=dni;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   

}
