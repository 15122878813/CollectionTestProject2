package Exception;


//以下表示无论方法是否在try的代码体中进行返回
//即使实在被catch异常的情况下,仍然要执行finally代码块
//仍然要在finally中进行执行代码体
public class TryCatchFinallyReturn {
	
	public static void main(String[] args) {
		
		String getValue = tryMethod();
		
		System.out.println(getValue);
	}

	private static String tryMethod() {
		
		try {
			
//			int  c = 1/0;
			
			return "try";
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return "catch";
			
		} finally {
			
			return "finally";
			
		}
		
	}
}
