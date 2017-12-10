package pe.edu.unsa.minierp.service.impl.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsa.minierp.dominio.MovimientoCabecera;
import pe.edu.unsa.minierp.persistencia.MovimientoCabeceraRepository;
import pe.edu.unsa.minierp.service.ventas.MovimientoCabeceraService;
@Service
public class MovimientoCabeceraServiceImpl implements MovimientoCabeceraService{
	@Autowired
	MovimientoCabeceraRepository empresaSedeRepository;
	
	@Override
	public MovimientoCabecera validar(MovimientoCabecera movimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoCabecera consultar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovimientoCabecera agregar(MovimientoCabecera movimiento) {
		// TODO Auto-generated method stub
		return empresaSedeRepository.save(movimiento);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MovimientoCabecera> listar() {
		// TODO Auto-generated method stub
		return empresaSedeRepository.findAll();
	}

}
