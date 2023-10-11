package clase2_exceptions;

// 1er paso --> generar la exception personalizada
public class ServerTimeOutException extends Exception{
	private int puerto;
	
	public ServerTimeOutException(String message, int puerto) {
		super(message);
		this.puerto=puerto;
	}

	public int getPuerto() {
		return puerto;
	}

}
