package multithreading;

class Programming{
	public void code() {
		System.out.println("coding is fun:");
	}
}

//creating user defined thread using Thread class
class JavaThread extends Thread{
	@Override
	public void run() {
		//define thread job
		for(int i=1; i<=10; i++) {
			System.out.println("Java-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

//2. Creating user defined thread using Runnable interface //2 apporach is recommended
class PythonThread extends Programming implements Runnable{
	@Override
	public void run() {
		//define thread job
		for(int i=1; i<=10; i++) {
			System.out.println("Python-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException{
		
		Programming pg = new Programming();
		pg.code();
		
		PythonThread p = new PythonThread();
		Thread t = new Thread(p);
		t.start();
		t.join();
		//t.join(2000);
		
		JavaThread j = new JavaThread();
		j.start(); //begin thread execution
		//j.run(); //new thread won't be started
		j.join(); //overloaded methodsS
		
		//main thread job
		for(int i=1; i<=10; i++) {
			System.out.println("Main-"+i);
		}
	}

}
