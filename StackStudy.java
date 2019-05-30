package com.zyf.arrayuse;

import javax.management.RuntimeErrorException;

/**
 * 栈的学习类
 * 栈什么是栈？
 * 栈相当于是一个存放元素的容器。
 * 
 * 栈的特点：
 * 先存入的元素会处于栈底，后存入的元素会处于栈顶。
 * 遵循：先进后出的原则
 * @author zhang
 *
 */
public class StackStudy {
	
	//创建一个栈
	private int[] createStack;
	
	//构造
	public StackStudy() {
		createStack=new int[0];
	}
	
	
	//压栈操作
	public void push(int element) {
		//创建一个新的栈
        int[] newStack=new int[createStack.length+1];
        
        //将原来的数据赋值给新的栈
        for (int i = 0; i < createStack.length; i++) {
        	newStack[i]=createStack[i];
		}
        
        //将元素添加到新栈的最后面
        newStack[createStack.length]=element;
        
        //将新栈赋值给原栈
        createStack=newStack;
	}
	
	//出栈  将栈顶的数据返回
	public int pop() {
		if(createStack.length==0) 
		{
			throw new RuntimeException("长度为0");
		}
		
		//取数据中的最后一个元素
		int element=createStack[createStack.length-1];
		
		//创建一个新栈
		int[] newArray=new int[createStack.length-1];
		
		//将剩余部分的数据保存到新栈中
		for (int i = 0; i < createStack.length-1; i++) {
			newArray[i]=createStack[i];
		}
		
		//将新栈赋值给旧栈
		createStack=newArray;
		
		//返回栈顶数据
		return element;
	}
	
	
	//查看栈顶元素
	
	public int peek() {
		if(createStack.length==0) 
		{
			throw new RuntimeException("长度为0");
		}
		return createStack[createStack.length-1];
	}
	
	//判断是否为空
	public boolean isEmpty() {
       return  createStack.length==0;		
	}

	
	//测试
	public static void main(String[] args) {
		StackStudy  ss=new StackStudy();
		ss.push(1);
		ss.push(2);
		ss.push(5);
		System.out.println("出栈："+ss.pop());
		
		
		//查看栈顶元素
		System.out.println("栈顶元素："+ss.peek());
		
		//判断是否为空
		System.out.println("判断栈是否为空："+ss.isEmpty());
	}
	
}
