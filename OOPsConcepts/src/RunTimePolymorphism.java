
class Parent2 {
	public final void study() {
		System.out.println("Medicine");
	}
	public void property() {
		System.out.println("100Acre + 100kgs of gold + 100 Crores");
	}
	public void marry() {
		System.out.println("Arrange Marriage");
	}
}
class Child2 extends Parent2{
	//Method Overriding
	@Override
	
	public void marry() {
		System.out.println("Love Marriage");
	}	
}
	public class RunTimePolymorphism {
	public static void main(String[] args) {
		Parent2 p= new Parent2();
		p.study();
		p.property();
		p.marry();
		System.out.println("..........");
		
		Child2 c= new Child2();
		c.study();
		c.property();
		c.marry();
		
		Parent2 p2 = new Child2();
		p2.marry();
		
	
		
	}


}
