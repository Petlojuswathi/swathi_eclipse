
public class loops3 {
	public static void printNumbers(int start, int end) throws InterruptedException {
		System.out.println("start...");
		while(start <= end) {
			System.out.println("count: "+start);
			Thread.sleep(1000 * 1);
			start++;
		}
		System.out.println("end...");
	}
	
	public static void printSquaresAndCubes(int num) {
		System.out.println("Num\tSquare\tCube");
		for(int i=1; i<=num; i++) {
			System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
		}
	}
	public static void main(String[] args) throws InterruptedException {
		rintSquaresAndCubes(1,10);
	}

}
