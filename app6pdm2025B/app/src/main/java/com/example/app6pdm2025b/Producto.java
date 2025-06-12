package com.example.app6pdm2025b;

import java.io.Serializable;

public class Producto implements Serializable {

    private String categoria;
    private String nombre;
    private double precio;
    private double cantidad;

    public Producto(String categoria, String nombre, double precio, double cantidad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularPrecio(){
        return precio*cantidad;
    }
}
