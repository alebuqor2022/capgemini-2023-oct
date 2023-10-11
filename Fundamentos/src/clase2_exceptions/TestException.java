package clase2_exceptions;

public class TestException {

	public static void main(String[] args) {
		Conexion c=new Conexion();
		// 3er paso Try/Catch el throws
		try {
			c.conectar("WinServer");
		} catch (ServerTimeOutException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage() + " al puerto " +e.getPuerto());
		}

	}

}
