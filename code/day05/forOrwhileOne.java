/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1.不在循环条件部分限制次数的结构：for(;;)或while(true)
2.结束循环有几种方式?
		方式一：循环条件部分返回false
		方式二：在循环体中，执行break
		
*/
/*
题目：
从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
*/

import java.util.Scanner;
class forOrwhileOne {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int positiveNumb=0;
		int negotiveNumb=0;

		for(;;){//while(true){
			int num=scan.nextInt();
			
		//判断number的正负
		if(num>0){
			positiveNumb++;
		}else if(num<0){
			negotiveNumb++;
		}else{
			//一旦执行break，跳出循环
			break;
		}
		System.out.println("正数的个数为"+positiveNumb);
		System.out.println("负数的个数为"+negotiveNumb);
		}

		}
}

	

