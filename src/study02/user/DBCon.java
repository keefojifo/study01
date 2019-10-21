package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String url; //외부에서 접근 못하도록 private
	private static final String ID ;
	private static final String PWD;
	private static final String DRIVER_NAME;

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
	private static Connection con;
	// throws 던지다
	public static Connection getCon() {
		if(con==null) {
			try {
				con =DriverManager.getConnection(url,ID,PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return con;
	}
}
