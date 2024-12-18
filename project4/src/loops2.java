public class loops2 {
	public static void printNumbers(int end, int start) throws InterruptedException {
		System.out.println("start...");
		while(start >= end) {
			System.out.println("count: "+end);
			Thread.sleep(1000 * 1);
			end++;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		printNumbers(1,10);
	}

}


