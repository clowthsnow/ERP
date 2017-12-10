package pe.edu.unsa.minierp.service.core;

import java.util.List;

import pe.edu.unsa.minierp.dominio.Usuario;

public interface UsuarioService {
	
	Usuario validar(Usuario usuario);
	
	Usuario consultar(String codigo); 
	
	Usuario	 agregar(Usuario usuario);
	
	void eliminar(String codigo);
	
	List<Usuario> listar();

}
