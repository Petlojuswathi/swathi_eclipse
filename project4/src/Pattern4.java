
public class Pattern4 {
	public static void main(String[] args) {
		int num = 6;
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=num-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



