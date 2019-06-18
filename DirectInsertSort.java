package com.zyf.algorithm;

import java.util.Arrays;

/**
 * 直接插入排序 基本操作是将一条记录插入到已排好的有序表中， 从而得到一个新的、记录数量增1的有序表。
 * 
 * @author zhang
 *
 */
public class DirectInsertSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 3, 9, 0, 1, 8, 5 };
		DirectInsertSortMethod(arr);
		System.out.println(Arrays.toString(arr));
	}

	// 直接插入排序

	public static void DirectInsertSortMethod(int[] arr) {

		// 直接插入排序是从第一个值开始的，默认第一个是有序排列

		for (int i = 1; i < arr.length; i++) {

			// 如果当前数字比前一个小
			if (arr[i] < arr[i - 1]) {
				// 将当前数字存到临时变量中去
				int temp = arr[i];
				int j;

				// 遍历当前数字前面所有的数字
				for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
					// 把前一个赋值给后一个
					arr[j + 1] = arr[j];
				}

				// 当前一个数字小于等于临时中的数字后，结束
				arr[j + 1] = temp;
			}
		}

	}

}
