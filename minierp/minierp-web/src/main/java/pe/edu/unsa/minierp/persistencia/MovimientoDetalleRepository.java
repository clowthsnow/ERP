package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.MovimientoCabecera;
import pe.edu.unsa.minierp.dominio.MovimientoDetalle;
@Repository
public interface MovimientoDetalleRepository extends JpaRepository<MovimientoDetalle, Integer> {
	 MovimientoDetalle findByIdMovimientoDetalle(Integer Id);
	  List<MovimientoDetalle> findByIdMovimientoCabecera(MovimientoCabecera mov);
	  List<MovimientoDetalle> findByIdArticulo(Articulo art);
	  List<MovimientoDetalle> findByMovimientoDetalleCantidad(Double cant);
	  List<MovimientoDetalle> findByMovimientoDetalleValorMonetarioTotal(Double Can);
	  List<MovimientoDetalle> findByMovimientoDetalleValorMonetarioImpuesto(Double can);
	  List<MovimientoDetalle> findByMovimientoDetalleEstReg(Integer in);
	
}
