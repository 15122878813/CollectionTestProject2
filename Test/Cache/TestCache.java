package Cache;

public class TestCache {
	
	public static void main(String[] args) {
		
		LruCache lruCache = new LruCache(5);
		
		lruCache.put("1", 1);
		
		lruCache.put("2", 2);
		
		lruCache.put("3", 3);
		
		lruCache.put("4", 4);
		
		lruCache.put("5", 5);
		
		System.out.println(lruCache);
		
		lruCache.get("1");
		
		lruCache.put("6", 6);
		
		lruCache.put("7", 7);
		
		System.out.println(lruCache);
		
	}
}
