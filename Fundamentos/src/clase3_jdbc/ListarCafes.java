package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarCafes {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		Statement stmt=null;
		String miquery="Select * from cafes";
		
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(miquery);
			
			while(rs.next()) {
				String nombre=rs.getString("cafe_nombre");
				float precio=rs.getFloat(4); // arranca la cuenta desde 1
				System.out.println(nombre + " cuesta $ " + precio);
			}
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
