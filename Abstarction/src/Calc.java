
public interface Calc {
	public static final double PI_VALUE = 3.14;
	public abstract int sum(int x, int y);   //int sum(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y); //Plan what need to be implemented
	
	//From Java 8
	public default int findSquare(int x) {
		return x * x;
	}
	public default int findCube(int x ) {
		return x * x * x;
	}
	
	//Static methods from java 8
	public static int doubleIt(int x) {
		return x + x;
	}
}
