package pe.edu.unsa.minierp.service.logistica;

import java.util.List;

import pe.edu.unsa.minierp.dominio.EmpresaSede;

public interface EmpresaSedeService {
	
	EmpresaSede validar(EmpresaSede usuario);
	
	EmpresaSede consultar(String codigo); 
	
	EmpresaSede	 agregar(EmpresaSede usuario);
	
	void eliminar(String codigo);
	
	List<EmpresaSede> listar();

}
