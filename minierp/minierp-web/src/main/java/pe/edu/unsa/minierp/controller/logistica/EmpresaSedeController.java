package pe.edu.unsa.minierp.controller.logistica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.service.logistica.EmpresaSedeService;

@RestController
@RequestMapping("/empresaSede")
public class EmpresaSedeController {

	@Autowired
	EmpresaSedeService EmpresaSedeService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public EmpresaSede agregarEmpresaSede(@RequestBody EmpresaSede empresaSede) {

		System.out.println("agregando EmpresaSede " + empresaSede);

		return EmpresaSedeService.agregar(empresaSede);
	}

	@RequestMapping(value = "/consultar/{codigo}", method = RequestMethod.GET)
	public EmpresaSede consultarEmpresaSede(@PathVariable String codigo) {

		System.out.println("consultando EmpresaSede " + codigo);

		// model.addAttribute(articuloService.consultar(codigo));

		return EmpresaSedeService.consultar(codigo);
	}

	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<EmpresaSede> listarEmpresaSede() {

		System.out.println("listando EmpresaSede");

		// model.addAttribute("articulos", articuloService.listar());

		return EmpresaSedeService.listar();
	}

	@RequestMapping(value = "/eliminar/{codigo}", method = RequestMethod.DELETE)
	public void eliminarEmpresaSede(@PathVariable String codigo) {

		System.out.println("eliminando EmpresaSede " + codigo);

		EmpresaSedeService.eliminar(codigo);
	}

}
