package ArraySort;

import java.util.Arrays;
import java.util.Random;

import com.mysql.fabric.xmlrpc.base.Array;

//用来测试冒泡排序的写法
public class MaoPaoSort {
	
	public static void main(String[] args) {
		
		int[] array = SuiJiArrayUtil.suiJi(6);
		
		System.out.println(Arrays.toString(array));
		
		//对上面的数组进行排序
		array = sort(array);
		
		System.out.println(Arrays.toString(array));
	}

	private static int[] sort(int[] array) {
		
		int length = array.length;
		
		for (int i = 0; i < length-1; i++) {
			
			for (int j = 0; j < length-i-1; j++) {
				
				if(array[j]>array[j+1]) {
					
					//交换
					swap(array,j,j+1);
					
				}
			}
		}
		
		return array;
		
	}

	private static void swap(int[] array, int j, int i) {
		
		int c = array[j];
		
		array[j] = array[i];
		
		array[i] = c;
	}

}
