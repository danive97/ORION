package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Proveedor {
    @JsonProperty("Id_Proveedor")
    int Id_Proveedor;
    @JsonProperty("Nombre_Proveedor")
    String Nombre_Proveedor;
    @JsonProperty("Telefono_Proveedor")
    int Telefono_Proveedor;
    @JsonProperty("Correo_Proveedor")
    String Correo_Proveedor;
    @JsonProperty("Producto_Proveedor")
    String Producto_Proveedor;
    @JsonProperty("Direccion_Proveedor")
    String Direccion_Proveedor;

    public Proveedor(){

    }

    public Proveedor(int id_Proveedor, String nombre_Proveedor, int telefono_Proveedor, String correo_Proveedor, String producto_Proveedor, String direccion_Proveedor) {
        Id_Proveedor = id_Proveedor;
        Nombre_Proveedor = nombre_Proveedor;
        Telefono_Proveedor = telefono_Proveedor;
        Correo_Proveedor = correo_Proveedor;
        Producto_Proveedor = producto_Proveedor;
        Direccion_Proveedor = direccion_Proveedor;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int id_Proveedor) {
        Id_Proveedor = id_Proveedor;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String nombre_Proveedor) {
        Nombre_Proveedor = nombre_Proveedor;
    }

    public int getTelefono_Proveedor() {
        return Telefono_Proveedor;
    }

    public void setTelefono_Proveedor(int telefono_Proveedor) {
        Telefono_Proveedor = telefono_Proveedor;
    }

    public String getCorreo_Proveedor() {
        return Correo_Proveedor;
    }

    public void setCorreo_Proveedor(String correo_Proveedor) {
        Correo_Proveedor = correo_Proveedor;
    }

    public String getProducto_Proveedor() {
        return Producto_Proveedor;
    }

    public void setProducto_Proveedor(String producto_Proveedor) {
        Producto_Proveedor = producto_Proveedor;
    }

    public String getDireccion_Proveedor() {
        return Direccion_Proveedor;
    }

    public void setDireccion_Proveedor(String direccion_Proveedor) {
        Direccion_Proveedor = direccion_Proveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "Id_Proveedor=" + Id_Proveedor +
                ", Nombre_Proveedor='" + Nombre_Proveedor + '\'' +
                ", Telefono_Proveedor=" + Telefono_Proveedor +
                ", Correo_Proveedor='" + Correo_Proveedor + '\'' +
                ", Producto_Proveedor='" + Producto_Proveedor + '\'' +
                ", Direccion_Proveedor='" + Direccion_Proveedor + '\'' +
                '}';
    }
}
