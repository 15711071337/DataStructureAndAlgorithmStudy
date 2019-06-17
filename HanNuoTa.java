package com.zyf.arrayuse;


/**
 * 汉诺塔
 * 汉诺塔的实现  典型使用了递归
 * 
 * 汉诺塔小游戏的实现
 * 小游戏的网页链接地址：http://www.4399.com/flash/109504_1.htm 
 * 游戏规则：
 * 把所有圆环从最左边的珠子都套到最右边的柱子上；
 * 每次只能移动一个圆环，大的圆环不能压在小的圆环上
 *
 * @author zhang
 *
 */
public class HanNuoTa {
	
	public static void main(String[] args) {
		hanNuoTaTest(5,'A','B','C');
	}
	
	/**
	 * 
	 * @param n     有几个盘子
	 * @param from  第一个柱子
 	 * @param in    第二个柱子
	 * @param to    第三个柱子
	 */
	public static void hanNuoTaTest(int n,char from,char in, char to) {
		
		//把所有盘子分为两种情况，最上面的为一组，和最下面的一个
		if(n==1)
		{
			System.out.println("第1个盘子从"+from+"移到"+to);
		}else {
			//上面的盘子移动到中间位置
			hanNuoTaTest(n-1,from,to, in);
			
			//移动最下面的盒子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			
			//将上面所有的盘子从中间移动到第三个柱子上
			hanNuoTaTest(n-1,in,from, to);
			
		}
		
	}

}
