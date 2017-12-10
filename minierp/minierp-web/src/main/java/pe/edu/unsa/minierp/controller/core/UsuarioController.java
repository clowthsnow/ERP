package pe.edu.unsa.minierp.controller.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.Usuario;
import pe.edu.unsa.minierp.service.core.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public Usuario agregarUsuario(@RequestBody Usuario usuario) {

		System.out.println("agregando usuario " + usuario);

		return usuarioService.agregar(usuario);
	}

	@RequestMapping(value = "/consultar/{codigo}", method = RequestMethod.GET)
	public Usuario consultarUsuario(@PathVariable String codigo) {

		System.out.println("consultando usuario " + codigo);

		// model.addAttribute(articuloService.consultar(codigo));

		return usuarioService.consultar(codigo);
	}

	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<Usuario> listarUsuarios() {

		System.out.println("listando usuarios");

		// model.addAttribute("articulos", articuloService.listar());

		return usuarioService.listar();
	}

	@RequestMapping(value = "/eliminar/{codigo}", method = RequestMethod.DELETE)
	public void eliminarUsuario(@PathVariable String codigo) {

		System.out.println("eliminando usuario " + codigo);

		usuarioService.eliminar(codigo);
	}

}
