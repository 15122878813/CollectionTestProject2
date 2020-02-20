package ArraySort;

import java.util.Arrays;

//快速排序
//递归
//记忆 revice
public class QuickSort {

	public static void main(String[] args) {

		int[] array = SuiJiArrayUtil.suiJi(6);

		System.out.println(Arrays.toString(array));

		quick_sort(array,0,array.length-1);

		System.out.println(Arrays.toString(array));

	}

	//快速排序
	static void quick_sort(int array[], int low, int high){
		
		int i = low;
		
		int j = high;
		
		if(i < j) {
			
			int temp = array[low]; 
			
			while(i < j) {
				
				while(i < j && array[j] > temp) {
					
					j--;
					
				}
				
				if(i < j) {
					
					array[i] = array[j];
					
					i++;
				}
				
				while(i < j && array[i] < temp) {

					i++;
				
				}
				if(i < j) {
					
					array[j] = array[i];
					
					j--;
				}
				
			}
			array[i] = temp;
			
			//以下将进行分治
			quick_sort(array,i+1,high);
			
			quick_sort(array,low,i-1);
		}
	}
}