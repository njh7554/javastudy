package ex01_IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void ex01() {
		
		Scanner sc = new Scanner(System.in);
		DataOutputStream dis = null;

		
	
		try { 
		dis = new DataOutputStream(new FileOutputStream(new File("C:" + File.separator + "storage", "ex0.txt")));	
			System.out.println("문장을 입력하시오 >>> ");
			String sentence = sc.nextLine();
			
			dis.writeUTF(sentence);
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis != null) {
					dis.close();
					sc.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ex01();
		
		
	}

}
