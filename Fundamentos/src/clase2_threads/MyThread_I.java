package clase2_threads;

// 2do ejemplo, usamos INTERFACE
public class MyThread_I implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(2000);
				System.out.println("chau " + i++);
				if(i==10) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("hilo interrumpido " + e.getMessage());
			}
			
		}
		
	}

}
