package com.ufv.userAPI;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class JSON_Methods {
    //Metodo GET
    public ArrayList<Cliente> devolverClientes(String direccion){
        ArrayList<Cliente> clientes= new ArrayList<Cliente>();
        Gson gson= new Gson();
        BufferedReader br= null;

        try {
            br= new BufferedReader(new FileReader(direccion));
            Type collectionType = new TypeToken<Collection<Cliente>>(){}.getType();
            Collection<Cliente> Cliente_Collection = gson.fromJson(br, collectionType);

            for(Cliente c: Cliente_Collection){
                Cliente c1= new Cliente(c.Id_Cliente, c.Id_Direccion, c.Nombre_Cliente, c.Apellido_Cliente, c.Fecha_Nacimiento,
                        c.Correo_Cliente, c.Password_Cliente, c.Telefono_Cliente);
                clientes.add(c1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return clientes;
    }

    //Metodo POST
    public int agregarCliente(Cliente cliente, String direccion) throws IOException {
        File archivo= new File("clientes.json");
        //Usamos un arraylist para meter un único personaje, ya que si agregamos el personaje al json como objeto,
        //se crearará un json con objetos y no podremos acceder a él, necesitaremos un json con un array de objetos
        ArrayList<Cliente> clientes= new ArrayList<>();

        if(!archivo.exists()){
            clientes.add(cliente);

            Gson gson= new Gson();
            String js= gson.toJson(clientes);
            FileWriter fw= new FileWriter(archivo);
            fw.write(js);
            fw.close();
            return 1;
        } else{
            clientes= devolverClientes(direccion);
            clientes.add(cliente);

            Gson gson= new Gson();
            String js= gson.toJson(clientes);
            FileWriter fw= new FileWriter(archivo);
            fw.write(js);
            fw.close();
            return 1;
        }
    }
}
