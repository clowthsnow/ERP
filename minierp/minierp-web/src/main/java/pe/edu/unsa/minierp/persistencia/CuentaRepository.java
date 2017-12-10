package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

	  Cuenta findByIdCuenta(Integer cod);
	  List<Cuenta> findByCuentaNumero(String numero);
	  List<Cuenta> findByCuentaDescripcion(String numero);
	  List<Cuenta> findByCuentaTerminal(String numero);
	  List<Cuenta> findByCuentaEstReg(Integer in );

}
