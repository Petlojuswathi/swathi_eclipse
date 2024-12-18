
public class InterfaceDemo {
		public static void main(String[] args) {
			//Instantiation is not possible for interface 
			//Calc c = new Calc(); ////Compliation error
			
			MyCalc myCalc = new MyCalc();
			System.out.println(myCalc.sum(10, 20));
			System.out.println(myCalc.sub(20, 10));
			System.out.println(myCalc.mul(10, 20));
			System.out.println(myCalc.div(10, 20));
			System.out.println(myCalc.findSquare(10));
			System.out.println(myCalc.findCube(10));
			
			//Interface static methods cannot be accessed using implementation class
			//System.out.println(myCalc.doubleIt(10));
			
			//Acessing static methods using Interface name
			System.out.println(Calc.doubleIt(10));
			
			System.out.println("----------------------------------");
			
			//Interface can be used as reference type
			Calc c = new MyCalc();
			System.out.println(c.sum(10, 20));
			System.out.println(c.sub(20, 10));
			System.out.println(c.mul(10, 20));
			System.out.println(c.div(10, 20));
		}
	}

