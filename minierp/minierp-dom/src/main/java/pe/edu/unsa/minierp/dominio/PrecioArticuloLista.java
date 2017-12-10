
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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "PrecioArticuloLista", schema = "minierp")
public class PrecioArticuloLista implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = -1490769643004388735L;
	@Id
	@Column(name ="IdPrecioArticuloLista")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idPrecioArticuloLista;
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="IdArticulo")
	private Articulo idArticulo;
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="IdListaPrecio")
	private ListaPrecio idListaPrecio;
	@Column(name ="PrecioArticuloLista_Valor")
	private Double precioArticuloListaValor;
	@Column(name ="PrecioArticuloLista_EstReg")

	private Integer precioArticuloListaEstReg;
	public Integer getIdPrecioArticuloLista() {
		return idPrecioArticuloLista;
	}
	public void setIdPrecioArticuloLista(Integer idPrecioArticuloLista) {
		this.idPrecioArticuloLista = idPrecioArticuloLista;
	}
	public Articulo getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(Articulo idArticulo) {
		this.idArticulo = idArticulo;
	}
	public ListaPrecio getIdListaPrecio() {
		return idListaPrecio;
	}
	public void setIdListaPrecio(ListaPrecio idListaPrecio) {
		this.idListaPrecio = idListaPrecio;
	}
	public double getPrecioArticuloLista_Valor() {
		return precioArticuloListaValor;
	}
	public void setPrecioArticuloLista_Valor(double precioArticuloLista_Valor) {
		this.precioArticuloListaValor = precioArticuloLista_Valor;
	}
	public Integer getPrecioArticuloLista_EstReg() {
		return precioArticuloListaEstReg;
	}
	public void setPrecioArticuloLista_EstReg(Integer precioArticuloLista_EstReg) {
		this.precioArticuloListaEstReg = precioArticuloLista_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPrecioArticuloLista == null) ? 0 : idPrecioArticuloLista.hashCode());
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
		PrecioArticuloLista other = (PrecioArticuloLista) obj;
		if (idPrecioArticuloLista == null) {
			if (other.idPrecioArticuloLista != null)
				return false;
		} else if (!idPrecioArticuloLista.equals(other.idPrecioArticuloLista))
			return false;
		return true;
	}
	public PrecioArticuloLista(){}
}
