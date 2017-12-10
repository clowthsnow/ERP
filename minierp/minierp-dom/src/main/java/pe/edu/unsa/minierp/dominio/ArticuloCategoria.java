package pe.edu.unsa.minierp.dominio;

import java.io.Serializable;
import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "ArticuloCategoria", schema = "minierp")
public class ArticuloCategoria implements Serializable{
	public ArticuloCategoria(){};
	@Id
	@Column(name ="idArticuloCategoria")
	
	private Integer idArticuloCategoria;
	  
	  @ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idArticuloCategoriaSubCategoriaDe	")
	  @JsonBackReference
	  private ArticuloCategoria idArticuloCategoriaSubCategoriaDe;
		@Column(name ="articuloCategoria_Descripcion")

	  private String articuloCategoriaDescripcion;
		@Column(name ="articuloCategoria_Terminal")

		private Boolean articuloCategoriaTerminal;
		@Column(name ="articuloCategoria_EstReg")

		private Integer articuloCategoriaEstReg;
		public Integer getIdArticuloCategoria() {
			return idArticuloCategoria;
		}
		public void setIdArticuloCategoria(Integer idArticuloCategoria) {
			this.idArticuloCategoria = idArticuloCategoria;
		}
		public ArticuloCategoria getIdArticuloCategoriaSubCategoriaDe() {
			return idArticuloCategoriaSubCategoriaDe;
		}
		public void setIdArticuloCategoriaSubCategoriaDe(ArticuloCategoria idArticuloCategoriaSubCategoriaDe) {
			this.idArticuloCategoriaSubCategoriaDe = idArticuloCategoriaSubCategoriaDe;
		}
		public String getArticuloCategoriaDescripcion() {
			return articuloCategoriaDescripcion;
		}
		public void setArticuloCategoriaDescripcion(String articuloCategoriaDescripcion) {
			this.articuloCategoriaDescripcion = articuloCategoriaDescripcion;
		}
		public Boolean getArticuloCategoriaTerminal() {
			return articuloCategoriaTerminal;
		}
		public void setArticuloCategoriaTerminal(Boolean articuloCategoriaTerminal) {
			this.articuloCategoriaTerminal = articuloCategoriaTerminal;
		}
		public Integer getArticuloCategoriaEstReg() {
			return articuloCategoriaEstReg;
		}
		public void setArticuloCategoriaEstReg(Integer articuloCategoriaEstReg) {
			this.articuloCategoriaEstReg = articuloCategoriaEstReg;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((idArticuloCategoriaSubCategoriaDe == null) ? 0 : idArticuloCategoriaSubCategoriaDe.hashCode());
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
			ArticuloCategoria other = (ArticuloCategoria) obj;
			if (idArticuloCategoriaSubCategoriaDe == null) {
				if (other.idArticuloCategoriaSubCategoriaDe != null)
					return false;
			} else if (!idArticuloCategoriaSubCategoriaDe.equals(other.idArticuloCategoriaSubCategoriaDe))
				return false;
			return true;
		}
		 @OneToMany(mappedBy="idArticuloCategoriaSubCategoriaDe",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
			@JsonManagedReference
			private List <ArticuloCategoria > subcategorias= new ArrayList<ArticuloCategoria>();

}