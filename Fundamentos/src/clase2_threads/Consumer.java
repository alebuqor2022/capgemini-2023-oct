package clase2_threads;

public class Consumer implements Runnable{
	private MyStack theStack;
	private int num;
	private static int counter=1;
		
		public Consumer(MyStack s) {
			this.theStack=s;
			num=counter++;
		}
		@Override
		public void run() {
			 char c;
			 for(int i=0;i<200;i++) {
				 c= theStack.pop();
				 System.out.println("Consumer " + num + ": " + c);
				 try {
					Thread.sleep((int)(Math.random() * 1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			
		}

	}
