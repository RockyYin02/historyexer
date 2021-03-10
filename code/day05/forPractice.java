
/*
For 循环结构的使用
一、循环结构的4个要素
	①初始化条件
	②循环条件
	③循环体
	④迭代条件

	
二、for循环的结构

for(①；②;④){
	③
}


执行过程：①-②-③-④-②-③-④-...-②
*/



/*
class forPractice{
	public static void main(String[] args) 
	{
		int i=1;
		for(i=1;i<5;i++){
		System.out.println("Hello World!");
	}





//练习
		int num1=1;
		for(System.out.print('a');num1<=4;System.out.print('c'),num1++){
			System.out.print('b');
		}


//练习  例题：遍历100以内的偶数，输出所有偶数的和，输出偶数的个数
		int sum=0; //记录所有偶数的和
		int count=0; //记录偶数的个数
		for(int c=1;c<100;c++){
			if(c%2==0){
				System.out.println(c);
				sum +=c;
				count++;
			}
			//System.out.println("总和为"+sum);  会造成循环
		}
			System.out.println("总和为"+sum);
			System.out.println("偶数的个数为"+count);
	}
}
*/

/*
编写程序从1循环到150，并在每行打印一个值，
另外在每个3的倍数行上打印出“dog”，
在每个5的倍数行上打印出“cat”，
在每个7的倍数行上打印出“fox”。
*/


class forPractice{
		public static void main(String [] args)
			{
				for(int i=1;i<=150;i++){
					System.out.println(i);
				if(i%3==0){
					System.out.print("dog");
					}
				if(i%5==0){
					System.out.print("cat");
				}
				if(i%7==0){
					System.out.print("fox");
				}
				}
			}

}