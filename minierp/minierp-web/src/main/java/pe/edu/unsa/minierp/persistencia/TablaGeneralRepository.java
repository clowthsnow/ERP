package pe.edu.unsa.minierp.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pe.edu.unsa.minierp.dominio.TablaGeneral;
@Repository
public interface TablaGeneralRepository extends JpaRepository<TablaGeneral, Integer> {
	
TablaGeneral findByIdTablaGeneral(Integer Id);
	  List<TablaGeneral>TablaGeneralCategoria(String cat);
	  List<TablaGeneral>TablaGeneralDescripcion(String des);
	  List<TablaGeneral>TablaGeneralCodigoMostrable(String cod);
	  List<TablaGeneral>TablaGeneralEstReg(Integer est);
}
