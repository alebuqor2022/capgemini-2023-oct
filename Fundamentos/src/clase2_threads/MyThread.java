package clase2_threads;

//1er ejemplo, usamos HERENCIA
public class MyThread extends Thread{

	
	public static void main(String[] args) {
		Thread t=new MyThread();
		t.run();
	}

	//overriding
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(2000);
				System.out.println("hola " + i++);
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
