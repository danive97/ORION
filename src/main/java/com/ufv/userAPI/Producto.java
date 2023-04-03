package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Producto {
    @JsonProperty("Id_Producto")
    int Id_Producto;
    @JsonProperty("Nombre_Producto")
    String Nombre_Producto;
    @JsonProperty("Cantidad_Picking")
    float Cantidad_Picking;
    @JsonProperty("Cantidad_Stock")
    float Cantidad_Stock;
    @JsonProperty("Precio_Producto_Bruto")
    float Precio_Producto_Bruto;
    @JsonProperty("Precio_Producto_Neto")
    float Precio_Producto_Neto;
    @JsonProperty("Seccion_Producto_Almacen")
    int Seccion_Producto_Almacen;

    public Producto(){

    }

    public Producto(int id_Producto, String nombre_Producto, float cantidad_Picking, float cantidad_Stock, float precio_Producto_Bruto, float precio_Producto_Neto, int seccion_Producto_Almacen) {
        Id_Producto = id_Producto;
        Nombre_Producto = nombre_Producto;
        Cantidad_Picking = cantidad_Picking;
        Cantidad_Stock = cantidad_Stock;
        Precio_Producto_Bruto = precio_Producto_Bruto;
        Precio_Producto_Neto = precio_Producto_Neto;
        Seccion_Producto_Almacen = seccion_Producto_Almacen;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        Id_Producto = id_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        Nombre_Producto = nombre_Producto;
    }

    public float getCantidad_Picking() {
        return Cantidad_Picking;
    }

    public void setCantidad_Picking(float cantidad_Picking) {
        Cantidad_Picking = cantidad_Picking;
    }

    public float getCantidad_Stock() {
        return Cantidad_Stock;
    }

    public void setCantidad_Stock(float cantidad_Stock) {
        Cantidad_Stock = cantidad_Stock;
    }

    public float getPrecio_Producto_Bruto() {
        return Precio_Producto_Bruto;
    }

    public void setPrecio_Producto_Bruto(float precio_Producto_Bruto) {
        Precio_Producto_Bruto = precio_Producto_Bruto;
    }

    public float getPrecio_Producto_Neto() {
        return Precio_Producto_Neto;
    }

    public void setPrecio_Producto_Neto(float precio_Producto_Neto) {
        Precio_Producto_Neto = precio_Producto_Neto;
    }

    public int getSeccion_Producto_Almacen() {
        return Seccion_Producto_Almacen;
    }

    public void setSeccion_Producto_Almacen(int seccion_Producto_Almacen) {
        Seccion_Producto_Almacen = seccion_Producto_Almacen;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Id_Producto=" + Id_Producto +
                ", Nombre_Producto='" + Nombre_Producto + '\'' +
                ", Cantidad_Picking=" + Cantidad_Picking +
                ", Cantidad_Stock=" + Cantidad_Stock +
                ", Precio_Producto_Bruto=" + Precio_Producto_Bruto +
                ", Precio_Producto_Neto=" + Precio_Producto_Neto +
                ", Seccion_Producto_Almacen=" + Seccion_Producto_Almacen +
                '}';
    }
}
