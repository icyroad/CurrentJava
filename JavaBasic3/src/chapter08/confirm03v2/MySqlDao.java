package chapter08.confirm03v2;

public class MySqlDao implements DataAccessObject{

	@Override
	public String select() {
		return "MySql DB에서 선택";
	}

	@Override
	public String insert() {
		return "MySql DB에 삽입";
	}

	@Override
	public String update() {
		return "MySql DB를 수정";
	}

	@Override
	public String delete() {
		return "MySql DB에서 삭제";
	}

}
