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
    int Direccion;
    @JsonProperty("Numero")
    int Numero;
    @JsonProperty("Codigo_Postal")
    int Codigo_Postal;
    @JsonProperty("Localidad")
    int Localidad;

}
