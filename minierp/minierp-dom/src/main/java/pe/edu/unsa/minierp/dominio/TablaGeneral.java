package pe.edu.unsa.minierp.dominio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TablaGeneral", schema = "minierp")

public class TablaGeneral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2103020449149515600L;
	/**
	 * 
	 */
	
	 @Id
	 @Column(name = "IdTablaGeneral")
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer idTablaGeneral;
	 @Column(name = "TablaGeneral_Categoria")
	 private String tablaGeneralCategoria;
	 @Column(name = "TablaGeneral_Descripcion")
	 private String tablaGeneralDescripcion;
	 @Column(name = "TablaGeneral_CodigoMostrable")
	 private String tablaGeneralCodigoMostrable;
	 @Column(name = "TablaGeneral_EstReg") 
	 private Integer  tablaGeneralEstReg;
  
	public Integer getIdTablaGeneral() {
		return idTablaGeneral;
	}
	public void setIdTablaGeneral(Integer idTablaGeneral3) {
		idTablaGeneral = idTablaGeneral3;
	}
	public String getTablaGeneral_Categoria() {
		return tablaGeneralCategoria;
	}
	public void setTablaGeneral_Categoria(String tablaGeneral_Categoria1) {
		tablaGeneralCategoria = tablaGeneral_Categoria1;
	}
	public String getTablaGeneral_Descripcion() {
		return tablaGeneralDescripcion;
	}
	public void setTablaGeneral_Descripcion(String tablaGeneral_Descripcion1) {
		tablaGeneralDescripcion = tablaGeneral_Descripcion1;
	}
	public String getTablaGeneral_CodigoMostrable() {
		return tablaGeneralCodigoMostrable;
	}
	public void setTablaGeneral_CodigoMostrable(String tablaGeneral_CodigoMostrable1) {
		tablaGeneralCodigoMostrable = tablaGeneral_CodigoMostrable1;
	}
	public Integer getTablaGeneral_EstReg() {
		return tablaGeneralEstReg;
	}
	public void setTablaGeneral_EstReg(Integer tablaGeneral_EstReg1) {
		this.tablaGeneralEstReg = tablaGeneral_EstReg1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTablaGeneral == null) ? 0 : idTablaGeneral.hashCode());
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
		TablaGeneral other = (TablaGeneral) obj;
		if (idTablaGeneral == null) {
			if (other.idTablaGeneral != null)
				return false;
		} else if (!idTablaGeneral.equals(other.idTablaGeneral))
			return false;
		return true;
	}
	public TablaGeneral(){}
    
    
    
}
