package HashMap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;


//相比较而言，hashtable的运行效率比hashmap的运行效率低
public class HashtableAndHashMap {
	public static void main(String[] args) throws Exception {
		
		hashmap();
		
		hashtable();
	}
	//hashtable不允许存入null值key和value,也不允许取
	private static void hashtable() {
		
		long t1 = System.currentTimeMillis();
		
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		
//		hashtable.put("1", null);
//		System.out.println(hashtable);
		
		for (int i = 0; i < 1000000000L; i++) {
			hashtable.put("1", "1");
		}
		long t2 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		//18167ms
		
	}

	private static void hashmap() {
		long t1 = System.currentTimeMillis();
		HashMap<Object, Object> hashMap = new HashMap<>();
		for (int i = 0; i < 1000000000L; i++) {
			hashMap.put("1", "1");
		}
		long t2 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		//使用了2570ms
	}
}
