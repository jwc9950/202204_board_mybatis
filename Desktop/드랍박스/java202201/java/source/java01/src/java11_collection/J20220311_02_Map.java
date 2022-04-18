package java11_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class J20220311_02_Map {

	public static void main(String[] args) {
		// 맵
		//순서가없다(index가없다)
		//key를 이용해서 value를 저장
		//key는 중복허용안되고 value는 중복 허용
		
		//사이다, 1000
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("사이다", 1000);
//		map.put("콜라", 1500);
//		System.out.println(map);
//		System.out.println(map.get("사이다"));
		
		//실습)숫자영어단어사전
		//1: one, 2: two ....
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "one");
//		map.put(2, "two");
//		map.put(3, "three");
//		map.put(4, "four");
//		map.put(5, "five");
//		System.out.println(map);
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.print("숫자는?");
//			int no = sc.nextInt();
//			if (no==-1) break;
//			System.out.println(map.get(no));	
//		}
		
		//member객체를 값으로 map넣는다면
		//key:userid, value:Member
		Map<String, Member> map = new HashMap<>();
		map.put("java", new Member("java", "1111"));
		map.put("hong", new Member("hong", "2222"));
		map.put("park", new Member("park", "3333"));
		
		System.out.println(map.get("hong"));
		System.out.println(map.get("hong").getPasswd());
		
		//출력
		System.out.println("-----------------");
		Set<String> kset = map.keySet();
		for(String key:kset) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("-----------------");
		//반복자(iterator)이용
		Iterator<String> it =  kset.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":" + map.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
