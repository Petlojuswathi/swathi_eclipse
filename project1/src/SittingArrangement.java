
public class SittingArrangement {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					if(i!=j && i!=k && j!=k) {
						count++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("Different ways to arrange:"+count);
	}
		
}
