package com.pack1;

public class CalcTest {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.x);
		c.findSquare(20);
		System.out.println(c.x);
		c.findSum(10, 20);
		System.out.println(c.x);
		c.findSub(10, 20);
		
		//private 
		//System.out.println(c.y);
		//c.findCube(20);
	}

}
