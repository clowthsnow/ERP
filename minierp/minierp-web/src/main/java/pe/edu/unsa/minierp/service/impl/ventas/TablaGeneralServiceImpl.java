package pe.edu.unsa.minierp.service.impl.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.persistencia.TablaGeneralRepository;
import pe.edu.unsa.minierp.service.ventas.TablaGeneralService;
@Service
public class TablaGeneralServiceImpl implements TablaGeneralService{
	@Autowired
	TablaGeneralRepository tablaGeneralRepository;
	
	@Override
	public TablaGeneral validar(TablaGeneral tabla) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TablaGeneral consultar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TablaGeneral agregar(TablaGeneral tabla) {
		// TODO Auto-generated method stub
		return tablaGeneralRepository.save(tabla);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TablaGeneral> listar() {
		// TODO Auto-generated method stub
		return tablaGeneralRepository.findAll();
	}
}
