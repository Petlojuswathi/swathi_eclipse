
public class MyCalc {
		public static int findMax(int x, int y) { //static methods are called by using its class name in another class name
			return (x>y) ? x:y;
		}
		public static double findMax(double x, double y) { 
			return (x>y) ? x:y;
		}
		public static long findMax(long x, long y) { 
			return (x>y) ? x:y;
		}
		//VarArg method or Variable Length Argument Method
		public static void m1(int...num) {
			//System.out.println("JAVA");
			int total = 0;
			for(int element: num) {
				total += element;
			}
			System.out.println(total);
			
		}
	}

