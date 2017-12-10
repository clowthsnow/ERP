package pe.edu.unsa.minierp.service.ventas;

import java.util.List;

import pe.edu.unsa.minierp.dominio.TablaGeneral;

public interface TablaGeneralService {
	TablaGeneral validar(TablaGeneral tablaGeneral);
	
	TablaGeneral consultar(Integer codigo); 
	
	TablaGeneral agregar(TablaGeneral tablaGeneral);
	
	void eliminar(Integer codigo);
	
	List<TablaGeneral> listar();
}
