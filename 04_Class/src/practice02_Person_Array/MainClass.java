package practice02_Person_Array;

public class MainClass {

	public static void ex01() {
		String[] nameList = {"정숙", "성철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Person[] arr = new Person[3]; //사람이 들어갈 집 3개를 만듦
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person(); // 사람 만들기
			arr[i].setName(nameList[i]);
			arr[i].setAge(ageList[i]);
			System.out.println("이름 : " + arr[i].getName() + ", 나이 : " + arr[i].getAge());
		}
		
	}
		
	
	public static void ex02() {
 	
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Person[] arr = new Person[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + arr[i].getName());
		}
	}
	public static void ex03() {
		
		String[] nameList = {"정숙", "상철", "미희"};
		int[] ageList = {20, 30, 40};
		
		Home home = new Home(3);
		
		
		for(int i = 0; i < home.getArr().length; i++) {
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println("이름 : " + home.getArr()[i].getName() + ", 나이 :" + home.getArr()[i].getAge());
		}
	 	
		
	}
	
	public static void main(String[] args) {
		ex03();

}
}