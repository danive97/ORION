package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Empleado {
    @JsonProperty("Id_Empleado")
    int Id_Empleado;
    @JsonProperty("Nombre_Empleado")
    String Nombre_Empleado;
    @JsonProperty("Apellido_Empleado")
    String Apellido_Empleado;
    @JsonProperty("Fecha_Nacimiento_Empleado")
    String Fecha_Nacimiento_Empleado;
    @JsonProperty("Correo_Empleado")
    String Correo_Empleado;
    @JsonProperty("Password_Empleado")
    String Password_Empleado;
    @JsonProperty("Id_Fiscal_Empleado")
    int Id_Fiscal_Empleado;
    @JsonProperty("NSS_Empleado")
    int NSS_Empleado;
    @JsonProperty("IBAN_Empleado")
    int IBAN_Empleado;
    @JsonProperty("Direccion_Empleado")
    String Direccion_Empleado;
    @JsonProperty("Telefono_Empleado")
    int Telefono_Empleado;
    @JsonProperty("Horario_Empleado")
    String Horario_Empleado;

    public Empleado(){

    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        Id_Empleado = id_Empleado;
    }

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        Nombre_Empleado = nombre_Empleado;
    }

    public String getApellido_Empleado() {
        return Apellido_Empleado;
    }

    public void setApellido_Empleado(String apellido_Empleado) {
        Apellido_Empleado = apellido_Empleado;
    }

    public String getFecha_Nacimiento_Empleado() {
        return Fecha_Nacimiento_Empleado;
    }

    public void setFecha_Nacimiento_Empleado(String fecha_Nacimiento_Empleado) {
        Fecha_Nacimiento_Empleado = fecha_Nacimiento_Empleado;
    }

    public String getCorreo_Empleado() {
        return Correo_Empleado;
    }

    public void setCorreo_Empleado(String correo_Empleado) {
        Correo_Empleado = correo_Empleado;
    }

    public String getPassword_Empleado() {
        return Password_Empleado;
    }

    public void setPassword_Empleado(String password_Empleado) {
        Password_Empleado = password_Empleado;
    }

    public int getId_Fiscal_Empleado() {
        return Id_Fiscal_Empleado;
    }

    public void setId_Fiscal_Empleado(int id_Fiscal_Empleado) {
        Id_Fiscal_Empleado = id_Fiscal_Empleado;
    }

    public int getNSS_Empleado() {
        return NSS_Empleado;
    }

    public void setNSS_Empleado(int NSS_Empleado) {
        this.NSS_Empleado = NSS_Empleado;
    }

    public int getIBAN_Empleado() {
        return IBAN_Empleado;
    }

    public void setIBAN_Empleado(int IBAN_Empleado) {
        this.IBAN_Empleado = IBAN_Empleado;
    }

    public String getDireccion_Empleado() {
        return Direccion_Empleado;
    }

    public void setDireccion_Empleado(String direccion_Empleado) {
        Direccion_Empleado = direccion_Empleado;
    }

    public int getTelefono_Empleado() {
        return Telefono_Empleado;
    }

    public void setTelefono_Empleado(int telefono_Empleado) {
        Telefono_Empleado = telefono_Empleado;
    }

    public String getHorario_Empleado() {
        return Horario_Empleado;
    }

    public void setHorario_Empleado(String horario_Empleado) {
        Horario_Empleado = horario_Empleado;
    }

    public Empleado(int id_Empleado, String nombre_Empleado, String apellido_Empleado, String fecha_Nacimiento_Empleado, String correo_Empleado, String password_Empleado, int id_Fiscal_Empleado, int NSS_Empleado, int IBAN_Empleado, String direccion_Empleado, int telefono_Empleado, String horario_Empleado) {
        Id_Empleado = id_Empleado;
        Nombre_Empleado = nombre_Empleado;
        Apellido_Empleado = apellido_Empleado;
        Fecha_Nacimiento_Empleado = fecha_Nacimiento_Empleado;
        Correo_Empleado = correo_Empleado;
        Password_Empleado = password_Empleado;
        Id_Fiscal_Empleado = id_Fiscal_Empleado;
        this.NSS_Empleado = NSS_Empleado;
        this.IBAN_Empleado = IBAN_Empleado;
        Direccion_Empleado = direccion_Empleado;
        Telefono_Empleado = telefono_Empleado;
        Horario_Empleado = horario_Empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Id_Empleado=" + Id_Empleado +
                ", Nombre_Empleado='" + Nombre_Empleado + '\'' +
                ", Apellido_Empleado='" + Apellido_Empleado + '\'' +
                ", Fecha_Nacimiento_Empleado='" + Fecha_Nacimiento_Empleado + '\'' +
                ", Correo_Empleado='" + Correo_Empleado + '\'' +
                ", Password_Empleado='" + Password_Empleado + '\'' +
                ", Id_Fiscal_Empleado=" + Id_Fiscal_Empleado +
                ", NSS_Empleado=" + NSS_Empleado +
                ", IBAN_Empleado=" + IBAN_Empleado +
                ", Direccion_Empleado='" + Direccion_Empleado + '\'' +
                ", Telefono_Empleado=" + Telefono_Empleado +
                ", Horario_Empleado='" + Horario_Empleado + '\'' +
                '}';
    }
}
