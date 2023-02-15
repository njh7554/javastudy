package c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class C {
	
	
	public static void ex01() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add("겨울");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		System.out.println("-----");
		
		for(String season : list) {
			System.out.println(season);
		}
	}
	
	public static void ex02() {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(90, "제시카");
		treeMap.put(40, "블랑카");
		treeMap.put(100, "남진혁");
		treeMap.put(10, "아놀드");
		
		System.out.println(treeMap);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(10, "b");
		map.put(101, "c");
		map.put(11, "d");
		
		System.out.println(map);
		
		
		
		
	}
	
	public static void ex03() {
		
		String name = "제시카";
		String phone = "010-1111-2222";
		int age = 20;
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("phone", phone);
		map.put("age", age + "");
		System.out.println(map);
	}
	
	
	public static void ex04() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("Sevice-Key" , "qwdwqedwqd");
		map.put("Content-Type", "application/xml");
	
		System.out.println(map.get("Sevice-Key"));
		
		ex05(map);
	}	
	public static void ex05(Map<String, Object> map) {
		
		Set<Entry<String, Object>> set = map.entrySet();
		for(Entry<String, Object> entry : set) {

		}
		
		for(Entry<String, Object> entry : map.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	}
		
	
	public static void main(String[] args) {
		ex04();
		
	}
}
