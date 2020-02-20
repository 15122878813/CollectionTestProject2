package Cache;

import java.util.Date;
import java.util.LinkedHashMap;

public class LruCache extends LinkedHashMap<String,Object>{
	
	private Integer MaxSize;
	
	public LruCache(Integer MaxSize) {
		
		//    lruCache的尺寸
		super(MaxSize, 
				//负载因子
				0.75F, 
				//是否开启热点(Least recently used)
				true);

		this.MaxSize = MaxSize;
	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String, Object> eldest) {
		//当返回为true时,将进行删除

		return size() > MaxSize;
	}
}
