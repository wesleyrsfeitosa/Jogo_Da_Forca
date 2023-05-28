package softblue.jogoforca;

/**
 * Representa uma exce��o gen�rica ocorrida no jogo
 */
public class JogoDaForcaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see Exception#Exception(String)
	 */
	public JogoDaForcaException(String message) {
		super(message);
	}
	
	/**
	 * @see Exception#Exception(String, Throwable)
	 */
	public JogoDaForcaException(String message, Throwable cause) {
		super(message, cause);
	}
}
