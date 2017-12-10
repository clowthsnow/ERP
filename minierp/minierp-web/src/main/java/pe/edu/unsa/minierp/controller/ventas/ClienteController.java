package pe.edu.unsa.minierp.controller.ventas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unsa.minierp.dominio.Empresa;
import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.service.logistica.EmpresaSedeService;
import pe.edu.unsa.minierp.service.ventas.EmpresaService;
import pe.edu.unsa.minierp.service.ventas.TablaGeneralService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	EmpresaSedeService empresaSedeService;

	@Autowired
	EmpresaService empresaService;
	
	@Autowired
	TablaGeneralService tablaGeneralService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.POST)
	public EmpresaSede agregarEmpresaSede(@RequestBody EmpresaSede empresaSede) {
		Empresa empresa = empresaSede.getIdEmpresa();
		empresa.setEmpresa_Documento(empresaSede.getEmpresaSede_Documento());
		empresa.setEmpresa_Nombre(empresaSede.getEmpresaSede_Nombre());
		empresa.setEmpresa_Telefono(empresaSede.getEmpresaSede_Telefono());
		empresa.setEmpresa_EstReg(1);
		empresa = empresaService.agregar(empresa);

		empresaSede.setIdEmpresa(empresa);
		empresaSede.setEmpresaSede_EstReg(1);
		return empresaSedeService.agregar(empresaSede);

	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.GET)
	public List<EmpresaSede> listar(){
		return empresaSedeService.listar();
	}
	
	@RequestMapping(value = "/consultar/{codigo}", method = RequestMethod.GET)
	public EmpresaSede consultar(@PathVariable String codigo){
		return empresaSedeService.consultar(codigo);
	}
	
	@RequestMapping(value = "/documentoIdentificacion", method = RequestMethod.GET)
	public List<TablaGeneral> obtenerDocumentoIdentificacion(){
		List<TablaGeneral> documento = new ArrayList<TablaGeneral>();
		for(TablaGeneral tabla:tablaGeneralService.listar()){
			if(tabla.getTablaGeneral_Categoria().equals("DOCUMENTO_IDE"))
				documento.add(tabla);
		}
		return documento;
	}
	
	@RequestMapping(value = "/categoriaEmpresa", method = RequestMethod.GET)
	public List<TablaGeneral> obtenerCategoriaEmpresa(){
		List<TablaGeneral> documento = new ArrayList<TablaGeneral>();
		for(TablaGeneral tabla:tablaGeneralService.listar()){
			if(tabla.getTablaGeneral_Categoria().equals("CATEGORIZACIONEMPRESA"))
				documento.add(tabla);
		}
		return documento;
	}

}
