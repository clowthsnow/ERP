package pe.edu.unsa.minierp.controller.testing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.MovimientoCabecera;
import pe.edu.unsa.minierp.service.ventas.MovimientoCabeceraService;
@RestController
@RequestMapping("/MovimientoCabeceras")
public class MovimientoCabeceraController {

	@Autowired
	MovimientoCabeceraService MovimientoCabeceraService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public MovimientoCabecera agregarMovimientoCabecera(@RequestBody MovimientoCabecera MovimientoCabecera) {

		System.out.println("agregando MovimientoCabecera " + MovimientoCabecera);

		return MovimientoCabeceraService.agregar(MovimientoCabecera);
	}

	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<MovimientoCabecera> listarMovimientoCabeceras() {

		System.out.println("listando MovimientoCabeceras ");

		// model.addAttribute("MovimientoCabeceras", MovimientoCabeceraService.listar());

		return MovimientoCabeceraService.listar();
	}

	
}
