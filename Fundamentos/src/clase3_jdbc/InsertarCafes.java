package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarCafes {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		Statement stmt=null;
		
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			
			stmt.executeUpdate("insert into cafes (cafe_id, cafe_nombre, proveedor_id, precio) values (1,'Colombiano',101,9.99)");
			stmt.executeUpdate("insert into cafes (cafe_id, cafe_nombre, proveedor_id, precio) values (2,'Frances Tostado',150,19.99)");
			stmt.executeUpdate("insert into cafes (cafe_id, cafe_nombre, proveedor_id, precio) values (3,'Espresso',101,12)");
			stmt.executeUpdate("insert into cafes (cafe_id, cafe_nombre, proveedor_id, precio) values (4,'Colombiano Decaf',150,5.99)");
			stmt.executeUpdate("insert into cafes (cafe_id, cafe_nombre, proveedor_id, precio) values (5,'CafeLatte',101,7.50)");
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
