package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Fichaje {
    @JsonProperty("Id_Fichaje")
    int Id_Direccion;
    @JsonProperty("Id_Empleado")
    int Id_Cliente;
    @JsonProperty("Dia")
    int Dia;
    @JsonProperty("Hora_Entrada")
    int Hora_Entrada;
    @JsonProperty("Hora_Salida")
    int Hora_Salida;
    @JsonProperty("Horas_Trabajadas")
    int Horas_Trabajadas;
    @JsonProperty("Horas_Extra")
    int Horas_Extra;
    @JsonProperty("Horas_Extra_Total")
    int Horas_Extra_Total;

    public Fichaje(){

    }

    public Fichaje(int id_Direccion, int id_Cliente, int dia, int hora_Entrada, int hora_Salida, int horas_Trabajadas, int horas_Extra, int horas_Extra_Total) {
        Id_Direccion = id_Direccion;
        Id_Cliente = id_Cliente;
        Dia = dia;
        Hora_Entrada = hora_Entrada;
        Hora_Salida = hora_Salida;
        Horas_Trabajadas = horas_Trabajadas;
        Horas_Extra = horas_Extra;
        Horas_Extra_Total = horas_Extra_Total;
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

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getHora_Entrada() {
        return Hora_Entrada;
    }

    public void setHora_Entrada(int hora_Entrada) {
        Hora_Entrada = hora_Entrada;
    }

    public int getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(int hora_Salida) {
        Hora_Salida = hora_Salida;
    }

    public int getHoras_Trabajadas() {
        return Horas_Trabajadas;
    }

    public void setHoras_Trabajadas(int horas_Trabajadas) {
        Horas_Trabajadas = horas_Trabajadas;
    }

    public int getHoras_Extra() {
        return Horas_Extra;
    }

    public void setHoras_Extra(int horas_Extra) {
        Horas_Extra = horas_Extra;
    }

    public int getHoras_Extra_Total() {
        return Horas_Extra_Total;
    }

    public void setHoras_Extra_Total(int horas_Extra_Total) {
        Horas_Extra_Total = horas_Extra_Total;
    }

    @Override
    public String toString() {
        return "Fichaje{" +
                "Id_Direccion=" + Id_Direccion +
                ", Id_Cliente=" + Id_Cliente +
                ", Dia=" + Dia +
                ", Hora_Entrada=" + Hora_Entrada +
                ", Hora_Salida=" + Hora_Salida +
                ", Horas_Trabajadas=" + Horas_Trabajadas +
                ", Horas_Extra=" + Horas_Extra +
                ", Horas_Extra_Total=" + Horas_Extra_Total +
                '}';
    }
}
