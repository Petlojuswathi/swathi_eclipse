
public class TypeCastingDemo {

	public static void main(String[] args) {
		byte b = 100;
		int i = b;
		
		//int i = 100;
		//byte b = i; //Typeconversion error
		//byte b = (byte) i;//we have mention byte
		System.out.println(b);
		System.out.println(i);
		
		int i2 = 120;
		double d = i2;
		System.out.println(i2);
		System.out.println(d);
		
		double d1 = 250.5;
		int i3 = (int) d1; 
		System.out.println(i3);
		System.out.println(d1);
		
		String s1 = "10";
		String s2 = "20";
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println(s1+s2);
		System.out.println(n1+n2);
		
		String s3 = "10.4";
		String s4 = "20.5";
		double d2 = Double.parseDouble(s3);
		double d3 = Double.parseDouble(s4);
		System.out.println(s3+s4);
		System.out.println(d2+d3);
	}

}
