package Web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookie {
	
	public static void main(String[] args,HttpServletRequest request,HttpServletResponse response) {
		
		//给客户端返回cooie对象
		response.addCookie(new Cookie("cookie", "want"));
		
		//获取cookie对象
		Cookie[] cookies = request.getCookies();
		
		//设置最大时长,
		cookies[0].setMaxAge(0);
		
		//最终销毁cookie
		response.addCookie(cookies[0]);
	}
}
