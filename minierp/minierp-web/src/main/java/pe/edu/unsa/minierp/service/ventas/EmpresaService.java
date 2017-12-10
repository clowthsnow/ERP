package pe.edu.unsa.minierp.service.ventas;

import java.util.List;

import pe.edu.unsa.minierp.dominio.Empresa;

public interface EmpresaService {
	Empresa validar(Empresa empresaSede);
	
	Empresa consultar(Integer codigo); 
	
	Empresa	 agregar(Empresa empresaSede);
	
	void eliminar(Integer codigo);
	
	List<Empresa> listar();
}
