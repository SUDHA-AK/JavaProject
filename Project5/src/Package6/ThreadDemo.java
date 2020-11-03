package Package6;

class NewThread extends Thread{

	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Child Thread: "+i);
				Thread.sleep(600);
			} 
		}catch (InterruptedException e) {
				System.out.println("child interrupted");
			}
		System.out.println("Exiting child thread.");
		}
}

public class ThreadDemo{
	public static void main(String args[]) {
		NewThread t=new NewThread();
		t.setName("demo thread");
		System.out.println("child thread "+t);
		t.start();
		//t.interrupt();
		
		try {
			for(int i=5;i>0;i--) {
				System.out.println("main thread: "+i);
				Thread.sleep(600);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("Exiting main thread.");
	}
}



