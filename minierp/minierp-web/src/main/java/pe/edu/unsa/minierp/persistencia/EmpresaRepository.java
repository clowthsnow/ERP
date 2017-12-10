package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import pe.edu.unsa.minierp.dominio.Empresa;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
	 List<Empresa> findByEmpresaEstReg(Integer uno);
	  Empresa findByIdEmpresa(Integer cod);
	  List<Empresa> findByFKTipoDocumentoIdentificacion(TablaGeneral tab);
	  List<Empresa> findByFKCategorizacionEmpresa(TablaGeneral tab);
	  List<Empresa> findByEmpresaNombre(String nombre);
	  List<Empresa> findByEmpresaDocumento(String doc);
	  List<Empresa> findByEmpresaTelefono(String tel);
	  List<Empresa> findByEmpresaPersonaJuridica(Boolean a);
}
