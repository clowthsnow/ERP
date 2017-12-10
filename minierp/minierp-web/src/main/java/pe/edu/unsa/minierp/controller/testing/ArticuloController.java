package pe.edu.unsa.minierp.controller.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.service.testing.ArticuloService;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

	@Autowired
	ArticuloService articuloService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public Articulo agregarArticulo(@RequestBody Articulo articulo) {

		System.out.println("agregando articulo " + articulo);

		return articuloService.agregar(articulo);
	}

	@RequestMapping(value = "/consultar/{codigo}", method = RequestMethod.GET)
	public Articulo consultarArticulo(@PathVariable String codigo) {

		System.out.println("consultando articulo " + codigo);

		// model.addAttribute(articuloService.consultar(codigo));

		return articuloService.consultar(Integer.parseInt(codigo));
	}

	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<Articulo> listarArticulos() {

		System.out.println("listando articulos ");

		// model.addAttribute("articulos", articuloService.listar());

		return articuloService.listar();
	}

	@RequestMapping(value = "/eliminar/{codigo}", method = RequestMethod.DELETE)
	public void eliminarArticulo(@PathVariable String codigo) {

		System.out.println("eliminando articulo " + codigo);

		articuloService.eliminar(Integer.parseInt(codigo));
	}

}