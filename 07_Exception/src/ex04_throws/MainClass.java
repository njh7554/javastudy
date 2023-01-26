package ex04_throws;

public class MainClass {

	public static void main(String[] args) {

		Gun gun = new Gun();
		try {
			gun.reload(30);
			for(int i = 0; i < 31; i++);
			gun.shoot(30);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
						
	}
}
		
		
		
	/* 
	 Gun gun = new Gun();
	
	try {
		gun.reload(10);
		for(int n = 0; n < 11; n++);// 리로드 메소드 호출
		gun.shoot(0);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		}
}
	 */
