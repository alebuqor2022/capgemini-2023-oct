package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearCafe {

	public static void main(String[] args) {
		boolean check=chequearDriver();
		
		if(check) {
			System.out.println("ok");
			conectar();
		}else {
			System.out.println("no ok");
		}

	}
	
	public static boolean chequearDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return true;
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		}	
		
	}

	public static void conectar() {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		String query="create table cafes(cafe_id int primary key not null, "
				+ "cafe_nombre varchar(32), "
				+ "proveedor_id int(5), "
				+ "precio float)";
		Statement stmt=null;
		
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
