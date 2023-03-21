package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class PedidoCliente {
    @JsonProperty("Id_PedidoCliente")
    int Id_PedidoCliente;
    @JsonProperty("Id_Cliente")
    int Id_Cliente;
    @JsonProperty("Producto_Cliente")
    String Producto_Cliente;
    @JsonProperty("Cantidad_Producto")
    float Cantidad_Producto;
    @JsonProperty("Precio")
    float Precio;
    @JsonProperty("Pago")
    String Pago;
    @JsonProperty("Direccion_Envio")
    String Direccion_Envio;
    @JsonProperty("Fecha_Pedido")
    String Fecha_Pedido;
    @JsonProperty("Fecha_Salida_Almacen")
    String Fecha_Salida_Almacen;
    @JsonProperty("Estado")
    int Estado;

    public PedidoCliente(){

    }

    public PedidoCliente(int id_PedidoCliente, int id_Cliente, String producto_Cliente, float cantidad_Producto, float precio, String pago, String direccion_Envio, String fecha_Pedido, String fecha_Salida_Almacen, int estado) {
        Id_PedidoCliente = id_PedidoCliente;
        Id_Cliente = id_Cliente;
        Producto_Cliente = producto_Cliente;
        Cantidad_Producto = cantidad_Producto;
        Precio = precio;
        Pago = pago;
        Direccion_Envio = direccion_Envio;
        Fecha_Pedido = fecha_Pedido;
        Fecha_Salida_Almacen = fecha_Salida_Almacen;
        Estado = estado;
    }

    public int getId_PedidoCliente() {
        return Id_PedidoCliente;
    }

    public void setId_PedidoCliente(int id_PedidoCliente) {
        Id_PedidoCliente = id_PedidoCliente;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        Id_Cliente = id_Cliente;
    }

    public String getProducto_Cliente() {
        return Producto_Cliente;
    }

    public void setProducto_Cliente(String producto_Cliente) {
        Producto_Cliente = producto_Cliente;
    }

    public float getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public void setCantidad_Producto(float cantidad_Producto) {
        Cantidad_Producto = cantidad_Producto;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String pago) {
        Pago = pago;
    }

    public String getDireccion_Envio() {
        return Direccion_Envio;
    }

    public void setDireccion_Envio(String direccion_Envio) {
        Direccion_Envio = direccion_Envio;
    }

    public String getFecha_Pedido() {
        return Fecha_Pedido;
    }

    public void setFecha_Pedido(String fecha_Pedido) {
        Fecha_Pedido = fecha_Pedido;
    }

    public String getFecha_Salida_Almacen() {
        return Fecha_Salida_Almacen;
    }

    public void setFecha_Salida_Almacen(String fecha_Salida_Almacen) {
        Fecha_Salida_Almacen = fecha_Salida_Almacen;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "PedidoCliente{" +
                "Id_PedidoCliente=" + Id_PedidoCliente +
                ", Id_Cliente=" + Id_Cliente +
                ", Producto_Cliente='" + Producto_Cliente + '\'' +
                ", Cantidad_Producto=" + Cantidad_Producto +
                ", Precio=" + Precio +
                ", Pago='" + Pago + '\'' +
                ", Direccion_Envio='" + Direccion_Envio + '\'' +
                ", Fecha_Pedido='" + Fecha_Pedido + '\'' +
                ", Fecha_Salida_Almacen='" + Fecha_Salida_Almacen + '\'' +
                ", Estado=" + Estado +
                '}';
    }

}
