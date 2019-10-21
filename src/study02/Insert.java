package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		
		Connection con = null;
		try {
			con =DriverManager.getConnection(ConnectionTest2.url,ConnectionTest2.ID,ConnectionTest2.PWD);
			String sql ="insert into user_info(id,pwd,name,age,etc) ";//끝에 무조건 스페이스를 붙이자
			Scanner scan = new Scanner(System.in);
			System.out.println("당신의 정보를 \",\"를 기준으로 입력해 주세요:");
			String info = scan.nextLine();
			String[] infos = info.split(",");
			
			sql += "values (";
			for (int i = 0; i < infos.length; i++) {
				sql +="'" + infos[i] + "',";
			}
			sql =sql.substring(0,sql.length()-1);
			sql += ")";
			
			
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql); // 행이 늘어났는지 확인해야되기 때문에 executeUpdate 를 사용한다.
			//jdbc 를 사용해서 쿼리를 보내면 자통 commit 된다. 
			
			System.out.println("인서트된 갯수:"  + result);
			
	
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
