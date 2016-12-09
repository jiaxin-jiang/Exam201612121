package Exam201612091;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberStart {

	public static void main(String[] args) {

		// 调用函数进行素数的判断，传入初始参数（101，200）
		List<Integer> primeNums = getPrimeNumber(101, 200);

		System.out.print("101-200间总共有" + primeNums.size() + "个素数他们分别是：");
		for (Integer pNum : primeNums) {
			System.out.print(pNum + ",");
		}
	}

	public static List<Integer> getPrimeNumber(int startNum, int endNum) {

		// 创建装素数的list
		List<Integer> primeNums = new ArrayList<Integer>();

		// 起始数
		int i = startNum;
		// 是否为素数标记，初始为true
		boolean judge = true;
		// 判断是i是否处于起始数和终止数之间
		while (i >= startNum && i <= endNum) {
			// 判断是否为素数
			for (int j = 2; j > 1 && j <= Math.sqrt(i); j++) {
				// 不为素数时judge为false，跳出循环
				if (i % j == 0) {
					judge = false;
					break;
				}
			}
			// 为素数是，添加到素数的list中
			if (judge == true) {
				primeNums.add(new Integer(i));
			}
			// 还原judge的值
			judge = true;
			// 进行下一个书的判断
			i++;
		}
		// 返回结果集
		return primeNums;
	}
}
