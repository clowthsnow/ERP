package pe.edu.unsa.minierp.dominio;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;


@Entity
@Table(name = "Cuenta_Articulo_Operacion", schema = "minierp")
public class CuentaArticuloOperacion implements Serializable {

	/**
	 * 
	 */
	public CuentaArticuloOperacion(){}
	private static final long serialVersionUID = 581301562331662431L;
	@Id
	@Column(name="IdCuenta_Articulo_Operacion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idCuentaArticuloOperacion;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdArticulo")
	private Articulo idArticulo;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdCuenta")
	private Cuenta idCuenta;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_Operacion")
	private TablaGeneral fKOperacion;
	
	@Column(name="Cuenta_Articulo_Operacion_DebeHaber")
	private Boolean cuentaArticuloOperacionDebeHaber;
	@Column(name="Cuenta_Articulo_Operacion_EstReg")
	private Integer cuentaArticuloOperacionEstReg;

	public Integer getIdCuenta_Articulo_Operacion() {
		return idCuentaArticuloOperacion;
	}

	public void setIdCuenta_Articulo_Operacion(Integer idCuenta_Articulo_Operacion) {
		this.idCuentaArticuloOperacion = idCuenta_Articulo_Operacion;
	}

	public Articulo getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Articulo idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Cuenta getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Cuenta idCuenta) {
		this.idCuenta = idCuenta;
	}

	public TablaGeneral getfK_MovimientoOperacion() {
		return fKOperacion;
	}

	public void setfK_MovimientoOperacion(TablaGeneral fK_MovimientoOperacion) {
		this.fKOperacion = fK_MovimientoOperacion;
	}

	public boolean isCuenta_Articulo_Operacion_DebeHaber() {
		return cuentaArticuloOperacionDebeHaber;
	}

	public void setCuenta_Articulo_Operacion_DebeHaber(boolean cuenta_Articulo_Operacion_DebeHaber) {
		this.cuentaArticuloOperacionDebeHaber = cuenta_Articulo_Operacion_DebeHaber;
	}

	public Integer getCuenta_Articulo_Operacion_EstReg() {
		return cuentaArticuloOperacionEstReg;
	}

	public void setCuenta_Articulo_Operacion_EstReg(Integer cuenta_Articulo_Operacion_EstReg) {
		this.cuentaArticuloOperacionEstReg = cuenta_Articulo_Operacion_EstReg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCuentaArticuloOperacion == null) ? 0 : idCuentaArticuloOperacion.hashCode());
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
		CuentaArticuloOperacion other = (CuentaArticuloOperacion) obj;
		if (idCuentaArticuloOperacion == null) {
			if (other.idCuentaArticuloOperacion != null)
				return false;
		} else if (!idCuentaArticuloOperacion.equals(other.idCuentaArticuloOperacion))
			return false;
		return true;
	}
}
