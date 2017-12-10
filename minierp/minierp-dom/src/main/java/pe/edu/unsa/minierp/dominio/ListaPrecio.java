package pe.edu.unsa.minierp.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ListaPrecio", schema = "minierp")
public class ListaPrecio implements Serializable {

	/**
	 * 
	 */
	public ListaPrecio(){}

	private static final long serialVersionUID = 4069885447766313702L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="IdListaPrecio")
	private Integer idListaPrecio;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdEmpresaSede")  
	private EmpresaSede idEmpresaSede;
	@Column(name="ListaPrecio_Descripcion")

	private String listaPrecioDescripcion;
	@Column(name="ListaPrecio_EstReg")

	private Integer listaPrecioEstReg;
	public Integer getIdListaPrecio() {
		return idListaPrecio;
	}
	public void setIdListaPrecio(Integer idListaPrecio) {
		this.idListaPrecio = idListaPrecio;
	}
	public EmpresaSede getIdEmpresaSede() {
		return idEmpresaSede;
	}
	public void setIdEmpresaSede(EmpresaSede idEmpresaSede) {
		this.idEmpresaSede = idEmpresaSede;
	}
	public String getListaPrecio_Descripcion() {
		return listaPrecioDescripcion;
	}
	public void setListaPrecio_Descripcion(String listaPrecio_Descripcion) {
		this.listaPrecioDescripcion = listaPrecio_Descripcion;
	}
	public Integer getListaPrecio_EstReg() {
		return listaPrecioEstReg;
	}
	public void setListaPrecio_EstReg(Integer listaPrecio_EstReg) {
		this.listaPrecioEstReg = listaPrecio_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idListaPrecio == null) ? 0 : idListaPrecio.hashCode());
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
		ListaPrecio other = (ListaPrecio) obj;
		if (idListaPrecio == null) {
			if (other.idListaPrecio != null)
				return false;
		} else if (!idListaPrecio.equals(other.idListaPrecio))
			return false;
		return true;
	}
	
	
	
	
}
