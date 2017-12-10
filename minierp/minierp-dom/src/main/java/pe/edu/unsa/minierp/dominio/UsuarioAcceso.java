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
@Table(name = "Usuario_Acceso", schema = "minierp")
public class UsuarioAcceso implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3874470627999942937L;
	@Id
	@Column(name="")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idUsuarioAcceso;
	  @ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="IdUsuario")	
	  private Usuario idUsuario;
	  @ManyToOne(fetch=FetchType.EAGER)
			@JoinColumn(name="FK_acceso")
	  private TablaGeneral fKAcceso;
	@Column(name="Usuario_Acceso_EstReg")
	private Integer usuarioAccesoEstReg;
	public Integer getIdUsuario_Acceso() {
		return idUsuarioAcceso;
	}
	public void setIdUsuario_Acceso(Integer idUsuario_Acceso) {
		this.idUsuarioAcceso = idUsuario_Acceso;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public TablaGeneral getfK_Acceso() {
		return fKAcceso;
	}
	public void setfK_acceso(TablaGeneral fK_acceso) {
		this.fKAcceso = fK_acceso;
	}
	public Integer getUsuario_Acceso_EstReg() {
		return usuarioAccesoEstReg;
	}
	public void setUsuario_Acceso_EstReg(Integer usuario_Acceso_EstReg) {
		this.usuarioAccesoEstReg = usuario_Acceso_EstReg;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuarioAcceso == null) ? 0 : idUsuarioAcceso.hashCode());
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
		UsuarioAcceso other = (UsuarioAcceso) obj;
		if (idUsuarioAcceso == null) {
			if (other.idUsuarioAcceso != null)
				return false;
		} else if (!idUsuarioAcceso.equals(other.idUsuarioAcceso))
			return false;
		return true;
	}
	public UsuarioAcceso(){}
}
