package ex02_loop;

public class Ex05_nested_loop {

	public static void ex01() { 
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차" + hour + "교시수업");
			}
		
	}
		
		
		
	}
	
	public static void ex02() { // ******************************************//
		
		int day = 1;
		while(day <= 5) {
			
			int hour = 8;
			while(hour <= 8) {
			System.out.println(day + "일차" + hour + "교시수업");
			hour++;
		}
			day++;
			
		}
		
	}
	
	public static void ex03() { //연습
	
		
		for(int dan = 2; dan < 10; dan++){
			for(int n = 1; n < 10; n++) {
			System.out.println(dan + " x " + n + " = " + (dan * n));

			}		
			
		}
		
		
	}
	
	public static void ex04() { 
		for(int n = 1; n <= 9; n++) {
			for(int dan = 2; dan <= 9; dan++){
				System.out.print(dan + "x" + n + "=" + (dan * n) + "\t");
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		ex03();
		
		
	}

}
