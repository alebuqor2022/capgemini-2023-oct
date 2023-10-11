package clase2_threads;

public class MyStack {
int idx=0;
char[] data= new char[100];

public void push(char c) {
	synchronized(this) {
		data[idx]=c;
		idx++;
		this.notify();
	}
}
public char pop(){ // pick on pile --> LIFO last in first out
	synchronized(this) {
		while(idx==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		idx--;
		return data[idx];
	}
	
}
}

