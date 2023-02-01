package ex02_Network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
	public static void ex01() {
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
	
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = new File("C:" + File.separator + "storage", "다운로드문서.txt");
	
		try { 
		
		url = new URL(apiURL);
		con = (HttpURLConnection)url.openConnection();
		
		int responseCode = con.getResponseCode();
		if(responseCode == HttpURLConnection.HTTP_OK) {
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
		}else {
			reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
		}
		
		StringBuilder sb = new StringBuilder();
		char[] cbuf = new char[2];
		int readCount = 0;
		
		while((readCount = reader.read(cbuf)) != -1) {
			sb.append(cbuf, 0, readCount);
		}
		
		writer = new BufferedWriter(new FileWriter(file));
		writer.write(sb.toString());
		
		writer.close();
		reader.close();
		con.disconnect();
		
		System.out.println("다운로드 완료");
		
	}catch(MalformedURLException e) {
		System.out.println("apiURL 주소 오류");
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	
	public static void ex02() {
		String apiURL = "https://www.kma.go.kr/XML/weather/sfc_web_map.xml";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = new File("C:" + File.separator + "storage", "sfc_web_map.xml");
		
		try {
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[2];
			int readCount = 0;
			
			while((readCount = reader.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCount);
			}
			
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			
			
			reader.close();
			writer.close();
			con.disconnect();
		
			System.out.println("다운 완료");
		}catch(MalformedURLException e) {
			System.out.println("오류");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ex02();
	}
}


