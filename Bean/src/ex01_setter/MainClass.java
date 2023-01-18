package ex01_setter;

public class MainClass {

	public static void main(String[] args) {

		// User 객체(Bean) 생성
		User user = new User();
		
		// setter를 이용해 필드값 저장
		user.setId("admin");
		user.setPw("123456");
		
		System.out.println(user);
	}

}
