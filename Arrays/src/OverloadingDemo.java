
	public class OverloadingDemo {
		public static void main(String[] args) {
			int maxInt = MyCalc.findMax(100,200);
			System.out.println(maxInt);
			
			double maxDouble = MyCalc.findMax(10.5,20.5);
			System.out.println(maxDouble);
			
			long maxLong = MyCalc.findMax(9988776655L,88776655L);
			System.out.println(maxLong);
			
			MyCalc.m1();
			MyCalc.m1(10);
			MyCalc.m1(10,20);
			MyCalc.m1(10,20,30);
			MyCalc.m1(10,20,30,40);
			MyCalc.m1(new int[] {10,20,30,40,50});
			
		}

	}
