package ArraySort;

import java.util.Arrays;

//以下将进行选择排序
//降序(左大右小):
//选择最小的数,依次放在最右边
public class SelectSort {

	public static void main(String[] args) {
		
		int[] array = SuiJiArrayUtil.suiJi(6);
		
		//产生随机无序数组
		System.out.println(Arrays.toString(array));
		
		//以下将进行选择排序
		array = sort(array);
		
		System.out.println(Arrays.toString(array));
	}

	private static int[] sort(int[] array) {
		
		int length = array.length;
		
		for (int i = 0; i < length; i++) {
			
				int index = i;
				
			for (int j = i; j < length; j++) {
				
				if(array[j] > array[index]) {
					
					index = j ;
				}
			}
			
			//选择应该交换的index下标
			swap(array,index,i);
			
		}
		
		return array;
	}

	private static void swap(int[] array, int i, int index) {
		
		int c = array[i];
		
		array[i] = array[index];
		
		array[index] = c;
		
	}
}
