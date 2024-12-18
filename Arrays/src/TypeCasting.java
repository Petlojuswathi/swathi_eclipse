
public class TypeCasting {

	public static void main(String[] args) {
		Object[] objArray = {10, "Jones", 45000.0, true};
		
		int element1 = (int) objArray[0];
		String element2 = (String) objArray[1];
		double element3 = (double) objArray[2];
		
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element3);
	}

}
