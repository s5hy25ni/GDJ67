import java.util.UUID;

public class UUID_Make_Main {

	public static void main(String[] args) {
		// 랜덤 숫자 코드 만들어 내는 객체
		// 중복되지 않은 이름을 만들어 낼 때
		UUID id = UUID.randomUUID();
		System.out.println(id.toString());
	}

}
