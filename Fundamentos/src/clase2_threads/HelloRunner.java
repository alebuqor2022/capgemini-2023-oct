package clase2_threads;

public class HelloRunner {

	public static void main(String[] args) {
		Runnable r=new MyThread_I();
		Thread t=new Thread(r);
		t.start();
	}

}
