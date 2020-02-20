package Web;
import javax.servlet.http.HttpServletRequest;

public class RequestParameter {
	
	public static void main(String[] args,HttpServletRequest request) {
		
		//获取指定的参数对象
		String parameter = request.getParameter("sb");
		
	}
}
