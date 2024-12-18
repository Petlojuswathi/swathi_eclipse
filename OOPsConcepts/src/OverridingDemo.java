class Parent{
	public void property() {
		System.out.println("100Acre + 100kgs of gold + 100Crores");
	}	
	public final void study() {
		System.out.println("Medicine");
	}	
	public void marry() {
		System.out.println("Arrange Marriage");
	}
}
class Child extends Parent{
	//Overriding
	@Override
	public void marry() {
		System.out.println("Love Marriage");
	}
}


public class OverridingDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.property();
		p.study();
		p.marry();
		
		System.out.println("--------------");
		Child c = new Child();
		c.property();
		c.study();
		c.marry();
	}
}


