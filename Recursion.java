package com.zyf.arrayuse;


/**
 * 递归
 * 
 * 什么是递归？
 * 自己调用自己，直到触发了某条结束遇见后，结束
 * @author zhang
 *
 */
public class Recursion {
	
	public static void main(String[] args) {
		print(3);
	}
	
	public static void print(int i) {
		
		//给个判断条件，比如，i大于0的时候，调用自己
		if(i>0) {
			System.out.println("i:"+i);
			print(i-1);
		}
		
	}

}
