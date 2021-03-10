/*
1.编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等于50，“打印成功”，否则“打印失败”。
import java.util.Scanner;
class  Practice
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1=scan.nextInt();
		System.out.println("请输入第二个整数：");
		int num2=scan.nextInt();

			if(num1+num2>=50){
				System.out.println("打印成功");}
			else{
				System.out.println("打印失败");
	}
	}
}

*/


/*2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
import java.util.Scanner;
class  Practice
{
	public static void main(String[] args) 
	{
		double num3=13.0;
        double num4=21.0;
		if(num3>10.0&&num4<20.0){
			double num5=num3+num4;
			
			System.out.println("两数之和为:"+num5);
		}else{
			double num6=num3*num4;
			System.out.println("两数之积为:"+"num6");
		}
	}
}
*/
/*3.我家的狗5岁了，5岁的狗相当与人类多大呢？其实，狗的前两年每一年相当与人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗相当于人类多少年纪呢？
应该是：10.5+10.5+4+4+4=35岁。
编写一个程序，获取用户输入的狗的年龄，通过程序显示器相当于人类的年龄。如果用户输入负数，请显示一个提示信息。

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入狗的年龄：");
		int age=scan.nextInt();
		
		if(age>0&&age<=2){
			System.out.println("狗狗的年龄是："+age*10.5);
		}else if(age>2){
			System.out.println("狗狗的年龄是："+(2*10.5+(age-2)*4));
		}else{
			System.out.println("狗狗还没出生");
		}
	}
}
*/



//如何获取一个随机数:10-99;     Math.random区间为[0.0-1.0)
/*import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{
			int rdNum=(int)(Math.random()*90+10);//[0.0,1.0)-->[0.0,90.0)-->[10.0,100.0)-->[10,99]
		{System.out.println(rdNum);}
	}
}
*/
//公式：[a,b]:(int)(Math.random()*(b-a+1)+a)

/*4.假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
1）如果用户输入的数匹配彩票的实际顺序，奖金10000美元。
2）如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金3000美元。
3）如果用户输入的一个数字仅满足顺序情况下匹配彩票，奖金1000美元。
4）如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5）如果用户输入的数字没有匹配任何一个数字，则彩票作废。

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{	Scanner scan=new Scanner(System.in);
			System.out.println("请输入一个两位数");
		int num1=scan.nextInt();
		int rdNum=(int)(Math.random()*90+10);
			System.out.println(rdNum);

		if(rdNum==num1){
			System.out.println("奖励10000美元");
		}else{
			System.out.println("没有奖励");
		}
	}

}
*/
/*
5.大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高180cm以上；富：一千万以上；帅：是。
1）如果这三个条件同时满足，则：“我一定要嫁给他!”
2）如果三个条件有真的情况，则：“嫁吧，比上不足比下有余。”
3）如果三个条件都不满足，则：“不嫁！”
*/

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
/*方式一：
			System.out.println("请问身高是否180cm以上(是/否)");
		String high=scan.next();
		char highChar=high.charAt(0);
			System.out.println(highChar);

			System.out.println("请问是否有一千万以上(是/否)");
		String money=scan.next();
		char moneyChar=money.charAt(0);
			System.out.println(moneyChar);

			System.out.println("请问你认为你自己帅吗？(是/否)");
		String face=scan.next();
		
			
		if(high.equals("是")&&money.equals("是")&&face.equals("是")){
			System.out.println("我一定要嫁给他！");
		}else if(high.equals("是")||money.equals("是")||face.equals("是")){
			System.out.println("嫁吧，比上不足比下有余");
		}else if(high.equals("否")&&money.equals("否")&&face.equals("否")){
			System.out.println("不嫁!");
		}

*/


//方式二:
			System.out.println("你的身高是：");
		int high=scan.nextInt();
			System.out.println("你有多少家产：（千万）");
		int wealth=scan.nextInt();
			System.out.println("你帅吗？（true/false)");
		boolean face=scan.nextBoolean();
		
			
		if(high>180&&wealth>1&&face==true){
			System.out.println("我一定要嫁给他！");
		}else if(high>180||wealth>1||face==true){
			System.out.println("嫁吧，比上不足比下有余");
		}else if(high<180&&wealth<1&&face!=true){
			System.out.println("不嫁");
		}
			
	}
}


	










