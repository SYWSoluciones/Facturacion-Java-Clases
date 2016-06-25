/*
    La clase persona tiene tres atributos nombre, dirección, teléfono, 
    sus constructores , getters y setters para cada atributo
 */
package com.negocio;

/**
 *
 * @author Edwin Benalcazar
 */
public class Persona {
   private String nombre;
   private String direccion;
   private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  nombre + ", " + direccion + ", " + telefono ;
    }
   
}
