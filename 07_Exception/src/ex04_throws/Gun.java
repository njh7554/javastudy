package ex04_throws;


public class Gun {

	private int bullet;
	private static final int MAX_BULLET = 30;
	
	//총알 넣기
	public void reload(int bullet) throws RuntimeException {
		
		if(this.bullet + bullet > MAX_BULLET) {
		throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
	}
		
		
	
	// 총 쏘기
	
	public void shoot(int bullet) {
		if(this.bullet - bullet < 0) {
			throw new RuntimeException("총알 부족");
			
		}
		this.bullet -= bullet;
	}



	public int getBullet() {
		return bullet;
	}



	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
}
	/*private int bullet;
	private static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) throws RuntimeException { // reload 메소드를 호출하는 곳으로 예외를 던지겠다.
		if(this.bullet + bullet > MAX_BULLET) {
			throw new RuntimeException("장전 불가능");
			
		}
		this.bullet += bullet;
	}
	
	// 총 쏘기
	public void shoot(int bullet) throws RuntimeException {
		if(bullet == 0) {
				throw new RuntimeException("총알 부족");
			
		}
		bullet--;
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
}
	*/

	
	