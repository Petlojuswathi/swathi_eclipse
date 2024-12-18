package com.pack2;

import com.pack1.Calc;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.z);
		//c.findSquare(20);
		c.findSum(10, 20);
		System.out.println(c.i);
		c.findSub(20, 5);
	}
}
