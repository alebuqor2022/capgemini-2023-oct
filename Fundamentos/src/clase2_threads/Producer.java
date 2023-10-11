package clase2_threads;

public class Producer implements Runnable{
private MyStack theStack;
private int num;
private static int counter=1;
	
	public Producer(MyStack s) {
		this.theStack=s;
		num=counter++;
	}
	@Override
	public void run() {
		 char c;
		 for(int i=0;i<200;i++) {
			 c=(char)(Math.random() * 26 + 'A');
			 theStack.push(c);
			 System.out.println("Productor " + num + ": " + c);
			 try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		
	}

}
