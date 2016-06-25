/*
    La clase factura, tiene los atributos  numero, fecha,  
    lista detalles factura, sus constructores, getters y setters.

 */
package com.negocio;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edwin Benalcazar
 */
public class Factura {
    private Integer numero;
    private Date fecha;
    private List lista_detalles_facturas;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");

    public Factura() {
    }

    public Factura(Integer numero, Date fecha, List lista_detalles_facturas) {
        this.numero = numero;
        this.fecha = fecha;
        this.lista_detalles_facturas = lista_detalles_facturas;
    }

    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List getLista_detalles_facturas() {
        return lista_detalles_facturas;
    }

    public void setLista_detalles_facturas(List lista_detalles_facturas) {
        this.lista_detalles_facturas = lista_detalles_facturas;
    }

    @Override
    public String toString() {
        return  numero + ", " + sdf.format(fecha) + ", ";
    }
}
