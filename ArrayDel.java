package com.zyf.arrayuse;

import java.util.Arrays;

/**
 * 数组的删除
 * 
 * 根据下标去删除数组中的值
 * @author zhang
 *
 */
public class ArrayDel {

	public static void main(String[] args) {
		
		//原始数组
		int[] oldArray=new int[] {5,10,1,9};
		
		//打印
		System.out.println("删除前的数组数据："+Arrays.toString(oldArray));//[5, 10, 1, 9]
		//要删除元素的下标
		int elementIndex=2;
		
		//新数组
		int[] newArray=new int[oldArray.length-1];
		
		//赋值和新数组
		
		for (int i = 0; i < newArray.length; i++) {
			
			//判断下标是否在要删除元素之前，之前的全部赋值到新数组
			if(i<elementIndex) {
				newArray[i]=oldArray[i];
				
				//如果大于删除元素，那么将原数组中的数据赋值给新数组
			}else {
				newArray[i]=oldArray[i+1];
			}
			
		}
		
		//将新数组指向原数组
		oldArray=newArray;
		
		//打印新数组
		System.out.println("删除后的数组数据："+Arrays.toString(oldArray));//[5, 10, 9]
		
	}
}
