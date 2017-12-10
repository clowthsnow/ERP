package pe.edu.unsa.minierp.service.testing;

import java.util.List;

import pe.edu.unsa.minierp.dominio.Articulo;

public interface ArticuloService {
	
	Articulo validar(Articulo articulo);
	
	Articulo consultar(Integer codigo); 
	
	Articulo agregar(Articulo articulo);
	
	void eliminar(Integer codigo);
	
	List<Articulo> listar();

}
