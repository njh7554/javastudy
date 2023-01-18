package ex00_example;

public class ex01_all {

	public static void ex01() {
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	public static void ex02() {
	
		int[] scores = new int[5];
		
		scores[0] = 100;
		scores[1] = 70;
		scores[2] = 40;
		scores[3] = 20;
		scores[4] = 10;
		
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println(total);
		System.out.println((double)total / scores.length);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void ex03() { 
		
		
	}
	public static void main(String[] args) {
	ex02();

	}
}
