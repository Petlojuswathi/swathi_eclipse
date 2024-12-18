
public class Loops {
	public static void printNumbers(int start, int end) throws InterruptedException {
		System.out.println("start...");
		while(start <= end) {
			System.out.println("count: "+start);
			Thread.sleep(1000 * 1);
			start++;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		printNumbers(1,10);
	}

}
