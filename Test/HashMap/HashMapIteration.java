package HashMap;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//hashmap的迭代
public class HashMapIteration {
	
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		map.put("e", "5");

		//1.entrySet的迭代
//		method1(map);

		//2.迭代器进行迭代
//		method2(map);

		//3.直接迭代,但是只能够迭代value
//		method3(map);
	}

	private static void method3(HashMap<String, Object> map) {

		Collection<Object> values = map.values();

		Iterator<Object> iterator = values.iterator();

		while(iterator.hasNext()){

			System.out.println(iterator.next());

		}
	}

	private static void method2(HashMap<String, Object> map) {

		Iterator<String> iterator = map.keySet().iterator();

		while (iterator.hasNext()){

			String key = iterator.next();

			System.out.println("key" + key);

			System.out.println("value" + map.get(key));
		}

	}

	private static void method1(HashMap<Object, Object> map) {

		Set<Entry<Object,Object>> set = map.entrySet();

		for(Entry<Object,Object> entry : set){

			System.out.println(entry);
		}
	}

}
