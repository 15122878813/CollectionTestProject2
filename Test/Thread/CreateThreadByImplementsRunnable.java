package Thread;

class score implements Runnable{

	@Override
	public void run() {
		
	}
	
} 

public class CreateThreadByImplementsRunnable {
	
	public static void main(String[] args) {
		
		while (true) {
			
			score score = new score();
			
			Thread thread = new Thread(score);
			
			thread.start();
			
			System.out.println(thread.getName());
		}
	}
}
