/*
    La clase cliente extiende de persona, tiene los atributos  
    Identificacion y lista facturas, sus constructores, getters y setters.
 */
package com.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edwin Benalcazar
 */
public class Cliente extends Persona{
    private String indentificacion;
    private List lista_facturas; 

    public String getIndentificacion() {
        return indentificacion;
    }

    public void setIndentificacion(String indentificacion) {
        this.indentificacion = indentificacion;
    }

    public List getLista_facturas() {
        return lista_facturas;
    }

    public void setLista_facturas(List lista_facturas) {
        this.lista_facturas = lista_facturas;
    }

    public Cliente() {
    }

    public Cliente(String indentificacion, List lista_facturas) {
        this.indentificacion = indentificacion;
        this.lista_facturas = lista_facturas;
    }

    public Cliente(String indentificacion, List lista_facturas, String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
        this.indentificacion = indentificacion;
        this.lista_facturas = lista_facturas;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +indentificacion + ", ";
    }

    
    
    
}
