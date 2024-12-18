
	class Parent3{
		public static void study() {
			System.out.println("Medicine");
		}
	}
	class Child3 extends Parent3{
		public static void study() {
			System.out.println("Acting");
		}
	}
	public class MethodHiding {
		public static void main(String[] args) {
			Parent3 p = new Parent3();
			p.study();
			
			Child3 c = new Child3();
			c.study();
			
			Parent3 p2 = new Child3();
			p2.study();
		}
	}

