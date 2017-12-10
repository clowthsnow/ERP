
package pe.edu.unsa.minierp.dominio;
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "AsientoDetalle", schema = "minierp")
public class AsientoDetalle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8504707815868753761L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdAsientoDetalle")
	private Integer idAsientoDetalle;

	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="idAsientoCabecera")
	@JsonBackReference
	private AsientoCabecera idAsientoCabecera;

	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="IdCuenta")
	private Cuenta idCuenta;

	@Basic(optional=false)
	@Column(name="AsientoDetalle_Valor",length=20,nullable=false)
	private String asientoDetalleValor ;

	@Basic(optional=false)
	@Column(name="AsientoDetalle_DebeHaber",length=1,nullable=false)
	private Integer asientoDetalleDebeHaber;
	@Basic(optional=false)
	@Column(name="AsientoDetalle_EstReg",length=20,nullable=false)
	private String asientoDetalleEstReg;

	public AsientoDetalle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdAsientoDetalle() {
		return idAsientoDetalle;
	}

	public void setIdAsientoDetalle(Integer idAsientoDetalle1) {
		idAsientoDetalle = idAsientoDetalle1;
	}

	public AsientoCabecera getIdAsientoCabecera() {
		return idAsientoCabecera;
	}

	public void setIdAsientoCabecera(AsientoCabecera asientoCabecera) {
		idAsientoCabecera = asientoCabecera;
	}


	public Cuenta getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Cuenta idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getAsientoDetalle_Valor() {
		return asientoDetalleValor;
	}

	public void setAsientoDetalle_Valo(String asientoDetalle_Valo1) {
		asientoDetalleValor = asientoDetalle_Valo1;
	}

	public Integer getAsientoDetalle_DebeHaber() {
		return asientoDetalleDebeHaber;
	}

	public void setAsientoDetalle_DebeHaber(Integer asientoDetalle_DebeHaber1) {
		asientoDetalleDebeHaber = asientoDetalle_DebeHaber1;
	}

	public String getAsientoDetalle_EstReg() {
		return asientoDetalleEstReg;
	}

	public void setAsientoDetalle_EstReg(String asientoDetalle_EstReg1) {
		asientoDetalleEstReg = asientoDetalle_EstReg1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAsientoDetalle == null) ? 0 : idAsientoDetalle.hashCode());
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
		AsientoDetalle other = (AsientoDetalle) obj;
		if (idAsientoDetalle == null) {
			if (other.idAsientoDetalle != null)
				return false;
		} else if (!idAsientoDetalle.equals(other.idAsientoDetalle))
			return false;
		return true;
	}


}

