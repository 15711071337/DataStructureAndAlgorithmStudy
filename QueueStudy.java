package com.zyf.arrayuse;


/**
 * 队列的学习类
 * 什么是队列？
 * 队列相当于是一个存放元素的容器。
 * 
 * 队列的特点：
 * 遵循：先进先出的原则
 * @author zhang
 *
 */
public class QueueStudy {
	
	//创建一个队列
	private int[] createStack;
	
	//构造
	public QueueStudy() {
		createStack=new int[0];
	}
	
	
	//入队
	public void push(int element) {
		//创建一个新的队列
        int[] newStack=new int[createStack.length+1];
        
        //将原来的数据赋值给新的队列
        for (int i = 0; i < createStack.length; i++) {
        	newStack[i]=createStack[i];
		}
        
        //将元素添加到新队列的最后面
        newStack[createStack.length]=element;
        
        //将新栈赋值给原队列
        createStack=newStack;
	}
	
	//出队
	public int pop() {
		if(createStack.length==0) 
		{
			throw new RuntimeException("长度为0");
		}
		
		//取数据中的第一个元素
		int element=createStack[0];
		
		//创建一个新栈
		int[] newArray=new int[createStack.length-1];
		
		//将剩余部分的数据保存到新栈中
		for (int i = 0; i < newArray.length; i++) {
			newArray[i]=createStack[i+1];
		}
		
		//将新栈赋值给旧栈
		createStack=newArray;
		
		//返回栈顶数据
		return element;
	}
	
	
	//查看队列顶元素
	
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
		QueueStudy  ss=new QueueStudy();
		ss.push(1);
		ss.push(2);
		ss.push(5);
		System.out.println("出队："+ss.pop());
		
		
		//查看栈顶元素
		System.out.println("队列顶元素："+ss.peek());
		
		//判断是否为空
		System.out.println("判断队列是否为空："+ss.isEmpty());
	}
	
}
