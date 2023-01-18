package ex02_constructer;

public class User {

	private String id;
	private String pw;
	
	public User(String id, String pw) {
		super();           // Object를 부르는 것
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
}
