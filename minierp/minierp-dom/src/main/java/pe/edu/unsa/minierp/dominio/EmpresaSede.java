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
@Table(name = "EmpresaSede", schema = "minierp")
public class EmpresaSede implements Serializable {


	@Id
	@Column(name ="IdEmpresaSede")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idEmpresaSede;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IdEmpresa")
	private Empresa idEmpresa;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_EmpresaSedeClasificacion")
	private TablaGeneral fKEmpresaSedeClasificacion;

	public EmpresaSede() {
		// TODO Auto-generated constructor stub
	}
	@Column(name ="EmpresaSede_Nombre")
	private String empresaSedeNombre;
	@Column(name ="EmpresaSede_Direccion")
	private String empresaSedeDireccion;
	@Column(name ="EmpresaSede_Documento")
	private String empresaSedeDocumento;
	@Column(name ="EmpresaSede_Telefono")
	private String empresaSedeTelefono;
	@Column(name ="EmpresaSede_EstReg")
	private Integer  empresaSedeEstReg;
	public Integer getIdEmpresaSede() {
		return idEmpresaSede;
	}
	public void setIdEmpresaSede(Integer idEmpresaSede) {
		this.idEmpresaSede = idEmpresaSede;
	}
	public Empresa getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public TablaGeneral getfK_EmpresaSedeClasificacion() {
		return fKEmpresaSedeClasificacion;
	}
	public void setfK_EmpresaSedeClasificacion(TablaGeneral fK_EmpresaSedeClasificacion) {
		this.fKEmpresaSedeClasificacion = fK_EmpresaSedeClasificacion;
	}
	public String getEmpresaSede_Nombre() {
		return empresaSedeNombre;
	}
	public void setEmpresaSede_Nombre(String empresaSede_Nombre) {
		this.empresaSedeNombre = empresaSede_Nombre;
	}
	public String getEmpresaSede_Direccion() {
		return empresaSedeDireccion;
	}
	public void setEmpresaSede_Direccion(String empresaSede_Direccion) {
		this.empresaSedeDireccion = empresaSede_Direccion;
	}
	public String getEmpresaSede_Documento() {
		return empresaSedeDocumento;
	}
	public void setEmpresaSede_Documento(String empresaSede_Documento) {
		this.empresaSedeDocumento = empresaSede_Documento;
	}
	public String getEmpresaSede_Telefono() {
		return empresaSedeTelefono;
	}
	public void setEmpresaSede_Telefono(String empresaSede_Telefono) {
		this.empresaSedeTelefono = empresaSede_Telefono;
	}
	public Integer getEmpresaSede_EstReg() {
		return empresaSedeEstReg;
	}
	public void setEmpresaSede_EstReg(Integer empresaSede_EstReg) {
		this.empresaSedeEstReg = empresaSede_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEmpresaSede == null) ? 0 : idEmpresaSede.hashCode());
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
		EmpresaSede other = (EmpresaSede) obj;
		if (idEmpresaSede == null) {
			if (other.idEmpresaSede != null)
				return false;
		} else if (!idEmpresaSede.equals(other.idEmpresaSede))
			return false;
		return true;
	}
}

