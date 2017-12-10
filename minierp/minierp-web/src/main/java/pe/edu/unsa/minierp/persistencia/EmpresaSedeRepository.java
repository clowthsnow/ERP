package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Empresa;
import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.dominio.TablaGeneral;

@Repository
public interface EmpresaSedeRepository extends JpaRepository<EmpresaSede, Integer> {
	EmpresaSede findByIdEmpresaSede(Integer codigo);
	List<EmpresaSede> findByIdEmpresa(Empresa emp);
	List<EmpresaSede> findByFKEmpresaSedeClasificacion(TablaGeneral tab);
	List<EmpresaSede> findByEmpresaSedeNombre(String nombre);
	List<EmpresaSede> findByEmpresaSedeDireccion(String nombre );
	List<EmpresaSede> findByEmpresaSedeDocumento(String documento);
	List<EmpresaSede> findByEmpresaSedeTelefono(String tel);
	List<EmpresaSede> findByEmpresaSedeEstReg(Integer est);
	void deleteByIdEmpresaSede(Integer codigo);
}
