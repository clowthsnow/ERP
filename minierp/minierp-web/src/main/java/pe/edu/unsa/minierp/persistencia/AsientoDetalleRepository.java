package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.AsientoCabecera;
import pe.edu.unsa.minierp.dominio.AsientoDetalle;
import pe.edu.unsa.minierp.dominio.Cuenta;
@Repository
public abstract interface AsientoDetalleRepository extends JpaRepository<AsientoDetalle, Integer> {
	 AsientoDetalle findByIdAsientoDetalle(Integer in);
	  List<AsientoDetalle> findByIdAsientoCabecera(AsientoCabecera cab);
	  List<AsientoDetalle> findByIdCuenta(Cuenta cu);
	  List<AsientoDetalle> findByAsientoDetalleValor(Double dou);
	  List<AsientoDetalle> findByAsientoDetalleDebeHaber(Boolean bo);
	  List<AsientoDetalle> findByAsientoDetalleEstReg(Integer a);

}
