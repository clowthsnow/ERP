package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByIdUsuario(Integer codigo);
	List<Usuario> findByFKUsuarioCargo(TablaGeneral tab);
	List<Usuario> findByUsuarioNombre(String name);
	List<Usuario> findByUsuarioApellido(String ape);
	List<Usuario> findByUsuarioDNI(String dni);
	List<Usuario> findByUsuarioNombreCorto(String nomCor);
	List<Usuario> findByUsuarioLogin(String log);
	List<Usuario> findByUsuarioContrasena(String con);
	List<Usuario> findByUsuarioTelefono(String Tel);
	List<Usuario> findByUsuarioEmail(String email);
	List<Usuario> findByUsuarioDireccion(String dir);
	List<Usuario> findByUsuarioEstReg(Integer i);
	void deleteByIdUsuario(Integer codigo);
}
