package com.zyf.test;

/**
 * 斐波那契数列
 * 
 *    1  1   2  3  5 8 13
 * @author zhang
 *
 */
public class TestFeiBoNaQie {

	
	public static void main(String[] args) {
		
		System.out.println("测试  斐波那契数列："+Test(4));
	}
	
	public static int Test(int i) {
		
		if(i==1 || i==2) 
		{
			return 1;
		}
		
		return Test(i-1)+Test(i-2);
		
	}
}
