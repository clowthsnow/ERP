package pe.edu.unsa.minierp.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6608070823083230215L;

	protected static final Logger LOGGER = LogManager.getLogger(BaseException.class);

	private String codigo;	

	public BaseException(String codigo, String message) {
		super(message);
		this.codigo = codigo;
	}

	public BaseException(String codigo, Throwable cause) {
		super(cause);
		this.codigo = codigo;
	}
	
	public BaseException(String codigo, String message, Throwable cause) {
		super(message, cause);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	protected abstract class CODIGO {
		protected static final String DEMO = "XXXX";
		protected static final String INELEGIBLE_BASE = "0001"; // generico
		protected static final String NO_CLIENTE = "0002"; // ir a OAO
		protected static final String PEP = "0003"; // generico
		protected static final String INELEGIBLE_SERV = "0004"; // generico
		protected static final String SIN_CONTRATOS = "0005"; // sin promocion
	}
	
}
