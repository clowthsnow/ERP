package pe.edu.unsa.minierp.service.impl.logistica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.persistencia.EmpresaSedeRepository;
import pe.edu.unsa.minierp.service.logistica.EmpresaSedeService;

@Service
public class EmpresaSedeServiceImpl implements EmpresaSedeService {

	@Autowired
	EmpresaSedeRepository empresaSedeRepository;

	@Override
	public EmpresaSede validar(EmpresaSede usuario) {

		return empresaSedeRepository.save(usuario);
	}

	@Override
	public EmpresaSede consultar(String codigo) {

		return empresaSedeRepository.findByIdEmpresaSede(Integer.parseInt(codigo));
	}

	@Override
	public EmpresaSede agregar(EmpresaSede articulo) {

		return empresaSedeRepository.save(articulo);
	}

	@Override
	@Transactional
	public void eliminar(String codigo) {
		empresaSedeRepository.deleteByIdEmpresaSede(Integer.parseInt(codigo));

	}

	@Override
	public List<EmpresaSede> listar() {
		return empresaSedeRepository.findAll();
	}
}
