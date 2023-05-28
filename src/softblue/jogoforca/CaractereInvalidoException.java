package softblue.jogoforca;

/**
 * atualizando versao
 * Exce�ao que indica que o caractere digitado � inv�lido por algu motivo
 */
public class CaractereInvalidoException extends JogoDaForcaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see JogoDaForcaException#JogoDaForcaException(String)
	 */
	public CaractereInvalidoException(String message) {
		super(message);
	}
}
