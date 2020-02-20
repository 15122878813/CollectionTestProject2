package String;

import java.io.UnsupportedEncodingException;

//实现字符串的编码转换
public class StringConvert {
	
	public static void main(String[] args) throws Exception {
		String s1 = new String("你好");
		
		byte[] bytes = s1.getBytes("GB2312");
		String string = new String(bytes, "ISO-8859-1");
		System.out.println(string);
	}
}
