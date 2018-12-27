package com.shop.test;


class TestInheritence{
	public static void hello() {
		System.out.println("test-base");
	}
}



class TestInheritence1 extends TestInheritence{
	public static void hello() {
		System.out.println("test-l1");
	}
}


public class TestInheritence2 extends TestInheritence1
{
	public static void hello() {
		System.out.println("test-l2");
	}
}


