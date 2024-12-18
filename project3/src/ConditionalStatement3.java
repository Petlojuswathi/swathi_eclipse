
public class ConditionalStatement3 {
	public static void calc(int num, String opertion) {
		switch(opertion) {
		case "square":
			System.out.println("Square "+num+" is "+(num*num));
			break;
		case "cube":
			System.out.println("Cube "+num+" is "+(num*num*num));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
	public static void main(String[] args) {
		int num = 10;
		String operation = "square";
		calc(num,operation);
	}
}

