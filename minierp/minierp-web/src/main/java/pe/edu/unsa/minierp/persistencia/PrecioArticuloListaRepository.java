package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.ListaPrecio;
import pe.edu.unsa.minierp.dominio.PrecioArticuloLista;
@Repository

public interface PrecioArticuloListaRepository extends JpaRepository<PrecioArticuloLista, Integer> {
	 PrecioArticuloLista findByIdPrecioArticuloLista(Integer in);
	  List< PrecioArticuloLista> findByIdListaPrecio(ListaPrecio lis);
	  List< PrecioArticuloLista> findByIdArticulo(Articulo art);
	  List< PrecioArticuloLista> findByPrecioArticuloListaValor(Double dou);
	  List< PrecioArticuloLista> findByPrecioArticuloListaEstReg(Integer in);
}
