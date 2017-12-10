package pe.edu.unsa.minierp.persistencia;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.AsientoCabecera;
import pe.edu.unsa.minierp.dominio.TablaGeneral;

@Repository
public interface AsientoCabeceraRepository extends JpaRepository<AsientoCabecera, Integer> {

	AsientoCabecera findByIdAsientoCabecera(Integer in);
	  List<AsientoCabecera> findByFKMovimientoOperacion(TablaGeneral tab);
	  List<AsientoCabecera> findByFKMovimientoDocumento(TablaGeneral tab);
	  List<AsientoCabecera> findByAsientoCabeceraSerie(String a);
	  List<AsientoCabecera> findByAsientoCabeceraNumero(String a );
	  List<AsientoCabecera> findByAsientoCabeceraFechaCreacion(Date da);
	  List<AsientoCabecera> findByAsientoCabeceraEstReg(Integer in);

}
