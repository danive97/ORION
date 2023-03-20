package com.ufv.userAPI;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import com.ufv.userAPI.JSON_Methods;

@SpringBootApplication
public class UserApiApplication {

	public static void main(String[] args) throws NoSuchMethodException {
		Cliente c= new Cliente();
		Empleado e= new Empleado(1, "1","1", "2", "2", "2", 1, 1, 1, "1", 1, "1" );
		Cliente c1= new Cliente(1,"1","2","3","d","t","a",1);
		ArrayList<Empleado> el= new ArrayList<>();
		ArrayList<Cliente> cl= new ArrayList<Cliente>();
		//el.add(e);
		JSON_Methods g= new JSON_Methods();
		cl= g.get("clientes.json", Cliente.class);
		System.out.println(cl);

		SpringApplication.run(UserApiApplication.class, args);
	}

}
