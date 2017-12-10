package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.dominio.ListaPrecio;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;

@Repository
public interface ListaPrecioRepository extends JpaRepository<ListaPrecio, Integer> {
	 ListaPrecio findByIdListaPrecio(Integer cod);
	  List<ListaPrecio> findByIdEmpresaSede(EmpresaSede emp);
	  List<ListaPrecio> findByListaPrecioDescripcion(String a);
	  List<ListaPrecio> findByListaPrecioEstReg(Integer uno);
	
}
