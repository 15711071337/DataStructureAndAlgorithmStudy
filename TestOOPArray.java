package com.zyf.arrayuse;


public class TestOOPArray {
	public static void main(String[] args) {
		
		//创建对象
		OOPArray  oop=new OOPArray();
		
		//给数组赋值
		oop.add(1);
		oop.add(2);
		oop.add(3);
		
		//查看数组的长度：
		System.out.println("数组的长度："+oop.length()); //数组的长度：3
		
		//打印数组
		oop.show();//数组中的数据：[1, 2, 3]
		
		
	}

}
