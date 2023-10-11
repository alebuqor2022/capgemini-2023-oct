package clase2_exceptions;

public class Conexion {
// 2da paso, definir un comportamiento que ARROJE la exception del 1er paso
	public void conectar(String nombreServer) throws ServerTimeOutException{
		boolean exito;
		exito=abrir(nombreServer, 80);
		if(!exito) {
			throw new ServerTimeOutException("no me puedo conectar",80);
		}
	}
	
	public boolean abrir(String nombreServer, int puertoAconectar) {
		return false;
	}
}
