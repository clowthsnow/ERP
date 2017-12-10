package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;
import pe.edu.unsa.minierp.dominio.UsuarioAcceso;

@Repository
public interface Usuario_AccesoRepository extends JpaRepository<UsuarioAcceso, Integer> {

	List<UsuarioAcceso> findByFKAcceso(TablaGeneral tab);
	 UsuarioAcceso findByIdUsuarioAcceso(Integer in);
	  List<UsuarioAcceso> findByIdUsuario(Usuario us);
	  List<UsuarioAcceso> findByUsuarioAccesoEstReg(Integer a);
}
