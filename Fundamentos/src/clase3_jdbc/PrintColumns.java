package clase3_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintColumns {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/capgemini_asturias";
		Connection con=null;
		Statement stmt=null;
		String miquery="Select * from cafes";
		
		try {
			con=DriverManager.getConnection(url,"root","1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(miquery);
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int nroCols=rsmd.getColumnCount();
			
			for(int i=1;i<=nroCols;i++) {
				System.out.print(rsmd.getColumnClassName(i) + " ");
				System.out.println(rsmd.getColumnName(i));
			}
			
			
			
			con.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
