package pe.edu.unsa.minierp.controller.testing;

import java.util.List;

import pe.edu.unsa.minierp.dominio.Cliente;

public interface ClienteController {
	
	Cliente validar(Cliente cliente);
	
	Cliente consultar(String codigo); 
	
	Cliente agregar(Cliente cliente);
	
	void eliminar(String codigo);
	
	List<Cliente> listar();

}
