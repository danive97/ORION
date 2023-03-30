package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class DireccionCliente {
    @JsonProperty("Id_Direccion")
    int Id_Direccion;
    @JsonProperty("Id_Cliente")
    int Id_Cliente;
    @JsonProperty("Direccion")
    String Direccion;
    @JsonProperty("Numero")
    int Numero;
    @JsonProperty("Codigo_Postal")
    int Codigo_Postal;
    @JsonProperty("Localidad")
    String Localidad;
    @JsonProperty("Municipio")
    String Municipio;
    @JsonProperty("Otros")
    String Otros;
    @JsonProperty("Principal")
    int Principal;

    public DireccionCliente(){

    }

    public DireccionCliente(int id_Direccion, int id_Cliente, String direccion, int numero, int codigo_Postal, String localidad, String municipio, String otros, int principal) {
        Id_Direccion = id_Direccion;
        Id_Cliente = id_Cliente;
        Direccion = direccion;
        Numero = numero;
        Codigo_Postal = codigo_Postal;
        Localidad = localidad;
        Municipio = municipio;
        Otros = otros;
        Principal = principal;
    }

    public int getId_Direccion() {
        return Id_Direccion;
    }

    public void setId_Direccion(int id_Direccion) {
        Id_Direccion = id_Direccion;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        Id_Cliente = id_Cliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getCodigo_Postal() {
        return Codigo_Postal;
    }

    public void setCodigo_Postal(int codigo_Postal) {
        Codigo_Postal = codigo_Postal;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getOtros() {
        return Otros;
    }

    public void setOtros(String otros) {
        Otros = otros;
    }

    public int getPrincipal() {
        return Principal;
    }

    public void setPrincipal(int principal) {
        Principal = principal;
    }

    @Override
    public String toString() {
        return "DireccionCliente{" +
                "Id_Direccion=" + Id_Direccion +
                ", Id_Cliente=" + Id_Cliente +
                ", Direccion='" + Direccion + '\'' +
                ", Numero=" + Numero +
                ", Codigo_Postal=" + Codigo_Postal +
                ", Localidad='" + Localidad + '\'' +
                ", Municipio='" + Municipio + '\'' +
                ", Otros='" + Otros + '\'' +
                ", Principal=" + Principal +
                '}';
    }
}
