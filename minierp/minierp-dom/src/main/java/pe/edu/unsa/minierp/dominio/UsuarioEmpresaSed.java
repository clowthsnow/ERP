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
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario_Empresased", schema = "minierp")
@PrimaryKeyJoinColumns(value = { @PrimaryKeyJoinColumn(name="IdUsuario") ,	@PrimaryKeyJoinColumn(name="IdEmpresaSede")})

public class UsuarioEmpresaSed implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 528079619453749897L;
      
	   @Id
	   @Column(name="IdUsuario_EmpresaSed")
		@GeneratedValue(strategy=GenerationType.IDENTITY)

	  private Integer idUsuarioEmpresaSed;

		@ManyToOne(fetch=FetchType.EAGER,optional=false)
		@JoinColumn(name="IdUsuario")
	  private Usuario idUsuario;

		@ManyToOne(fetch=FetchType.EAGER,optional=false)
		@JoinColumn(name="IdEmpresaSede")
	  private EmpresaSede idEmpresaSede;

		@ManyToOne(fetch=FetchType.EAGER,optional=false)
		@JoinColumn(name="FK_MovimientoDocumento")
	  private TablaGeneral fKMovimientoDocumento;
	   @Column(name="Usuario_EmpresaSed_Numero")

	  private String usuarioEmpresaSedNumero;
	   @Column(name="Usuario_EmpresaSed_Serie")

	  private String usuarioEmpresaSedSerie;
	   @Column(name="Usuario_EmpresaSed_EstReg")

	   private Integer usuarioEmpresaSedEstReg;
	public Integer getIdUsuario_EmpresaSed() {
		return idUsuarioEmpresaSed;
	}
	public void setIdUsuario_EmpresaSed(Integer idUsuario_EmpresaSed) {
		this.idUsuarioEmpresaSed = idUsuario_EmpresaSed;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public EmpresaSede getIdEmpresaSede() {
		return idEmpresaSede;
	}
	public void setIdEmpresaSede(EmpresaSede idEmpresaSede) {
		this.idEmpresaSede = idEmpresaSede;
	}
	public TablaGeneral getfK_MovimientoDocumento() {
		return fKMovimientoDocumento;
	}
	public void setfK_MovimientoDocumento(TablaGeneral fK_MovimientoDocumento) {
		this.fKMovimientoDocumento = fK_MovimientoDocumento;
	}
	public String getUsuario_EmpresaSed_Numero() {
		return usuarioEmpresaSedNumero;
	}
	public void setUsuario_EmpresaSed_Numero(String usuario_EmpresaSed_Numero) {
		this.usuarioEmpresaSedNumero = usuario_EmpresaSed_Numero;
	}
	public String getUsuario_EmpresaSed_Serie() {
		return usuarioEmpresaSedSerie;
	}
	public void setUsuario_EmpresaSed_Serie(String usuario_EmpresaSed_Serie) {
		this.usuarioEmpresaSedSerie = usuario_EmpresaSed_Serie;
	}
	public Integer getUsuario_EmpresaSed_EstReg() {
		return usuarioEmpresaSedEstReg;
	}
	public void setUsuario_EmpresaSed_EstReg(Integer usuario_EmpresaSed_EstReg) {
		this.usuarioEmpresaSedEstReg = usuario_EmpresaSed_EstReg;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuarioEmpresaSed == null) ? 0 : idUsuarioEmpresaSed.hashCode());
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
		UsuarioEmpresaSed other = (UsuarioEmpresaSed) obj;
		if (idUsuarioEmpresaSed == null) {
			if (other.idUsuarioEmpresaSed != null)
				return false;
		} else if (!idUsuarioEmpresaSed.equals(other.idUsuarioEmpresaSed))
			return false;
		return true;
	}
	public UsuarioEmpresaSed() {
		// TODO Auto-generated constructor stub
	}
}
