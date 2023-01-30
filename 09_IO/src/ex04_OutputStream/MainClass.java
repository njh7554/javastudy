package ex04_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex01.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			// 출력단위
			// 1. int : 1개
			// 2. byte[] : 2개 이상
			
			int c = 'A';				
			String str = "pple";		
			byte[] b = str.getBytes();	// String을 byte로 변환할 때 getByte를 사용한다.
			
			// 출력
			fos.write(c);
			fos.write(b);
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void ex02() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex02.bin");
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			
			String str = "안녕하세요";
			
			//getBytes(Charset charset)
			byte[] b = str.getBytes(StandardCharsets.UTF_8);
			
			//getBytes(String charsetName
			//byte[]] b = str.getBytes("UTF-8");
			
			fos.write(b);
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		System.out.println(("ex02.bin 파일의 크기 : ") + file.length() + "바이트");
		
	}
		
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex03.bin");
		
		BufferedOutputStream bos = null;
		
		try {
			
			bos = new BufferedOutputStream(new FileOutputStream(file));
			
			bos.write("반갑습니다\n또만나요".getBytes("UTF-8"));
			// bos.close를 여기에 적으면 finally를 안 써도 됨 (실무에선 거의 여기다 씀)
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
			}catch(IOException e) {
					e.printStackTrace();
				}
			}
		System.out.println(("ex03.bin 파일의 크기 : ") + file.length() + "바이트");
		
	}
		
	public static void ex04() {
		
		// 변수를 그대로 출력하는 DataOutputStream
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex04.dat");
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			// 출력할 변수
			String name = "에밀리";
			int age = 30;
			double height = 180.5;
			boolean isAlive = true;
			
			// 출력(변수 타입에 따라서 메소드가 다름)
			dos.writeUTF(name); 		//9바이트
			dos.writeInt(age);			//4바이트
			dos.writeDouble(height);	//8바이트
			dos.writeBoolean(isAlive);	
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos != null) {
					dos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(("ex04.dat 파일의 크기 : ") + file.length() + "바이트");	
	}
	
	public static void ex05() {
		
		// 객체를 그대로 출력하는 ObjectOutputStream
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File(dir, "ex05.dat");
		
		ObjectOutputStream oos = null;
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			// 출력할 객체
			List<Person> people = Arrays.asList(
				new Person("에밀리", 30, 180.5, true),
				new Person("제시카", 35, 190.5, true)
			);
			
			//출력할 객체
			Person person = new Person();
			person.setName("제임스");
			person.setAge(40);
			person.setHeight(170.5);
			person.setAlive(false);
			
			
			oos.writeObject(people);
			oos.writeObject(person);
			  			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos != null) {
					oos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(("ex05.dat 파일의 크기 : ") + file.length() + "바이트");	
		
	}
	
	public static void main(String[] args) {
		ex05();
		
		
	}

}
