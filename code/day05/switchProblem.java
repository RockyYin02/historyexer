/*
1.使用switch把小写类型的char型转为大写。只转换a，b，c，d，e.其他的输出"other".*/
/*import java.util.Scanner;
class switchProblem
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
			System.out.println("请输入字母");
		String word=scan.next();
		char wordchar=word.charAt(0);
			System.out.println(wordchar);
		
	switch(wordchar){
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");
	}
}
}*/

/*2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。*/
/*
import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("请输入你的成绩");
			int score=scan.nextInt();
				System.out.println(score);*/


		/*switch(score){
			case 0:
			case 1:
		    //...
			case 60:
				System.out.println("不及格");
					break;
			case 61:
			//...
			case 100:
				System.out.println("及格");
					break;
		}
		*/

		/*switch(score/10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");
					break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("及格");
					break;
		}
	}
}

*/


//编写程序：从键盘上输入2019年的“mouth”和“day”，要求通过程序输出输入的日期为2019年的第几天。



//方式一：
/*
import java.util.Scanner;
class switchProblem{
	public static void main(String [] argd)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("请输入月份");
		int mouth=scan.nextInt();
		System.out.println("请输入日");
		int day=scan.nextInt();
		
		//定义一个变量来保存天数
		int sumday=0;
		if(mouth==1){
			sumday=day;
		}else if(mouth==2){
			sumday=31+day;
		}else if(mouth==3){
			sumday=31+28+day;
		}else if(mouth==4){
			sumday=31+28+31+day;
		}else if(mouth==5){
			sumday=31+28+31+30+day;
			}
		//....
		System.out.println("今天是第"+mouth+"月第"+day+"日的第"+sumday+"天");
		}
	}

	*/




//方式二：
/*

import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入月份");
		int month=scan.nextInt();
		System.out.println("请输入日");
		int day=scan.nextInt();
		
		int sumday=0;
		
		/*
		//冗余
		switch(month){
			case 1:
				sumday=day;
				break;
			case 2:
				sumday=31+day;
				break;
			case 3:
				sumday=31+28+day;
				break;
			case 4:
				sumday=31+28+31+day;
				break;
			case 5:
				sumday=31+28+31+30+day;
				break;
			//...
			*/

		/*
		switch(month){
			case 12:
				sumday +=31;
			case 11:
				sumday +=30;
			case 10:
				sumday +=31;
			case 9:
				sumday +=30;
			case 8:
				sumday +=31;
			case 7:
				sumday +=31;
			case 6:
				sumday +=30;
			case 5:
				sumday +=31;
			case 4:
				sumday +=30;
			case 3:
				sumday +=30;
			case 2:
				sumday +=28;
			case 1:
				sumday +=31;
		}

		System.out.println("2019年"+month+"月"+day+"日的第"+sumday+"天");
	
	}

}

*/

/*从键盘分别输入年、月、日，判断这一天是当年的第几天
	注：判断一年是否是闰年的标准：
		1）可以被4整除，但不可被100整除
			或
		2）可以被400整除
*/

import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入年份");
		int year=scan.nextInt();
		System.out.println("请输入月份");
		int month=scan.nextInt();
		System.out.println("请输入日");
		int day=scan.nextInt();
		
		int sumday=0;
		
		switch(month){
			case 12:
				sumday +=31;
			case 11:
				sumday +=30;
			case 10:
				sumday +=31;
			case 9:
				sumday +=30;
			case 8:
				sumday +=31;
			case 7:
				sumday +=31;
			case 6:
				sumday +=30;
			case 5:
				sumday +=31;
			case 4:
				sumday +=30;
			case 3:
				if((year%4==0&&year%100!=0)||year%400==0){
				sumday +=29;
			}else{
				sumday +=28;
			}
			case 2:
				sumday +=31;
			case 1:
				sumday +=day;
		}

		System.out.println("第"+year+"年"+month+"月"+day+"日的第"+sumday+"天");
	
	}

}




/*说明：
1.凡是可以使用switch-case的结构，都可以转换为if-else。反之，不成立。
2.我们写分支结构时，当发现既可以使用switch-case（同时switch中表达式的取值情况不太多），
  又可以使用if-else时，我们优先选择使用switch-case。  原因：switch-case执行效率较高。
*/