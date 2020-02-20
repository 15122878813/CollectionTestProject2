package Thread;

class goal extends Thread{

}
public class CreateThreadByExtendsThread{

	public static void main(String[] args) {

		while (true) {

			goal goal = new goal();

			goal.start();

			System.out.println(goal.getName());
			
		}

	}
}
