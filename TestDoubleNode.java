package com.zyf.test;

import com.zyf.arrayuse.DoubleNode;

/**
 * 测试双向循环链表
 * @author zhang
 *
 */
public class TestDoubleNode {
	
	
	public static void main(String[] args) {
		DoubleNode  dn1=new DoubleNode(1);
		DoubleNode  dn2=new DoubleNode(2);
		DoubleNode  dn3=new DoubleNode(3);
		
		//1  追加  2
		dn1.insert(dn2);
		//2  追加 3
		dn2.insert(dn3);
		
		//1的上一个节点 是3
		System.out.println("1的上一个节点："+dn1.up().getData());
		//1的下一个节点 是2
		System.out.println("1的下一个节点："+dn1.next().getData());
		//1的内容是1
		System.out.println("1的内容："+dn1.getData());
		
		
		
		
		//2的上一个节点 是1
		System.out.println("2的上一个节点："+dn2.up().getData());
		//2的下一个节点 是3
		System.out.println("2的下一个节点："+dn2.next().getData());
		//2的内容是2
		System.out.println("2的内容："+dn2.getData());
		

		//3的上一个节点 是2
		System.out.println("3的上一个节点："+dn3.up().getData());
		//3的下一个节点 是1
		System.out.println("3的下一个节点："+dn3.next().getData());
		//3的内容是3
		System.out.println("3的内容："+dn3.getData());
		
	}

}
