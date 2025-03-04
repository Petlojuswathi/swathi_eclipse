package multithreading;

class MulTable{
	public synchronized void printMulTable(int num) {
		for(int i=1; i<=10; i++) {
			//10*1=10
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class KohliThread extends Thread{
	MulTable t;
	
	public KohliThread(MulTable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(9);
	}
}

class DhoniThread extends Thread{
	MulTable t;
	
	public DhoniThread(MulTable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(10);
	}
}

class RohitThread extends Thread{
	MulTable t;
	
	public RohitThread(MulTable t) {
		this.t = t;
	}
	@Override
	public void run() {
		t.printMulTable(11);
	}
}


public class SynchorizationDemo {

	public static void main(String[] args) {
		MulTable t = new MulTable();
		
		KohliThread t1 = new KohliThread(t);
		DhoniThread t2 = new DhoniThread(t);
		RohitThread t3 = new RohitThread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
