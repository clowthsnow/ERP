
package pe.edu.unsa.minierp.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Cuenta", schema = "minierp")
public class Cuenta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7785631147062704325L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCuenta")
	private Integer idCuenta;

	@Basic(optional=false)
	@Column(name="Cuenta_Numero",length=20,nullable=false)
	private String cuentaNumero;

	@Basic(optional=false)
	@Column(name="Cuenta_Descripcion",length=20,nullable=false)
	private String cuentaDescripcion;

	@Basic(optional=false)
	@Column(name="Cuenta_Terminal",length=1,nullable=false)
	private Integer cuentaTerminal;

	@Basic(optional=false)
	@Column(name="Cuenta_EstReg",length=11,nullable=false)
	private String cuentaEstReg;

	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Integer idCuenta1) {
		idCuenta = idCuenta1;
	}

	public String getCuenta_Numero() {
		return cuentaNumero;
	}

	public void setCuenta_Numero(String Cuenta_Numero1) {
		cuentaNumero = Cuenta_Numero1;
	}

	public String getCuenta_Descripcion() {
		return cuentaDescripcion;
	}

	public void setCuenta_Descripcion(String Cuenta_Descripcion1) {
		cuentaDescripcion = Cuenta_Descripcion1;
	}

	public Integer getCuenta_Terminal() {
		return cuentaTerminal;
	}

	public void setCuenta_Terminal(Integer Cuenta_Terminal1) {
		cuentaTerminal = Cuenta_Terminal1;
	}

	public String getCuenta_EstReg() {
		return cuentaEstReg;
	}

	public void setCuenta_EstReg(String Cuenta_EstReg1) {
		cuentaEstReg = Cuenta_EstReg1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCuenta == null) ? 0 : idCuenta.hashCode());
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
		Cuenta other = (Cuenta) obj;
		if (idCuenta == null) {
			if (other.idCuenta != null)
				return false;
		} else if (!idCuenta.equals(other.idCuenta))
			return false;
		return true;
	}

}