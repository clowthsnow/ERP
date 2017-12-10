package pe.edu.unsa.minierp.service.impl.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsa.minierp.dominio.MovimientoDetalle;
import pe.edu.unsa.minierp.persistencia.MovimientoDetalleRepository;
import pe.edu.unsa.minierp.service.ventas.MovimientoDetalleService;
@Service
public class MovimientoDetalleServiceImpl implements MovimientoDetalleService{
	@Autowired
	MovimientoDetalleRepository movimientoDetalleRepository;
	
	@Override
	public MovimientoDetalle validar(MovimientoDetalle movimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoDetalle consultar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoDetalle agregar(MovimientoDetalle movimiento) {
		// TODO Auto-generated method stub
		return movimientoDetalleRepository.save(movimiento);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MovimientoDetalle> listar() {
		// TODO Auto-generated method stub
		return movimientoDetalleRepository.findAll();
	}

}
