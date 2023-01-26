package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
		
	}
	public void addCar() { // 자동차를 주차장에 넣는 메소드
		System.out.println("현재 등록된 차량 : " + idx + "대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		// System.out.println("차량번호와 모델명을 순서대로 입력하세요.");
		// Car car = new Car(sc.next(), sc.next());
		System.out.println("차량번호 >>> ");
		String carNo = sc.next();
		System.out.println("모델명 >>> ");
		String model = sc.next();
		Car car = new Car(carNo, model);
		cars[idx++] = car; // cars[0] = car; cars[1] = car; cars[2] = car; ...
		System.out.println("차량번호 " + carNo + " 차량이 등록 되었습니다.");
	}
	public void deleteCar() {
		
		
	}
	public void printAllCars() {
		
	}
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가 2.삭제 3. 전체 0.종료");
			
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addCar(); // addCar 호출
				break;
			case "2":
				deleteCar(); // deleteCar 호출
				break;
			case "3":
				printAllCars(); // printAllCars 호출
				break;
			case "0":
				return; // manage 메소드 종료
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
}
