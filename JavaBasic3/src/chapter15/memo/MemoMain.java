package chapter15.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class MemoMain {
	public static void main(String[]args)throws Exception {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		MemoDAO dao = new MemoDAO();
		
		
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 메모목록조회 | 2. 메모등록 | 3. 프로그램종료");
			System.out.println("-----------------------------------------------");
			System.out.print("메뉴선택> ");
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				//CRUD : Create(insert), Read(select), Update, Delete (읽고 쓰고 수정하고 삭제하는 하나의 서비스 단위랄까?)
				// select One, select All (하나만 조회하는거, 전부 다 조회하는거)
				//insert, update, delete  (만들기, 수정하기, 삭제하기)
				//메모 데이터 조회
				List<MemoVO> list = dao.selectAll();
				for (MemoVO vo : list) {
					System.out.printf("%d \t %s \t %s \t %s \t %s\n", vo.getNo(), vo.getWriter(),vo.getContents(), vo.getRegisterDate(), vo.getModifyDate());
				}
				System.out.println("-----------------");
				System.out.println("1. 수정 | 2. 삭제");
				System.out.println("-----------------");
				System.out.println("선택> ");
				int m = Integer.parseInt(scanner.nextLine());
				switch (m) {
				case 1:
					System.out.print("수정할 번호를 입력하세요: ");
					int updateNo = Integer.parseInt(scanner.nextLine());
					System.out.print("수정할 내용을 입력하세요: ");
					String contents = scanner.nextLine();
					MemoVO vo = new MemoVO();
					vo.setNo(updateNo);
					vo.setContents(contents);
					dao.updateMemo(vo);
					break;
				case 2:
					System.out.print("삭제할 번호를 입력하세요: ");
					int deleteNo = Integer.parseInt(scanner.nextLine());
					dao.deleteMemo(deleteNo);
					break;
				}
				break;
			case 2:
				System.out.println("메모 내용을 입력하세요");
				String contents = scanner.nextLine();
				dao.insertMemo(new MemoVO("a001", contents));
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
		} scanner.close();

	}


}
