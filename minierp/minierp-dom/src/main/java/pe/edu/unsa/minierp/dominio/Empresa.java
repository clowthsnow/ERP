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
@Table(name = "Empresa", schema = "minierp")
public class Empresa implements Serializable {

	/**
	 * 
	 */
	public Empresa(){}
	@Id
	@Column(name="IdEmpresa")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idEmpresa;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_TipoDocumentoIdentificacion")
	private TablaGeneral fKTipoDocumentoIdentificacion;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_CategorizacionEmpresa")
	private TablaGeneral fKCategorizacionEmpresa;
	@Column(name="Empresa_Nombre")
	private String empresaNombre;
	@Column(name="Empresa_Documento")
	private String empresaDocumento;
	@Column(name="Empresa_Telefono")
	private String empresaTelefono;
	@Column(name="Empresa_PersonaJuridica")
	private Boolean empresaPersonaJuridica;
	@Column(name="Empresa_EstReg")
	private Integer empresaEstReg;
	public Integer getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public TablaGeneral getfK_TipoDocumentoIdentificacion() {
		return fKTipoDocumentoIdentificacion;
	}
	public void setfK_TipoDocumentoIdentificacion(TablaGeneral fK_TipoDocumentoIdentificacion) {
		this.fKTipoDocumentoIdentificacion = fK_TipoDocumentoIdentificacion;
	}
	public TablaGeneral getfK_CategorizacionEmpresa() {
		return fKCategorizacionEmpresa;
	}
	public void setfK_CategorizacionEmpresa(TablaGeneral fK_CategorizacionEmpresa) {
		this.fKCategorizacionEmpresa = fK_CategorizacionEmpresa;
	}
	public String getEmpresa_Nombre() {
		return empresaNombre;
	}
	public void setEmpresa_Nombre(String empresa_Nombre) {
		this.empresaNombre = empresa_Nombre;
	}
	public String getEmpresa_Documento() {
		return empresaDocumento;
	}
	public void setEmpresa_Documento(String empresa_Documento) {
		this.empresaDocumento = empresa_Documento;
	}
	public String getEmpresa_Telefono() {
		return empresaTelefono;
	}
	public void setEmpresa_Telefono(String empresa_Telefono) {
		this.empresaTelefono = empresa_Telefono;
	}
	public boolean isEmpresa_PersonaJuridica() {
		return empresaPersonaJuridica;
	}
	public void setEmpresa_PersonaJuridica(boolean empresa_PersonaJuridica) {
		this.empresaPersonaJuridica = empresa_PersonaJuridica;
	}
	public Integer getEmpresa_EstReg() {
		return empresaEstReg;
	}
	public void setEmpresa_EstReg(Integer empresa_EstReg) {
		this.empresaEstReg = empresa_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresa == null) ? 0 : idEmpresa.hashCode());
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
		Empresa other = (Empresa) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null)
				return false;
		} else if (!idEmpresa.equals(other.idEmpresa))
			return false;
		return true;
	}



}