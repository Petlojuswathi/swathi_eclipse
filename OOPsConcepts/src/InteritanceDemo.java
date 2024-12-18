/*
 Interitance:
 To extends one class from another class 
 In order to reuse the functionality
 */
public class InteritanceDemo {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.call();
		p.msg();
		
		System.out.println("----------------------");
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.msg();
		sp.browsing();			
	}

}
