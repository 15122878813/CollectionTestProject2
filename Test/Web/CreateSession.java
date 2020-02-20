package Web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateSession {
	
	public static void main(String[] args,HttpServletRequest request,HttpServletResponse response) {
		
		//获取session对象
		HttpSession session = request.getSession();
		
		//设置session时长,默认最大时长为三十分钟 
		session.setMaxInactiveInterval(30);
		
		//销毁session对象
		session.invalidate();
		
	}
}
