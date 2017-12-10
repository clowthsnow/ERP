package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.ArticuloCategoria;
import pe.edu.unsa.minierp.dominio.TablaGeneral;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
	Articulo findByIdArticulo(Integer cod);
	List<Articulo> findByIdArticuloCategoria(ArticuloCategoria cat);
	List<Articulo> findByFKUnidadMedida(TablaGeneral tab);
	List<Articulo> findByArticuloNombre(String nom);
	List<Articulo> findByArticuloEstReg(Integer uno);

	void deleteByIdArticulo(Integer codigo);
}
