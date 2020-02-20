package Thread;

import javax.xml.crypto.Data;
import java.util.Date;

///////////////////////////////////////////////////
public class ThreadLocalTest {

	public static void main(String[] args) {

		USer user = new USer();

		user.setUname("zqzqzq");

		Threadlocal.threadLocal.set(user);

		get();

	}

	private static void get() {

		System.out.println(Threadlocal.threadLocal.get().getUname());
	}
}

class USer{
	private  String Uname;

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}
}
class Threadlocal{

	public static  ThreadLocal<USer> threadLocal = new ThreadLocal<USer>();

	public void set (USer user){

		threadLocal.set(user);

	}

	public USer get(){

		return threadLocal.get();
	}
	public void  remove(){

		threadLocal.remove();
	}
}
///////////////////////////////////////////////////
