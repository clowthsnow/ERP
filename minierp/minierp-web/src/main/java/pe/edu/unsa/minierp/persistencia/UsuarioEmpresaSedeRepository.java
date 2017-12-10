package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;
import pe.edu.unsa.minierp.dominio.UsuarioEmpresaSed;
@Repository
public interface UsuarioEmpresaSedeRepository extends JpaRepository<UsuarioEmpresaSed, Integer> {
	 UsuarioEmpresaSed findByIdUsuarioEmpresaSed(Integer in);
	  List<UsuarioEmpresaSed> findByIdUsuario(Usuario us);
	  List<UsuarioEmpresaSed> findByIdEmpresaSede(EmpresaSede emp);
	  List<UsuarioEmpresaSed> findByFKMovimientoDocumento(TablaGeneral tab);
	  List<UsuarioEmpresaSed> findByUsuarioEmpresaSedNumero(String num);
	  List<UsuarioEmpresaSed> findByUsuarioEmpresaSedSerie(String sed);
	  List<UsuarioEmpresaSed> findByUsuarioEmpresaSedEstReg(Integer uno);
}
