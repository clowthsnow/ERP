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
@Table(name = "Usuario", schema = "minierp")
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6570608317983796724L;
	/**
	 * 
	 */
	final static Integer USUARIO_CARGO_VENDEDOR=1;
	final static Integer USUARIO_CARGO_ADMINISTRADOR=2;
	final static Integer USUARIO_CARGO_GERENTE=3;
	@Id
	@Column(name="IdUsuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Integer idUsuario;	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FK_UsuarioCargo")
	private TablaGeneral  fKUsuarioCargo;
	@Column(name="Usuario_Nombre")
	private  String usuarioNombre;
	@Column(name="Usuario_Apellido")
	private  String usuarioApellido;
	@Column(name="Usuario_DNI")
	private String usuarioDNI;
	@Column(name="Usuario_NombreCorto")
	private String usuarioNombreCorto;
	@Column(name="Usuario_Login")
	private String usuarioLogin;
	@Column(name="Usuario_Contrasena")
	private String usuarioContrasena;
	@Column(name="Usuario_Telefono")
	private String usuarioTelefono;
	@Column(name="Usuario_Email")
	private String usuarioEmail;
	@Column(name="Usuario_Direccion")
	
	private String usuarioDireccion;
	@Column(name="Usuario_EstReg")
	private Integer usuarioEstReg;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public TablaGeneral getfK_UsuarioCargo() {
		return fKUsuarioCargo;
	}
	public void setfK_UsuarioCargo(TablaGeneral fK_UsuarioCargo) {
		this.fKUsuarioCargo = fK_UsuarioCargo;
	}
	public String getUsuario_Nombre() {
		return usuarioNombre;
	}
	public void setUsuario_Nombre(String usuario_Nombre) {
		this.usuarioNombre = usuario_Nombre;
	}
	public String getUsuario_Apellido() {
		return usuarioApellido;
	}
	public void setUsuario_Apellido(String usuario_Apellido) {
		this.usuarioApellido = usuario_Apellido;
	}
	public String getUsuario_DNI() {
		return usuarioDNI;
	}
	public void setUsuario_DNI(String usuario_DNI) {
		this.usuarioDNI = usuario_DNI;
	}
	public String getUsuario_NombreCorto() {
		return usuarioNombreCorto;
	}
	public void setUsuario_NombreCorto(String usuario_NombreCorto) {
		this.usuarioNombreCorto = usuario_NombreCorto;
	}
	public String getUsuario_Login() {
		return usuarioLogin;
	}
	public void setUsuario_Login(String usuario_Login) {
		this.usuarioLogin = usuario_Login;
	}
	public String getUsuario_Contrasena() {
		return usuarioContrasena;
	}
	public void setUsuario_Contrasena(String usuario_Contrasena) {
		this.usuarioContrasena = usuario_Contrasena;
	}
	public String getUsuario_Telefono() {
		return usuarioTelefono;
	}
	public void setUsuario_Telefono(String usuario_Telefono) {
		this.usuarioTelefono = usuario_Telefono;
	}
	public String getUsuario_Email() {
		return usuarioEmail;
	}
	public void setUsuario_Email(String usuario_Email) {
		this.usuarioEmail = usuario_Email;
	}
	public String getUsuario_Direccion() {
		return usuarioDireccion;
	}
	public void setUsuario_Direccion(String usuario_Direccion) {
		this.usuarioDireccion = usuario_Direccion;
	}
	public Integer getUsuario_EstReg() {
		return usuarioEstReg;
	}
	public void setUsuario_EstReg(Integer usuario_EstReg) {
		this.usuarioEstReg = usuario_EstReg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		Usuario other = (Usuario) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}
	public Usuario(){}

}
