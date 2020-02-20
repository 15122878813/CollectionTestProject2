package String;

//如何将 StringBuffer的insert方法来代替append方法

//stringBuffer.insert(stringBuffer.length(),x)来代替原本的append方法,在末尾进行插入
public class StringBufferappend {
	
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
//		sb.append(1);
//		System.out.println(sb);
		sb.append(1);
		int length = sb.length();
		System.out.println(sb);
		sb.insert(sb.length(),2);
		System.out.println(sb);
		
		
//		答：sb.append(x) = sb.insert(sb.length,x);
	}
}
