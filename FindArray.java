package com.zyf.arrayuse;

/**
 * 数组之线性查找
 * 
 * 线性查找的缺点：效率比较低，每次都是从头开始查找，如存在停止，如不存在，将数组从头到尾遍历一遍。
 * @author zhang
 *
 */
public class FindArray {

	public static void main(String[] args) {
		
		//目标数组
		int[] array=new int[] {9,3,6,10,1,100};
		
		//查找的元素
		int element=1;
		
		//遍历
		for (int i = 0; i < array.length; i++) {
			//判断是否存在，如果存在就读取它在数组中的下标
			if(array[i]==element) {
				System.out.println("数组中的数据："+array[i]);
				System.out.println("下标："+i);
				break;
			}
			
		}
		
	}
}
