package com.zyf.test;

import com.zyf.arrayuse.Node;

//单链表 测试
public class TestNode {

	
	public static void main(String[] args) {
		Node  node1=new Node(1);
		Node  node2=new Node(2);
		Node  node3=new Node(3);
		Node  node4=new Node(2);
		node1.append(node2).append(node3);
		
		System.out.println("单链表的数据第一个值："+node1.getData());
		System.out.println("单链表的数据第二个值："+node1.next().getData());
		System.out.println("单链表的数据第三个值："+node1.next().next().getData());
		
		
		
		//删除下一个链表
		node1.removeNode();
		
		//显示所有的节点
		node1.show();
		
		
		System.out.println("插入---------以下部分：------------");
		
		//插入一个链表
		node1.insert(node4);
		
		//显示所有的节点
		node1.show();
		
	}
}
