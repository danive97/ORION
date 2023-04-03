package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class PedidoProveedor {
    @JsonProperty("Id_PedidoProveedor")
    int Id_PedidoProveedor;
    @JsonProperty("Id_Proveedor")
    int Id_Proveedor;
    @JsonProperty("Id_Producto")
    int Id_Producto;
    @JsonProperty("Cantidad_Producto")
    float Cantidad_Producto;
    @JsonProperty("Fecha_Pedido")
    String Fecha_Pedido;
    @JsonProperty("Estado")
    int Estado;

    public PedidoProveedor(){

    }

    public PedidoProveedor(int id_PedidoProveedor, int id_Proveedor, int id_Producto, float cantidad_Producto, String fecha_Pedido, int estado) {
        Id_PedidoProveedor = id_PedidoProveedor;
        Id_Proveedor = id_Proveedor;
        Id_Producto = id_Producto;
        Cantidad_Producto = cantidad_Producto;
        Fecha_Pedido = fecha_Pedido;
        Estado = estado;
    }

    public int getId_PedidoProveedor() {
        return Id_PedidoProveedor;
    }

    public void setId_PedidoProveedor(int id_PedidoProveedor) {
        Id_PedidoProveedor = id_PedidoProveedor;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int id_Proveedor) {
        Id_Proveedor = id_Proveedor;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        Id_Producto = id_Producto;
    }

    public float getCantidad_Producto() {
        return Cantidad_Producto;
    }

    public void setCantidad_Producto(float cantidad_Producto) {
        Cantidad_Producto = cantidad_Producto;
    }

    public String getFecha_Pedido() {
        return Fecha_Pedido;
    }

    public void setFecha_Pedido(String fecha_Pedido) {
        Fecha_Pedido = fecha_Pedido;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "PedidoProveedor{" +
                "Id_PedidoProveedor=" + Id_PedidoProveedor +
                ", Id_Proveedor=" + Id_Proveedor +
                ", Id_Producto=" + Id_Producto +
                ", Cantidad_Producto=" + Cantidad_Producto +
                ", Fecha_Pedido='" + Fecha_Pedido + '\'' +
                ", Estado=" + Estado +
                '}';
    }
}