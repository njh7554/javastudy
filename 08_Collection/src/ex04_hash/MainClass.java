package ex04_hash;

import java.util.HashSet;
import java.util.Set;

public class MainClass {		// equals가 있어야 객체 비교가 가능하다.

	public static void main(String[] args) {

		User user1 = new User("admin", "123456");
		User user2 = new User("admin", "123456");
		
		Set<User> set = new HashSet<User>();
		set.add(user1);
		set.add(user2);
		
		System.out.println(set);
		
	}

}
