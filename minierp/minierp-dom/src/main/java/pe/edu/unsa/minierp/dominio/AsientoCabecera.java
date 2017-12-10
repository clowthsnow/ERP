package pe.edu.unsa.minierp.dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
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
@Table(name = "AsientoCabecera", schema = "minierp")

public class AsientoCabecera implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3202239209226717342L;

	@Id
	@Column(name="IdAsientoCabecera")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAsientoCabecera;


	@OneToMany(mappedBy="idAsientoCabecera",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<AsientoDetalle> asientoDetalles=new ArrayList<AsientoDetalle>();

	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="FK_MovimientoOperacion")
	private TablaGeneral fKMovimientoOperacion;

	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="FK_MovimientoDocumento")
	private TablaGeneral fKMovimientoDocumento;

	@Basic(optional=false)
	@Column(name="AsientoCabecera_Serie",length=20,nullable=false)
	private String asientoCabeceraSerie ;

	@Basic(optional=false)
	@Column(name="AsientoCabecera_Numero",length=20,nullable=false)
	private String asientoCabeceraNumero;

	@Basic(optional=false)
	@Column(name="AsientoCabecera_FechaCreacion")
	private Date asientoCabeceraFechaCreacion;
	@Basic(optional=false)
	@Column(name="AsientoCabecera_EstReg",length=11,nullable=false)
	private String asientoCabeceraEstReg;




	public AsientoCabecera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAsientoCabecera() {
		return idAsientoCabecera;
	}

	public void setIdAsientoCabecera(Integer idAsientoCabecera1) {
		idAsientoCabecera = idAsientoCabecera1;
	}

	public TablaGeneral getFK_MovimientoOperacion() {
		return fKMovimientoOperacion;
	}

	public void setFK_MovimientoOperacion(TablaGeneral fK_MovimientoOperacion1) {
		fKMovimientoOperacion = fK_MovimientoOperacion1;
	}

	public TablaGeneral getFK_MovimientoDocumento() {
		return fKMovimientoDocumento;
	}

	public void setFK_MovimientoDocumento(TablaGeneral fK_MovimientoDocumento1) {
		fKMovimientoDocumento = fK_MovimientoDocumento1;
	}

	public String getAsientoCabecera_Serie() {
		return asientoCabeceraSerie;
	}

	public void setAsientoCabecera_Serie(String asientoCabecera_Serie1) {
		asientoCabeceraSerie = asientoCabecera_Serie1;
	}

	public String getAsientoCabecera_Numero() {
		return asientoCabeceraNumero;
	}

	public void setAsientoCabecera_Numero(String asientoCabecera_Numero1) {
		asientoCabeceraNumero = asientoCabecera_Numero1;
	}

	public Date getAsientoCabecera_FechaCreacion() {
		return asientoCabeceraFechaCreacion;
	}

	public void setAsientoCabecera_FechaCreacion(Date asientoCabecera_FechaCreacion1) {
		asientoCabeceraFechaCreacion = asientoCabecera_FechaCreacion1;
	}

	public String getAsientoCabecera_EstReg() {
		return asientoCabeceraEstReg;
	}

	public void setAsientoCabecera_EstReg(String asientoCabecera_EstReg1) {
		asientoCabeceraEstReg = asientoCabecera_EstReg1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAsientoCabecera == null) ? 0 : idAsientoCabecera.hashCode());
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
		AsientoCabecera other = (AsientoCabecera) obj;
		if (idAsientoCabecera == null) {
			if (other.idAsientoCabecera != null)
				return false;
		} else if (!idAsientoCabecera.equals(other.idAsientoCabecera))
			return false;
		return true;
	}

	public List<AsientoDetalle> getAsientoDetalles() {
		return asientoDetalles;
	}

	public void setAsientoDetalles(List<AsientoDetalle> asientoDetalles1) {
		asientoDetalles = asientoDetalles1;
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

}
