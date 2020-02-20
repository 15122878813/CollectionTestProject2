package algorithm;

//写个方法来计算阶乘

//也只能是用递归,当然还能使用循环的方式
public class JieCheng {
	
	public static void main(String[] args) {
		
		int sum = method(6);
		
		System.out.println(sum);
		
	}

	private static int method(int i) {

		if(i==0) {


			return 1;

		}

		int sum = i * method(i-1);
		
		return sum;
	}
}
