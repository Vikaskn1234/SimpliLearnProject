package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Project {

	public static void main(String[] args) {
		String dburl="jdbc:mysql://localhost:3306/book_data";//connecting String
		String un="root";
		String pw="system";
		String querry="SELECT product_type,COUNT(*) as type_count FROM products1  GROUP BY product_type HAVING COUNT(*)>1";
		Connection con=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(dburl, un, pw);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(querry);
		while (rs.next()) { 
			String productType =rs.getString("product_type");
			int typeCount = rs.getInt("type_count"); 
			System.out.println("Product Type: " + productType +	",having similer product types: Count: " + typeCount);
			}
		con.close();
		rs.close();
		stmt.close();
		

		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
