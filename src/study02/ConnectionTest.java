package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id ="bdi";
		String pwd = "12345678";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,id,pwd);
			String sql = "select * from user_info";
			Statement stmt = con.createStatement(); //쿼리 편집기
			ResultSet rs = stmt.executeQuery(sql); //실행 명령
			while(rs.next()) {// 
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pwd"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
