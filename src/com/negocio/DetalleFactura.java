/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio;

/**
 *
 * @author Edwin Benalcazar
 */
public class DetalleFactura {
    private String descripcion;
    private Integer cantidad;
    private Double valor;

    public DetalleFactura() {
    }

    public DetalleFactura(String descripcion, Integer cantidad, Double valor) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descripcion + ", " + cantidad + ", " + valor;
    }
    
}
