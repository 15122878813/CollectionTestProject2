package SingleTonExample;

//饿汉式单例模式,直接在本类进行new,在外界无法进行new,


class HungrySinglton{

	private static HungrySinglton hungrySinglton = new HungrySinglton();

	private HungrySinglton(){

	}

	public static  HungrySinglton getInstance(){

		return hungrySinglton;
	}
}

class mythread extends  Thread{

	@Override
	public void run() {

		System.out.println(HungrySinglton.getInstance().hashCode());

	}
}

public class HungryModel{

	public static void main(String[] args) {

		while (true){

			new mythread().start();

		}
	}
}