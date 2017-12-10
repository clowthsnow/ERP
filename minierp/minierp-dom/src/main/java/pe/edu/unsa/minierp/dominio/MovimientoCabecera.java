package pe.edu.unsa.minierp.dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "MovimientoCabecera", schema = "minierp")
public class MovimientoCabecera implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4201718819728295504L;
	@Id
	@Column(name="IdMovimientoCabecera")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idMovimientoCabecera;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdUsuarioDespacho")  
	private Usuario idUsuarioDespacho;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdEmpresaSede_Origen")  
	private EmpresaSede idEmpresaSedeOrigen;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdEmpresaSede_Destino")  
	private EmpresaSede idEmpresaSedeDestino;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdUsuarioCreador")
	private Usuario idUsuarioCreador;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdMovimientoCabecera_Depende")
	private MovimientoCabecera idMovimientoCabeceraDepende;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_EstadoMovimiento")
	private TablaGeneral fKEstadoMovimiento;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_MovimientoOperacion")
	private TablaGeneral fKMovimientoOperacion;


	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_MovimientoDocumento")
	private TablaGeneral fKMovimientoDocumento;


	@Column(name="MovimientoCabecera_FechaCreacion")

	private Date movimientoCabeceraFechaCreacion;
	@Column(name="MovimientoCabecera_FechaPagoPrevisto")
	private Date movimientoCabeceraFechaPagoPrevisto;
	@Column(name="MovimientoCabecera_FechaPagoRealizado")
	private Date movimientoCabeceraFechaPagoRealizado;
	@Column(name="MovimientoCabecera_EntradaOSalida")
	private boolean movimientoCabeceraEntradaOSalida;
	@Column(name="MovimientoCabecera_Serie")
	private String movimientoCabeceraSerie;
	@Column(name="MovimientoCabecera_Numero")
	private String movimientoCabeceraNumero;
	@Column(name="MovimientoCabecera_EstReg")
	private Integer  movimientoCabeceraEstReg;

	@OneToMany(mappedBy="idMovimientoCabecera",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JsonManagedReference

	private List<MovimientoDetalle> movimientoDetalles=new ArrayList<MovimientoDetalle>();

	public Integer getIdMovimientoCabecera() {
		return idMovimientoCabecera;
	}
	public void setIdMovimientoCabecera(Integer idMovimientoCabecera) {
		this.idMovimientoCabecera = idMovimientoCabecera;
	}
	public Usuario getIdUsuarioDespacho() {
		return idUsuarioDespacho;
	}
	public void setIdUsuarioDespacho(Usuario idUsuarioDespacho) {
		this.idUsuarioDespacho = idUsuarioDespacho;
	}
	public EmpresaSede getIdEmpresaSede_Origen() {
		return idEmpresaSedeOrigen;
	}
	public void setIdEmpresaSede_Origen(EmpresaSede idEmpresaSede_Origen) {
		this.idEmpresaSedeOrigen = idEmpresaSede_Origen;
	}
	public EmpresaSede getIdEmpresaSede_Destino() {
		return idEmpresaSedeDestino;
	}
	public void setIdEmpresaSede_Destino(EmpresaSede idEmpresaSede_Destino) {
		this.idEmpresaSedeDestino = idEmpresaSede_Destino;
	}
	public Usuario getIdUsuarioCreador() {
		return idUsuarioCreador;
	}
	public void setIdUsuarioCreador(Usuario idUsuarioCreador) {
		this.idUsuarioCreador = idUsuarioCreador;
	}
	public MovimientoCabecera getIdMovimientoCabecera_Depende() {
		return idMovimientoCabeceraDepende;
	}
	public void setIdMovimientoCabecera_Depende(MovimientoCabecera idMovimientoCabecera_Depende) {
		this.idMovimientoCabeceraDepende = idMovimientoCabecera_Depende;
	}
	public TablaGeneral getfK_EstadoMovimiento() {
		return fKEstadoMovimiento;
	}
	public void setfK_EstadoMovimiento(TablaGeneral fK_EstadoMovimiento) {
		this.fKEstadoMovimiento = fK_EstadoMovimiento;
	}
	public TablaGeneral getfK_MovimientoOperacion() {
		return fKMovimientoOperacion;
	}
	public void setfK_MovimientoOperacion(TablaGeneral fK_MovimientoOperacion) {
		this.fKMovimientoOperacion = fK_MovimientoOperacion;
	}
	public TablaGeneral getfK_MovimientoDocumento() {
		return fKMovimientoDocumento;
	}
	public void setfK_MovimientoDocumento(TablaGeneral fK_MovimientoDocumento) {
		this.fKMovimientoDocumento = fK_MovimientoDocumento;
	}
	public Date getMovimientoCabecera_FechaCreacion() {
		return movimientoCabeceraFechaCreacion;
	}
	public void setMovimientoCabecera_FechaCreacion(Date movimientoCabecera_FechaCreacion) {
		this.movimientoCabeceraFechaCreacion = movimientoCabecera_FechaCreacion;
	}
	public Date getMovimientoCabecera_FechaPagoPrevisto() {
		return movimientoCabeceraFechaPagoPrevisto;
	}
	public void setMovimientoCabecera_FechaPagoPrevisto(Date movimientoCabecera_FechaPagoPrevisto) {
		this.movimientoCabeceraFechaPagoPrevisto = movimientoCabecera_FechaPagoPrevisto;
	}
	public Date getMovimientoCabecera_FechaPagoRealizado() {
		return movimientoCabeceraFechaPagoRealizado;
	}
	public void setMovimientoCabecera_FechaPagoRealizado(Date movimientoCabecera_FechaPagoRealizado) {
		this.movimientoCabeceraFechaPagoRealizado = movimientoCabecera_FechaPagoRealizado;
	}
	public boolean isMovimientoCabecera_EntradaOSalida() {
		return movimientoCabeceraEntradaOSalida;
	}
	public void setMovimientoCabecera_EntradaOSalida(boolean movimientoCabecera_EntradaOSalida) {
		this.movimientoCabeceraEntradaOSalida = movimientoCabecera_EntradaOSalida;
	}
	public String getMovimientoCabecera_Serie() {
		return movimientoCabeceraSerie;
	}
	public void setMovimientoCabecera_Serie(String movimientoCabecera_Serie) {
		this.movimientoCabeceraSerie = movimientoCabecera_Serie;
	}
	public String getMovimientoCabecera_Numero() {
		return movimientoCabeceraNumero;
	}
	public void setMovimientoCabecera_Numero(String movimientoCabecera_Numero) {
		this.movimientoCabeceraNumero = movimientoCabecera_Numero;
	}
	public Integer getMovimientoCabecera_EstReg() {
		return movimientoCabeceraEstReg;
	}
	public void setMovimientoCabecera_EstReg(Integer movimientoCabecera_EstReg) {
		this.movimientoCabeceraEstReg = movimientoCabecera_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMovimientoCabecera == null) ? 0 : idMovimientoCabecera.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovimientoCabecera other = (MovimientoCabecera) obj;
		if (idMovimientoCabecera == null) {
			if (other.idMovimientoCabecera != null)
				return false;
		} else if (!idMovimientoCabecera.equals(other.idMovimientoCabecera))
			return false;
		return true;
	}
	public List<MovimientoDetalle> getMovimientoDetalles() {
		return movimientoDetalles;
	}
	public void setMovimientoDetalles(List<MovimientoDetalle> movimientoDetalles1) {
		movimientoDetalles = movimientoDetalles1;
	}
	public MovimientoCabecera(){};

}
