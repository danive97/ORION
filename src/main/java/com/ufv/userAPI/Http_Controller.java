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

    @GetMapping(value = "/Pagos")
    public ArrayList<MetodoPagoCliente> mostrar_Pagos() throws NoSuchMethodException {
        return jm.get("pagos.json", MetodoPagoCliente.class);
    }
    /****/

    @GetMapping(value = "/Productos")
    public ArrayList<Producto> mostrar_Productos() throws NoSuchMethodException {
        return jm.get("productos.json", Producto.class);
    }

    @GetMapping(value = "/Proveedores")
    public ArrayList<Proveedor> mostrar_Proveedores() throws NoSuchMethodException {
        return jm.get("proveedores.json", Proveedor.class);
    }

    @GetMapping(value = "/PedidosProveedor")
    public ArrayList<PedidoProveedor> mostrar_PedidosProveedor() throws NoSuchMethodException {
        return jm.get("pedidosProveedor.json", PedidoProveedor.class);
    }

    @GetMapping(value = "/PedidosCliente")
    public ArrayList<PedidoCliente> mostrar_PedidosCliente() throws NoSuchMethodException {
        return jm.get("pedidosCliente.json", PedidoCliente.class);
    }

    @GetMapping(value = "/Direcciones")
    public ArrayList<DireccionCliente> mostrar_Direcciones() throws NoSuchMethodException {
        return jm.get("direccionesCliente.json", DireccionCliente.class);
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

    @PostMapping(value = "/Pagos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MetodoPagoCliente> agregar_Pagos(@RequestBody MetodoPagoCliente pago) throws IOException, NoSuchMethodException {
        jm.post("pagos.json", MetodoPagoCliente.class, pago);
        return new ResponseEntity<>(pago, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Productos", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Producto> agregar_Productos(@RequestBody Producto producto) throws IOException, NoSuchMethodException {
        jm.post("productos.json", Producto.class, producto);
        return new ResponseEntity<>(producto, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Proveedores", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Proveedor> agregar_Proveedores(@RequestBody Proveedor proveedor) throws IOException, NoSuchMethodException {
        jm.post("proveedores.json", Proveedor.class, proveedor);
        return new ResponseEntity<>(proveedor, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/PedidosProveedor", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PedidoProveedor> agregar_PedidosProveedor(@RequestBody PedidoProveedor pedidoproveedor) throws IOException, NoSuchMethodException {
        jm.post("pedidosProveedor.json", PedidoProveedor.class, pedidoproveedor);
        return new ResponseEntity<>(pedidoproveedor, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/PedidosCliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PedidoCliente> agregar_PedidosProveedor(@RequestBody PedidoCliente pedidocliente) throws IOException, NoSuchMethodException {
        jm.post("pedidosCliente.json", PedidoCliente.class, pedidocliente);
        return new ResponseEntity<>(pedidocliente, HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/Direcciones", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DireccionCliente> agregar_Direccion(@RequestBody DireccionCliente direccion) throws IOException, NoSuchMethodException {
        jm.post("direccionesCliente.json", DireccionCliente.class, direccion);
        return new ResponseEntity<>(direccion, HttpStatus.ACCEPTED);
    }


}
