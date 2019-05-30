package com.zyf.arrayuse;

/**
 * 单链表
 * 什么是链表？
 * 链表就相当于 一节车厢连接一节车厢
 * 链表中的单个元素有两个值，第一个值是内容，第二值是地址（指向下一个链表），第二个值默认为空
 * 
 * 
 * 循环单链表的话，就是将所有节点的最后一个和第一个节点相连
 * 
 * @author zhang
 *
 */
public class Node {
	
	//第一个值    内容
	int data;
	
	//第二值  相当于地址  指向
	Node  next;
	
	//构造
	public Node(int data) {
		this.data=data;
	}
	
	
	//追加 链表 
	public Node append(Node node) {
		//获取当前节点
		Node currentNode=this;
		
		while(true) {
			
			//获取当前节点的第二个值
			Node nextNode=currentNode.next;
			
			//判断，当节点为null的时候，这就是最后一个节点，结束。
			if(nextNode==null) {
				break;
			}
			
			//将节点的第二个值，在指向某个节点的第一个值
			currentNode=nextNode;
		}
		//一直找到最后一个节点的第二个值，然后准备给它添加值
		currentNode.next=node;
		
		return currentNode;
		
	}
	
	//查看节点
	public int getData() {
		return this.data;
	}
	
	//获取节点的第二个值
	public Node next() {
		return this.next;
	}
	
	
	//删除下一个节点
	public void removeNode() {
		//取出下下一个节点,的第一个值
		Node nodeNext=next.next;
		//把下一个节点的第一个值，关联到当前节点的第二个值上
		this.next=nodeNext;
	}
	
	
	//取出所有的节点
	public void show() {
		//获取当前的节点
		Node currentNode=this;
		
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
	public void insert(Node node)
	{
		//获取当前节点的下一组节点
		Node nextNode=next;
		
		//将要插入的节点，插入到当前节点的后面
		this.next=node;
		
		//插入完，将之前的那组以后的节点，插入到现在这组节点的后面
		node.next=nextNode;
		
	}
	

}
