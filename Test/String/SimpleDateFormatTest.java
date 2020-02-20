package String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	
	public static void main(String[] args) {
		
		//[2013-10-16 16:32:39]
		//设置时间的格式
		
		//1.创建Date对象
		Date date = new Date();
		
		String format = "[yyyy-MM-dd HH:mm:ss]";
		//2.创建simpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		//3.进行时间格式整理
		String format2 = sdf.format(date);
		
		System.out.println(format2);

	}
}
