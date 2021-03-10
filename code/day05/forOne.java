/*
题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。

说明：break关键字的使用
*/
import java.util.Scanner;
class forOne{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("请输入第一个正整数：");
		int num1=scan.nextInt();
		System.out.println(num1);

		System.out.println("请输入第二个正整数：");
		int num2=scan.nextInt();
		System.out.println(num2);

		//获取两个数中的最小值
		int min=(num1<=num2)?num1:num2;
		//2.遍历
		for(int i=min;i>=1;i--){
			if(num1%i==0&&num2%i==0){
				System.out.println(i);
				break;//一旦在循环中执行到break，就跳出循环
				}
		}



		//获取最小公倍数
		//1.获取两个数中的较大值
		int max=(num1>=num2)?num1:num2;
		//2.遍历
		for(int i=max;i<=num1*num2;i++){
			if(i%num1==0&&i%num2==0){
				System.out.println(i);
				break;
			}
		}

	}
}
