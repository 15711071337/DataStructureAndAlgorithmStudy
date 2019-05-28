package com.zyf.arrayuse;

import java.util.Arrays;

/** UTF-8
 * 现在有一个长度为3的数组，数组的数据为：1,2,3，我们想将4添加到这个数组的末尾中
 * 数组的长度一旦创建，那么不可变。
 * @author zhang
 *
 */
public class ArrayAdd {
	
	public static void main(String[] args) {
		
		//创建原始数组
		int[] oldArray=new int[] {1,2,3};
		
		//打印原始数组
		System.out.println("原始数组的数据："+Arrays.toString(oldArray));//[1, 2, 3]
		
		//添加的元素
		int addElement=4;
		
		//创建新数组
		int[] newArray=new int[oldArray.length+1];
		
		//将原来的数组中的值赋值给新数组
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i]=oldArray[i];
		}
		
		//将元素添加到新数组中
		newArray[oldArray.length]=addElement;
		
		//将现在的数组指向原来的数组
		oldArray=newArray;
		System.out.println("添加后的数据："+Arrays.toString(oldArray));//[1, 2, 3, 4]
		
	}

}
