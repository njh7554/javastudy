package ex03_singleton;
	
	// singleton 
	// 1. 객체를 하나만 만들 수 있다 (user를 하나만 생성 가능)
	// 2. 메인 메소드에 여러 객체를 만들어도 참조값은 같다.(user1 == user2 true)

public class User {

	// static 필드 (미리 User를 만들어 둔다.)
	private static User user = new User();
	
	// private 생성자 (외부에서는 생성자를 호출할 수 없다.)	
	private User() {
		
	}
	
	// static 메소드 (static 필드를 사용하기 위해서)
	// user 필드를 외부에서 사용할 수 있도록 반환하는 일종의 Getter
	public static User getInstance() {
		return user;
	}
	
}
