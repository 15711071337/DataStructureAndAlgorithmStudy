package com.zyf.arrayuse;

import java.util.Arrays;

/**
 * 面向对象数组
 * 
 * @author zhang
 *
 */
public class OOPArray {
	// 声明数组
	private int[] array;

	// 构造方法
	public OOPArray() {
		// 数组初始化
		array = new int[0];
	}

	// 获取数组的长度
	public int length() {
		return array.length;
	}

	// 给数组添加一个元素
	public void add(int element) {
		// 创建新数组
		int[] newArray = new int[array.length + 1];

		// 将原来的数组中的值赋值给新数组
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		// 将元素添加到新数组中
		newArray[array.length] = element;

		// 将现在的数组指向原来的数组
		array = newArray;
	}

	// 打印数组数据

	public void show() {
		System.out.println("数组中的数据：" + Arrays.toString(array));
	}

}
