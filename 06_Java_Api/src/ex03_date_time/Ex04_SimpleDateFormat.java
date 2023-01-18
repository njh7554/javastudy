package ex03_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04_SimpleDateFormat {

	/*
		 	형식
		 	1. yy : 23 		(년도)
		 	2. yyyy : 2023 
		 	3. M    : 1		(월)
		 	4. MM   : 01	(월)
		 	5. MMM  : 1월
		 	6. d 	: 17	(1~31일)
		 	7. dd 	: 17	(01~31)
		 	8. E	: 화 	(요일)
		 	9. a	: 오후,오전
		 	10. h	: 2 	(1~12시)
		 	11. hh 	: 02	(01~12)
		 	12. H	: 14	(0~23시)
		 	13. HH	: 14	(00~23)
		 	14. m	: 8		(0~59분)
		 	15. mm	: 08	(00~59)
		 	16. s	: 30	(0~59)
		 	17. ss	: 30	(01~59)
	 */ 
	
	public static void ex01() {
		
		
	}
	
	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		String strNow = sdf.format(now);
		System.out.println(strNow);
			
	}

}
