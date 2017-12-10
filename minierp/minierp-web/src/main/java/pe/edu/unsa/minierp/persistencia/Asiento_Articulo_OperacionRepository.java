package pe.edu.unsa.minierp.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pe.edu.unsa.minierp.dominio.CuentaArticuloOperacion;
@Repository
public interface Asiento_Articulo_OperacionRepository extends JpaRepository<CuentaArticuloOperacion, String> {
    
	
}
