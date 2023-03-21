package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class MetodoPagoCliente {
    @JsonProperty("Id_Pago")
    int Id_Pago;
    @JsonProperty("Id_Cliente")
    int Id_Cliente;
    @JsonProperty("Banco")
    String Banco;
    @JsonProperty("Numero_Tarjeta")
    int Numero_Tarjeta;
    @JsonProperty("Fecha_Tarjeta")
    String Fecha_Tarjeta;
    @JsonProperty("CVC")
    int CVC;
    @JsonProperty("Principal")
    int Principal;

    public MetodoPagoCliente(){

    }

    public MetodoPagoCliente(int id_Pago, int id_Cliente, String banco, int numero_Tarjeta, String fecha_Tarjeta, int CVC, int principal) {
        Id_Pago = id_Pago;
        Id_Cliente = id_Cliente;
        Banco = banco;
        Numero_Tarjeta = numero_Tarjeta;
        Fecha_Tarjeta = fecha_Tarjeta;
        this.CVC = CVC;
        Principal = principal;
    }

    public int getId_Pago() {
        return Id_Pago;
    }

    public void setId_Pago(int id_Pago) {
        Id_Pago = id_Pago;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        Id_Cliente = id_Cliente;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public int getNumero_Tarjeta() {
        return Numero_Tarjeta;
    }

    public void setNumero_Tarjeta(int numero_Tarjeta) {
        Numero_Tarjeta = numero_Tarjeta;
    }

    public String getFecha_Tarjeta() {
        return Fecha_Tarjeta;
    }

    public void setFecha_Tarjeta(String fecha_Tarjeta) {
        Fecha_Tarjeta = fecha_Tarjeta;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public int getPrincipal() {
        return Principal;
    }

    public void setPrincipal(int principal) {
        Principal = principal;
    }

    @Override
    public String toString() {
        return "MetodoPagoCliente{" +
                "Id_Pago=" + Id_Pago +
                ", Id_Cliente=" + Id_Cliente +
                ", Banco='" + Banco + '\'' +
                ", Numero_Tarjeta=" + Numero_Tarjeta +
                ", Fecha_Tarjeta='" + Fecha_Tarjeta + '\'' +
                ", CVC=" + CVC +
                ", Principal=" + Principal +
                '}';
    }
}
