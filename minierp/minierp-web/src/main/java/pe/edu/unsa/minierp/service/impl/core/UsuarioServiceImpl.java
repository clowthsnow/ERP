package pe.edu.unsa.minierp.service.impl.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unsa.minierp.dominio.Usuario;
import pe.edu.unsa.minierp.persistencia.UsuarioRepository;
import pe.edu.unsa.minierp.service.core.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario validar(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario consultar(String codigo) {

		return usuarioRepository.findByIdUsuario(Integer.parseInt(codigo));
	}

	@Override
	public Usuario agregar(Usuario articulo) {

		return usuarioRepository.save(articulo);
	}

	@Override
	@Transactional
	public void eliminar(String codigo) {
		usuarioRepository.deleteByIdUsuario(Integer.parseInt(codigo));

	}

	@Override
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
}
