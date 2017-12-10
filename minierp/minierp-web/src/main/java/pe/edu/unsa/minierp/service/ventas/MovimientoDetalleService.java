package pe.edu.unsa.minierp.service.ventas;

import java.util.List;

import pe.edu.unsa.minierp.dominio.MovimientoDetalle;

public interface MovimientoDetalleService {
	MovimientoDetalle validar(MovimientoDetalle movimientoDetalle);
	
	MovimientoDetalle consultar(Integer codigo); 
	
	MovimientoDetalle agregar(MovimientoDetalle movimientoDetalle);
	
	void eliminar(Integer codigo);
	
	List<MovimientoDetalle> listar();
}
