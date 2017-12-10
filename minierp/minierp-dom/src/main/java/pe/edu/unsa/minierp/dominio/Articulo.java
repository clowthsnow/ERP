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

@Entity
@Table(name = "Articulo", schema = "minierp")
public class Articulo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2142419221675357207L;

	/**
	 * 
	 */
	@Id
	@Column(name="idArticulo")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idArticulo;
	@JoinColumn(name="idArticuloCategoria")

	@ManyToOne(fetch=FetchType.EAGER)
	private ArticuloCategoria idArticuloCategoria;
	@JoinColumn(name="FK_UnidadMedida")

	@ManyToOne(fetch=FetchType.EAGER)
	private TablaGeneral fKUnidadMedida;

	@Column(name="Articulo_Nombre")
	private String articuloNombre;

	@Column(name="Articulo_IGV")
	private Double articuloIGV;
	@Column(name="Articulo_EstReg")

	private Integer articuloEstReg;
	public Integer getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(Integer idArticulo1) {
		idArticulo = idArticulo1;
	}

	public TablaGeneral getFK_UnidadMedida() {
		return fKUnidadMedida;
	}
	public void setFK_UnidadMedida(TablaGeneral fK_UnidadMedida1) {
		fKUnidadMedida = fK_UnidadMedida1;
	}
	public String getArticulo_Nombre() {
		return articuloNombre;
	}
	public void setArticulo_Nombre(String articulo_Nombre1) {
		articuloNombre = articulo_Nombre1;
	}
	public double getArticulo_IGV() {
		return articuloIGV;
	}
	public void setArticulo_IGV(double articulo_IGV1) {
		articuloIGV = articulo_IGV1;
	}
	public Integer getArticulo_EstReg() {
		return articuloEstReg;
	} 
	public void setArticulo_EstReg(Integer articulo_EstReg1) {
		articuloEstReg = articulo_EstReg1;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idArticulo == null) ? 0 : idArticulo.hashCode());
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
		Articulo other = (Articulo) obj;
		if (idArticulo == null) {
			if (other.idArticulo != null)
				return false;
		} else if (!idArticulo.equals(other.idArticulo))
			return false;
		return true;
	}
	public Articulo(){}
	public ArticuloCategoria getIdArticuloCategoria() {
		return idArticuloCategoria;
	}
	public void setIdArticuloCategoria(ArticuloCategoria idArticuloCategoria) {
		this.idArticuloCategoria = idArticuloCategoria;
	}
}