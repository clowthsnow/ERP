package pe.edu.unsa.minierp.service.ventas;

import java.util.List;

import pe.edu.unsa.minierp.dominio.MovimientoCabecera;

public interface MovimientoCabeceraService {
	MovimientoCabecera validar(MovimientoCabecera movimientoCabecera);
	
	MovimientoCabecera consultar(Integer codigo); 
	
	MovimientoCabecera agregar(MovimientoCabecera movimientoCabecera);
	
	void eliminar(Integer codigo);
	
	List<MovimientoCabecera> listar();
}
