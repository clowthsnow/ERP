package pe.edu.unsa.minierp.service.impl.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsa.minierp.dominio.Empresa;
import pe.edu.unsa.minierp.persistencia.EmpresaRepository;
import pe.edu.unsa.minierp.service.ventas.EmpresaService;
@Service
public class EmpresaServiceImpl implements EmpresaService{
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Override
	public Empresa validar(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa consultar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa agregar(Empresa empresa) {
		// TODO Auto-generated method stub
		return empresaRepository.save(empresa);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> listar() {
		// TODO Auto-generated method stub
		return empresaRepository.findAll();
	}

}
