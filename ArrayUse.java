package com.zyf.arrayuse;

import java.util.Arrays;

//数组的基本使用
public class ArrayUse {
	
	public static void main(String[] args) {
		
		//创建一个长度为3的数组
		int[] array=new int[3];
		
		//查看数组的长度
		System.out.println("数组的长度："+array.length); //数组的长度：3
		
		//给数组添加数据
		array[0]=1;
		array[1]=2;
		array[2]=3;
		
		//查看数组的数据
		System.out.println(Arrays.toString(array));//[1, 2, 3]
		
		//可以直接给数组赋值
		array=new int[] {10,20,30};
		
		//查看数组的数据
		System.out.println(Arrays.toString(array));//[10, 20, 30]
	}
}
