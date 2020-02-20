package ArraySort;

import java.util.Random;

public class SuiJiArrayUtil {
	
	//静态工具方法,直接进行调用
	public static int[] suiJi(int a) {
		
		int len = new Random().nextInt(a) + 5;
		
		int[] array = new int[len];
		
		for (int i = 0; i < len; i++) {
			
			array[i] = new Random().nextInt(100);
		}
		
		return array;
	}
	
}
