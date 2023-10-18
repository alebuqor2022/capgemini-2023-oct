package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarCafesPrepStmt {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		PreparedStatement stmt=null;
		String miquery="insert into cafes "
				+ "(cafe_id, cafe_nombre, proveedor_id, precio) "
				+ "values "
				+ "(?,?,?,?)";
		//(6,'CafeLatino',101,17.50)
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.prepareStatement(miquery);
			
			stmt.setInt(1,6);
			stmt.setString(2,"CafeLatino");
			stmt.setInt(3, 101);
			stmt.setFloat(4, 17.50f);
			int rpta= stmt.executeUpdate();
			if(rpta>0) {
				System.out.println("alta exitosa");
			}else {
				System.out.println("fracaso");
			}
			
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
