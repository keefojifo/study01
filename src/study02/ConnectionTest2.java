package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {

	public static final String url;
	public static final String ID ;
	public static final String PWD;
	public static final String DRIVER_NAME;

	static {
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "BDI";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVER_NAME);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Connection con = null; // con을 초기화 해주는 이유 자바에서 자동으로 초기값을 null 로안 변경 해줌으로
		try {
			con = DriverManager.getConnection(url, ID, PWD);
			String sql = "select * from USER_INFO ";

			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해 주세요:");
			String id = "'%" + scan.nextLine() + "%'";
			sql += "where id like" + id + " ";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("id"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
