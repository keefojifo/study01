package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Excute {
	static Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);

	void sop(Object obj) {
		System.out.println(obj);
	}

	void insert() {
		sop("id를 입력해주세요");
		String id = "'" + scan.nextLine() + "'";
		sop("pwd를 입력해주세요");
		String pwd = "'" + scan.nextLine() + "'";
		sop("name를 입력해주세요");
		String name = "'" + scan.nextLine() + "'";
		sop("age를 입력해주세요");
		String age = "'" + scan.nextLine() + "'";
		sop("etc를 입력해주세요");
		String etc = "'" + scan.nextLine() + "'";

		String insertsql = "insert into user_info(id,pwd,name,age,etc) ";// 끝에 무조건 스페이스를 붙이자
		insertsql += "values(" + id + "," + pwd + "," + name + "," + age + "," + etc + ")";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(insertsql);
			System.out.println("인서트된 갯수:" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void delete() {
		sop("지우고 싶은 열의 아이디를 입력 하여 주세요.");
		String id = "'" + scan.nextLine() + "'";
		String deletesql = "delete from user_info where id =" + id; // 끝에 무조건 스페이스를 붙이자

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(deletesql);
			System.out.println("삭제된 갯수:" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void update() { // UPDATE USER_INFO set age =34 where id = 'red';
		sop("변경하고 싶은 나이를 입력 하여 주세요.");
		String age = "'" + scan.nextLine() + "'";
		sop("어떤 아이디의 나이를 변경갈까요?.");
		String id = "'" + scan.nextLine() + "'";

		String updatesql = "UPDATE user_info set age = ";
		updatesql += age + " ";
		updatesql += "where id = " + id;

		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(updatesql);
			System.out.println("업데이트 갯수:" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void select() {
		sop("검색하고 싶은 열의 아이디를 입력 하여 주세요.");
		String id = "'" + scan.nextLine() + "'";
		String selectsql = "select * from user_info where id = " + id;
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(selectsql);

			List<Map<String, String>> userList = new ArrayList<Map<String, String>>();

			while (result.next()) {
				System.out.println(result.getString("id"));
				Map<String, String> userMap = new HashMap<String, String>();
				userMap.put("id", result.getNString("id"));
				userMap.put("pwd", result.getNString("pwd"));
				userMap.put("name", result.getNString("name"));
				userMap.put("age", result.getNString("age"));
				userMap.put("etc", result.getNString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void initResponse() {
		String res = "";
		while (!res.equals("q")) {
			System.out.println("원하는 서비스 번호를 입력하세요");
			System.out.println("1.유저 생성");
			System.out.println("2.유저 삭제");
			System.out.println("3.유저 수정");
			System.out.println("4.유저 조회");
			System.out.println("q.종료");
			res = scan.nextLine();
			if ("1".equals(res)) {

			} else if ("2".equals(res)) {

			} else if ("3".equals(res)) {

			} else if ("4".equals(res)) {

			} else if ("q".equals(res)) {
				System.out.println("시스템이 종료됩니다.");
			}else {
				System.out.println("입력하신 서비스 번호가 없습니다.");
			}
				
			System.out.println("니가 선택한 명령어" + res);
		}
	}

	public static void main(String[] args) {
		Excute ex = new Excute();

		ex.initResponse();
		ex.insert();
		ex.delete();
		ex.update();
		ex.select();

	}

}
