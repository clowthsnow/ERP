package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Articulo;
import pe.edu.unsa.minierp.dominio.Cuenta;
import pe.edu.unsa.minierp.dominio.CuentaArticuloOperacion;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
@Repository
public interface Cuenta_Articulo_OperacionRepository extends JpaRepository<CuentaArticuloOperacion, Integer> {
	 CuentaArticuloOperacion findByIdCuentaArticuloOperacion(Integer cod);
	  List<CuentaArticuloOperacion> findByIdCuenta(Cuenta cuen);
	  List<CuentaArticuloOperacion> findByIdArticulo(Articulo art);
	  List<CuentaArticuloOperacion> findByFKOperacion(TablaGeneral tab);
	  List<CuentaArticuloOperacion> findByCuentaArticuloOperacionDebeHaber(Boolean bo);
	  List<CuentaArticuloOperacion> findByCuentaArticuloOperacionEstReg(Integer in);
	
}
