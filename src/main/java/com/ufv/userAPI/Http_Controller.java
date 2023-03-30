package com.ufv.userAPI;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
@RestController
public class Http_Controller {
    JSON_Methods jm= new JSON_Methods();

    //------------------------------------------------------GET---------------------------------------------------------
    @GetMapping(value = "/Clientes")
    public ArrayList<Cliente> mostrar() throws NoSuchMethodException {
        return jm.get("clientes.json", Cliente.class);
    }

    @GetMapping(value = "/Empleados")
    public ArrayList<Empleado> mostrar_Empleado() throws NoSuchMethodException {
        return jm.get("empleados.json", Empleado.class);
    }

    @GetMapping(value = "/Fichajes")
    public ArrayList<Fichaje> mostrar_Fichajes() throws NoSuchMethodException {
        return jm.get("fichajes.json", Fichaje.class);
    }

    @GetMapping(value = "/Pago")
    public ArrayList<MetodoPagoCliente> mostrar_Pago() throws NoSuchMethodException {
        return jm.get("pago.json", MetodoPagoCliente.class);
    }

    //------------------------------------------------------POST--------------------------------------------------------

    @PostMapping(value = "/Clientes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> agregar_Cliente(@RequestBody Cliente cliente) throws IOException, NoSuchMethodException {
        jm.post("clientes.json", Cliente.class, cliente);
        return new ResponseEntity<>(cliente, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Empleados", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado> agregar_Empleado(@RequestBody Empleado empleado) throws IOException, NoSuchMethodException {
        jm.post("empleados.json", Empleado.class, empleado);
        return new ResponseEntity<>(empleado, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Fichajes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Fichaje> agregar_Fichajes(@RequestBody Fichaje fichaje) throws IOException, NoSuchMethodException {
        jm.post("fichajes.json", Fichaje.class, fichaje);
        return new ResponseEntity<>(fichaje, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Pago", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MetodoPagoCliente> agregar_Pago(@RequestBody MetodoPagoCliente pago) throws IOException, NoSuchMethodException {
        jm.post("pago.json", MetodoPagoCliente.class, pago);
        return new ResponseEntity<>(pago, HttpStatus.ACCEPTED);
    }


}
