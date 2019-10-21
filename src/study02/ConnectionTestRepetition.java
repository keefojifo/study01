package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTestRepetition {

	public static void main(String[] args) {
		
		//connection, Statement, ResultSet
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con  = DriverManager.getConnection(url,id,pwd);//접속 버튼
			String sql = "select * from user_info";
			Statement stat = con.createStatement(); //쿼리 편집기 
			ResultSet rs = stat.executeQuery(sql); // 쿼리 실행
			
			List<Map<String,String>> userList = new ArrayList<Map<String,String>>();
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id",rs.getNString("id"));
				userMap.put("pwd",rs.getNString("pwd"));
				userMap.put("name",rs.getNString("name"));
				userMap.put("age",rs.getNString("age"));
				userMap.put("etc",rs.getNString("etc"));
				userList.add(userMap);
				}
			System.out.println(userList);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
