package chapter08.confirm03v2;

public class OracleDao implements DataAccessObject{

	@Override
	public String select() {
		return "Oracle DB에서 선택";
	}

	@Override
	public String insert() {
		return "Oracle DB에 삽입";
	}

	@Override
	public String update() {
		return "Oracle DB를 수정";
	}

	@Override
	public String delete() {
		return "Oracle DB에서 삭제";
	}

}
