public class ConditionalStatements2 {
public static double findDiscount(double billAmount) {
		double discount = 0.0;
		
		if(billAmount > 100 && billAmount <= 250) {
			discount = billAmount * .05;//5%
		}else if(billAmount > 250 && billAmount <= 500) {
			discount = billAmount * .1;//10%
		}else if(billAmount > 500 && billAmount <= 750) {
			discount = billAmount * .15;//15%
		}else if(billAmount > 750 && billAmount <= 1000) {
			discount = billAmount * .2;//20%					
		}else if(billAmount > 1000) {
			discount = billAmount * .3;//30%					
		}else {
			discount = 0.0;
		}
		return discount;
	}
	public static void billGenerate(double billAmount) {
		double discount = findDiscount(billAmount);
		System.out.println("Bill Amount: "+billAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Final Bill Amount: "+(billAmount-discount));
	}
	public static void main(String[] args) {
		double billAmount = 2000;
		billGenerate(billAmount);
	}
}