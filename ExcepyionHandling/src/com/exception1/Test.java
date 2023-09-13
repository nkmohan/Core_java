package com.exception1;

public class Test {
	public void m2(int a, int b)throws Exception{
		System.out.println("m2() is started");
		try {
			int c = a/b;
			System.out.println(c);
		}catch (Exception e){
			throw new InvalidNumberException("invalid number");
		}
		System.out.println("m2() is ended");
	}
	public void m1(int a, int b)throws Exception{
		System.out.println("m1() is started");
		m2(a,b);
		System.out.println("m2() is ended");
	}
	public static void main(String[] args) {
		System.out.println("main()is started");
		try {
			Test t = new Test();
			t.m1(10,0);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("main()is ended");
	}

}
