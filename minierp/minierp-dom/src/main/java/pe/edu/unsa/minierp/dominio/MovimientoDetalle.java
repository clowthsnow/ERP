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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "MovimientoDetalle", schema = "minierp")
public class MovimientoDetalle implements Serializable{
	/**
	 * 
	 */	
	@Id
	@Column(name="IdMovimientoDetalle")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idMovimientoDetalle;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdMovimientoCabecera")
	@JsonBackReference
	private MovimientoCabecera idMovimientoCabecera;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdArticulo")

	private Articulo idArticulo;

	@Column(name="MovimientoDetalle_Cantidad")

	private double movimientoDetalleCantidad;
	@Column(name="MovimientoDetalle_ValorMonetarioTotal")

	private double  movimientoDetalleValorMonetarioTotal;
	@Column(name="MovimientoDetalle_ValorMonetarioImpuesto")

	private double movimientoDetalleValorMonetarioImpuesto;
	@Column(name="MovimientoDetalle_EstReg")

	private Integer movimientoDetalleEstReg;
	public Integer getIdMovimientoDetalle() {
		return idMovimientoDetalle;
	}
	public void setIdMovimientoDetalle(Integer idMovimientoDetalle) {
		this.idMovimientoDetalle = idMovimientoDetalle;
	}
	public MovimientoCabecera getIdMovimientoCabecera() {
		return idMovimientoCabecera;
	}
	public void setIdMovimientoCabecera(MovimientoCabecera idMovimientoCabecera) {
		this.idMovimientoCabecera = idMovimientoCabecera;
	}
	public Articulo getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(Articulo idArticulo) {
		this.idArticulo = idArticulo;
	}
	public double getMovimientoDetalle_Cantidad() {
		return movimientoDetalleCantidad;
	}
	public void setMovimientoDetalle_Cantidad(double movimientoDetalle_Cantidad) {
		this.movimientoDetalleCantidad = movimientoDetalle_Cantidad;
	}
	public double getMovimientoDetalle_ValorMonetarioTotal() {
		return movimientoDetalleValorMonetarioTotal;
	}
	public void setMovimientoDetalle_ValorMonetarioTotal(double movimientoDetalle_ValorMonetarioTotal) {
		this.movimientoDetalleValorMonetarioTotal = movimientoDetalle_ValorMonetarioTotal;
	}
	public double getMovimientoDetalle_ValorMonetarioImpuesto() {
		return movimientoDetalleValorMonetarioImpuesto;
	}
	public void setMovimientoDetalle_ValorMonetarioImpuesto(double movimientoDetalle_ValorMonetarioImpuesto) {
		this.movimientoDetalleValorMonetarioImpuesto = movimientoDetalle_ValorMonetarioImpuesto;
	}
	public Integer getMovimientoDetalle_EstReg() {
		return movimientoDetalleEstReg;
	}
	public void setMovimientoDetalle_EstReg(Integer movimientoDetalle_EstReg) {
		this.movimientoDetalleEstReg = movimientoDetalle_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMovimientoDetalle == null) ? 0 : idMovimientoDetalle.hashCode());
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
		MovimientoDetalle other = (MovimientoDetalle) obj;
		if (idMovimientoDetalle == null) {
			if (other.idMovimientoDetalle != null)
				return false;
		} else if (!idMovimientoDetalle.equals(other.idMovimientoDetalle))
			return false;
		return true;
	}
	public MovimientoDetalle(){}


}

