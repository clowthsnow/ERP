package pe.edu.unsa.minierp.persistencia;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.EmpresaSede;
import pe.edu.unsa.minierp.dominio.MovimientoCabecera;
import pe.edu.unsa.minierp.dominio.TablaGeneral;
import pe.edu.unsa.minierp.dominio.Usuario;
@Repository
public interface MovimientoCabeceraRepository extends JpaRepository<MovimientoCabecera, Integer> {

	MovimientoCabecera findByIdMovimientoCabecera(Integer codigo);
	List<MovimientoCabecera> findByIdUsuarioDespacho(Usuario usu);
	List<MovimientoCabecera> findByIdEmpresaSedeOrigen(EmpresaSede Emp);
	List<MovimientoCabecera> findByIdEmpresaSedeDestino(EmpresaSede Emp);
	List<MovimientoCabecera> findByIdUsuarioCreador(Usuario usu);
	List<MovimientoCabecera> findByIdMovimientoCabeceraDepende(MovimientoCabecera movi);
	List<MovimientoCabecera> findByFKEstadoMovimiento(TablaGeneral tabla);
	List<MovimientoCabecera> findByFKMovimientoOperacion(TablaGeneral tabla);
	List<MovimientoCabecera> findByFKMovimientoDocumento(TablaGeneral tabla);
	List<MovimientoCabecera> findByMovimientoCabeceraFechaCreacion(Date dia);
	List<MovimientoCabecera> findByMovimientoCabeceraFechaPagoPrevisto(Date dia);
	List<MovimientoCabecera> findByMovimientoCabeceraFechaPagoRealizado(Date dia);
	List<MovimientoCabecera> findByMovimientoCabeceraEntradaOSalida(Integer dato);
	List<MovimientoCabecera> findByMovimientoCabeceraSerie(String a );
	List<MovimientoCabecera> findByMovimientoCabeceraNumero(String a );
	List<MovimientoCabecera> findByMovimientoCabeceraEstReg(String a );
	void deleteByIdMovimientoCabecera(Integer codigo);
}
