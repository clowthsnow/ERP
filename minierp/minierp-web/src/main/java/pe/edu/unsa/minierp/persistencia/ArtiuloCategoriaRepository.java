package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.ArticuloCategoria;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;

@Repository
public interface ArtiuloCategoriaRepository extends JpaRepository<ArticuloCategoria, Integer> {
	 ArticuloCategoria findByIdArticuloCategoria(Integer id);
	  List<ArticuloCategoria> findByIdArticuloCategoriaSubCategoriaDe(ArticuloCategoria art);
	  List<ArticuloCategoria> findByArticuloCategoriaDescripcion(String des);
	  List<ArticuloCategoria> findByArticuloCategoriaTerminal(Boolean bo);
	  List<ArticuloCategoria> findByArticuloCategoriaEstReg(Integer in );
}
