package com.zyf.arrayuse;

/**
 * 双向循环链表
 * 
 * 什么是双向链表？
 * 双向链表有三个元素
 * 第一个元素：指向的是上一个元素
 * 第二个元素：节点内容
 * 第三个元素：指向的是下一个元素
 * 
 * 串行的  一组指向一组
 * 一般我们都构造双向循环链表。
 * @author zhang
 *
 */
public class DoubleNode {
	
	//第一个元素
	DoubleNode up=this;
	
	//节点数据
	int  data;
	//第三个值  
	DoubleNode  next=this;
	
	//构造
	public DoubleNode(int data) {
		this.data=data;
	}
	
	

	
	//查看节点
	public int getData() {
		return this.data;
	}
	
	//获取下一个节点
	public DoubleNode next() {
		return this.next;
	}
	
	
	//删除下一个节点
	public void removeNode() {
		//取出下下一个节点,的第一个值
		DoubleNode nodeNext=next.next;
		//把下一个节点的第一个值，关联到当前节点的第二个值上
		this.next=nodeNext;
	}
	
	
	//取出所有的节点
	public void show() {
		//获取当前的节点
		DoubleNode currentNode=this;
		
		while(true) {
			System.out.println("node："+currentNode.data);
			//获取当前节点的第二个值  将第二个值给当前值，继续找
			currentNode=currentNode.next;
			
			//取到第二个值为null的时候结束
			if(currentNode==null)
			{
				break;
			}
		}
	}
	
	
	//插入一个节点作为当前节点的下一个节点
	public void insert(DoubleNode node)
	{
		//获取当前节点的下一个节点
		DoubleNode nextNode=next;
		
		//把新节点放在当前节点的下一个节点
		this.next=node;

		//把当前节点做新节点的第一个元素
		node.up=this;
		
		//让原来节点下一个节点做新节点的下一个节点
		node.next=nextNode;
		
		//让原来的下一个节点的上一个节点为新节点
		nextNode.up=node;
	}
	

}
