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

    @GetMapping(value = "/Clientes")
    public ArrayList<Cliente> mostrar() throws NoSuchMethodException {
        return jm.get("clientes.json", Cliente.class);
    }

    @PostMapping(value = "/Clientes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> agregar_Cliente(@RequestBody Cliente cliente) throws IOException {
        //Marvel mm= new Marvel("a", "b", "c", 33);
        jm.agregarCliente(cliente, "clientes.json");
        return new ResponseEntity<>(cliente, HttpStatus.ACCEPTED);
    }
}
