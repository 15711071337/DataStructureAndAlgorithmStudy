package com.zyf.algorithm;

import java.util.Arrays;

/**
 * 快速排序
 * 
 * 什么是快速排序？ 首先任意选取一个数据（通常选用数组的第一个数）作为关键数据， 然后将所有比它小的数都放到它左边， 所有比它大的数都放到它右边，
 * 这个过程称为一趟快速排序。 值得注意的是，快速排序不是一种稳定的排序算法， 也就是说，多个相同的值的相对位置也许会在算法结束时产生变动。 一
 * 
 * @author zhang
 *
 */
public class QuickSort {

	// 测试
	public static void main(String[] args) {

		// 定义一个数组
		int[] arr = { 7, 2, 9, 10, 3, 5, 8, 20, 4, 30 };
		System.out.println("没有排序之前的数据：" + Arrays.toString(arr));
		QuickSortMethod(arr, 0, arr.length - 1);
		System.out.println("没有排序之前的数据：" + Arrays.toString(arr));
	}

	// 排序算法

	public static void QuickSortMethod(int[] arr, int start, int end) {

		// 判断，起点坐标小于尾部坐标，才能进行排序
		if (start < end) {
			// 找数组的第一个值为标准值
			int stard = arr[start];

			// 定义 低位和高位的 下标
			int low = start;
			int high = end;

			// 循环进行查找
			while (low < high) {
				// 右边的数比标准的大，那么数的下标向前移动
				while (low < high && stard <= arr[high]) {
					high--;
				}

				// 否则，将右边的数，替换左边的数
				arr[low] = arr[high];

				// 左边的数比标准数小，数的下标向后移动
				while (low < high && stard >= arr[low]) {
					low++;
				}

				// 否则，将左边的数，替换右边的数
				arr[high] = arr[low];
			}

			// 当 low和high的坐标重合了，就把标准的数添加进来
			arr[low] = stard;

			// 处理所有小的数字
			QuickSortMethod(arr, start, low);
			// 处理所有大的数字
			QuickSortMethod(arr, low + 1, end);
		}
	}
}
