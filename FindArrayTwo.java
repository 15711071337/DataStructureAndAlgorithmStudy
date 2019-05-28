package com.zyf.arrayuse;

/**
 * 数组查找之二分查找
 * 二分查找的缺点：二分查找只能将排好序的数组进行查找。
 * 二分查找每次都会将数组分成二分之一去查找，然后比对，直到找到为止
 * @author zhang
 *
 */
public class FindArrayTwo {
	public static void main(String[] args) {
		
		//目标数组
		int[] array=new int[] {1,2,3,4,5,6,7,8,9};
		
		//需要查找元素
		int element=8;
		
		//起止下标位置
		int begin=0;
		
		//结束下标位置
		int end=array.length-1;
		
		//中间位置下标位置
		int mid=(begin+end)/2;
		
		//记录目标位置
		int index=-1;
		
		//循环
		while(true) {
			
			//如果中间位置是需要查找的那个元素，找到后打印下标
			if(array[mid]==element) {
				index=mid;
				break;
			}else {
				
				//如果中间的元素大于查找元素，在左侧
				if(array[mid]>element) {
					//将结束位置调整到中间位置-1
					end=mid-1;
					
					//如果中间元素小于查找元素，那么在右侧
				}else {
					//将开始位置调整到中间位置+1
					begin=mid+1;
				}
				
				//取新的中间位置
				mid=(begin+end)/2;
				
			}
		}
		System.out.println("查找元素："+array[mid]+",元素的下标："+index);
	}

}
