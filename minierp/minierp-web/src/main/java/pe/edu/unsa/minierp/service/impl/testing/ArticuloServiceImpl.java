package pe.edu.unsa.minierp.service.impl.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.persistencia.ArticuloRepository;
import pe.edu.unsa.minierp.service.testing.ArticuloService;

@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	ArticuloRepository articuloRepository;

	@Override
	public Articulo validar(Articulo articulo) {

		return articuloRepository.save(articulo);
	}

	@Override
	public Articulo consultar(Integer codigo) {

		return articuloRepository.findByIdArticulo(codigo);
	}

	@Override
	public Articulo agregar(Articulo articulo) {
          
		return articuloRepository.save(articulo);
	}

	@Override
	@Transactional
	public void eliminar(Integer codigo) {
		articuloRepository.deleteByIdArticulo(codigo);

	}

	@Override
	public List<Articulo> listar() {
		return articuloRepository.findAll();
	}

}