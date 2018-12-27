package com.shop.test;


public class TestCall extends B implements C{
	static String hello;
	public static void main(String s[]) {
		System.out.println(hello);
			new B().show();
}
}


class B
{
	public void show() {
		System.out.println("hello");
	}
}

interface C
{
	public void show();
}
