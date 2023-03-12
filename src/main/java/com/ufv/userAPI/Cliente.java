package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Cliente {
    @JsonProperty("Id_Cliente")
    String Id_Cliente;
    @JsonProperty("Id_Direccion")
    String Id_Direccion;
    @JsonProperty("Nombre_Cliente")
    String Nombre_Cliente;
    @JsonProperty("Apellido_Cliente")
    String Apellido_Cliente;
    @JsonProperty("Fecha_Nacimiento")
    String Fecha_Nacimiento;
    @JsonProperty("Correo_Cliente")
    String Correo_Cliente;
    @JsonProperty("Password_Cliente")
    String Password_Cliente;
    @JsonProperty("Telefono_Cliente")
    String Telefono_Cliente;

    public Cliente(){

    }

    public Cliente(String id_Cliente, String id_Direccion, String nombre_Cliente, String apellido_Cliente, String fecha_Nacimiento, String correo_Cliente, String password_Cliente, String telefono_Cliente) {
        Id_Cliente = id_Cliente;
        Id_Direccion = id_Direccion;
        Nombre_Cliente = nombre_Cliente;
        Apellido_Cliente = apellido_Cliente;
        Fecha_Nacimiento = fecha_Nacimiento;
        Correo_Cliente = correo_Cliente;
        Password_Cliente = password_Cliente;
        Telefono_Cliente = telefono_Cliente;
    }

    public String getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        Id_Cliente = id_Cliente;
    }

    public String getId_Direccion() {
        return Id_Direccion;
    }

    public void setId_Direccion(String id_Direccion) {
        Id_Direccion = id_Direccion;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String nombre_Cliente) {
        Nombre_Cliente = nombre_Cliente;
    }

    public String getApellido_Cliente() {
        return Apellido_Cliente;
    }

    public void setApellido_Cliente(String apellido_Cliente) {
        Apellido_Cliente = apellido_Cliente;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCorreo_Cliente() {
        return Correo_Cliente;
    }

    public void setCorreo_Cliente(String correo_Cliente) {
        Correo_Cliente = correo_Cliente;
    }

    public String getPassword_Cliente() {
        return Password_Cliente;
    }

    public void setPassword_Cliente(String password_Cliente) {
        Password_Cliente = password_Cliente;
    }

    public String getTelefono_Cliente() {
        return Telefono_Cliente;
    }

    public void setTelefono_Cliente(String telefono_Cliente) {
        Telefono_Cliente = telefono_Cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Id_Cliente='" + Id_Cliente + '\'' +
                ", Id_Direccion='" + Id_Direccion + '\'' +
                ", Nombre_Cliente='" + Nombre_Cliente + '\'' +
                ", Apellido_Cliente='" + Apellido_Cliente + '\'' +
                ", Fecha_Nacimiento='" + Fecha_Nacimiento + '\'' +
                ", Correo_Cliente='" + Correo_Cliente + '\'' +
                ", Password_Cliente='" + Password_Cliente + '\'' +
                ", Telefono_Cliente='" + Telefono_Cliente + '\'' +
                '}';
    }
}
