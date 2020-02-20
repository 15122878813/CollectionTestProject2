package HashMap;

import java.util.HashMap;

import org.junit.Test;

//用于测试map中的key与value是否可以为null值
public class NullKeyAndValue {


	@Test
	public void keyIsNull() {

		HashMap<Object, Object> hashMap = new HashMap<>();

		hashMap.put(null, "恭喜张强高薪就业");

		System.out.println(hashMap);

		Object object = hashMap.get(null);

		System.out.println(object);
	}

	@Test
	public void valueIsNull() {

		HashMap<Object, Object> hashMap = new HashMap<>();

		hashMap.put("key", null);

		System.out.println(hashMap);
	}
	//hashmap还有containskey和containsvalue方法
	@Test
	public void KVIsNull(){
		
		HashMap<Object, Object> hashMap = new HashMap<>();

		hashMap.put(null, null);

		System.out.println(hashMap);
		
//		boolean containsKey = hashMap.containsKey(null);
//		System.out.println(containsKey);
		
//		boolean containsValue = hashMap.containsValue(null);
//		System.out.println(containsValue);
	}
}
