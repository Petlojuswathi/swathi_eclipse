package com.pack1;

public class Calc {
	//Default scope
	int x = 100;
	
	//Private scope=only within class
	private int y = 20;
	
	public int z = 30;
	
	protected int i = 111;
	
	//Default scope //can be accessed upto to package //within the package
	void findSquare(int num) {
		System.out.println(num * num);
	}
	private void findCube(int num) {
		System.out.println(num * num * num);
	}
	
	public void findSum(int x,int y ) {
		System.out.println(x + y);
	}
	
	public void findSub(int a,int b ) {
		System.out.println(a - b);
	}
	
}
