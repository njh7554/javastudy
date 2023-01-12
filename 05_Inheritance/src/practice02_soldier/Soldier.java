package practice02_soldier;

public class Soldier { // 솔져가 총을 가지고 있다는 개념.

	// 필드
	private Gun gun;  // 초기값은 null
	
	// 생성자
	public Soldier() {
		gun = new Gun();
		
	}
	
	// 메소드
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	public void shoot() {
		gun.shoot();
	}
	
}
