package com.zyf.algorithm;

import java.util.Arrays;

/**
 * 算法之冒泡排序
 * 
 * 冒泡排序算法的原理如下： 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 
 * @author zhang
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 14, 7, 1, 9, 0, 3, 6, 2 };

		System.out.println("没有排序之前：" + Arrays.toString(array));

		sort(array);
		System.out.println("排序后：" + Arrays.toString(array));
	}

	public static void sort(int[] arr) {

		// 冒泡排序 第一个 for 表示 对比了多少次，第一次一定会确定一个最大的值，所以最大的那个值，就不会再去对比，所以就少了一次对比
		for (int i = 0; i < arr.length - 1; i++) {
			// 第二个 for 每一次对比的次数比上一次会少一次
			for (int j = 0; j < arr.length - 1 - i; j++) { // arr.length-1-i 防止溢出
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
