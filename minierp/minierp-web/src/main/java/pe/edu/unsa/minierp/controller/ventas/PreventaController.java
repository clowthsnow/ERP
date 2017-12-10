package pe.edu.unsa.minierp.controller.ventas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.MovimientoCabecera;
import pe.edu.unsa.minierp.dominio.MovimientoDetalle;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.service.ventas.MovimientoCabeceraService;
import pe.edu.unsa.minierp.service.ventas.MovimientoDetalleService;


@RestController
@RequestMapping("/preventa")
public class PreventaController {

	@Autowired
	MovimientoCabeceraService movimientoCabeceraService;

	@Autowired
	MovimientoDetalleService movimientoDetalleService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public MovimientoCabecera agregarEmpresaSede(@RequestBody MovimientoCabecera preventa) {
		TablaGeneral tablaEstadoMovimiento = new TablaGeneral();
		tablaEstadoMovimiento.setIdTablaGeneral(76);
		
		TablaGeneral tablaDocumente = new TablaGeneral();
		tablaDocumente.setIdTablaGeneral(78);
		
		preventa.setfK_EstadoMovimiento(tablaEstadoMovimiento);
		preventa.setfK_MovimientoDocumento(tablaDocumente);
		preventa.setMovimientoCabecera_EstReg(1);
		preventa = movimientoCabeceraService.agregar(preventa);
		
		for(MovimientoDetalle detalle:preventa.getMovimientoDetalles()){
			detalle.setMovimientoDetalle_EstReg(1);
			detalle.setIdMovimientoCabecera(preventa);
			movimientoDetalleService.agregar(detalle);
		}
		return preventa;

	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<MovimientoCabecera> listar(){
		return movimientoCabeceraService.listar();
	}
	
	
	

}