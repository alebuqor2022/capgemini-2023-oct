package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerCafesPrepStmt {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		PreparedStatement stmt=null;
		String miquery="Select * from cafes where precio > ?";
 
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.prepareStatement(miquery);
			
			stmt.setFloat(1, 10f);
			
			ResultSet rs=stmt.executeQuery();
			
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
