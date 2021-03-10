/*嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环。


2.外层循环：循环结构B
  内层循环：循环结构A

3.说明
①内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
②假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m*n次

4.技巧：
  外层循环控制行数，内层循环控制列数
*/
class QianTaoFor{
	public static void main(String[] args) {
		
		//******
		for(int i=1;i<=6;i++){
			System.out.print('*');
		}
		System.out.println("\n");





/*          i(行号）  j（*的个数）
*			1			1
**			2			2
***			3			3
****		4			4
*****		5			5
*/		
		for(int i=1;i<=5;i++){   //控制行数
			for(int j=1;j<=i;j++);{  //控制列数
				System.out.print("*");
				}
			System.out.println();
		}

/*			i(行号)		j(*的个数)    规律：i+j=5换句话说：j=5-i;
****		1			4
***			2			3
**			3			2
*			4			1
*/
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}



//九九乘法表
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i+"*"+j+"="+(i*j)+"  ");
				}
				System.out.println();
			}



/*
100以内的所有质数的输出
质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止,都不能被这个数本身整除

最小的质数是2

*/

/*		boolean isFlag=true; //标识i是否被j除尽，一旦除尽，修改其值
		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start=System.currentTimeMillis();
				
					
		for(int i=2;i<=100;i++){ //遍历100以内的自然数
			//for(int j=2;j<i;j++){ //j：被i去除
			//优化二：对本身是指数的自然数是有效的
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){ //i被j除尽
					isFlag=false;
					break;   //优化一：只对本身非自然数的自然数有效的。
				}
			}
		
			if(isFlag==true){
				System.out.println(i);
			}
			//重置isFlag
			isFlag=true;
		}

		//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start=System.currentTimeMillis();

		System.out.println("所花费的时间为："+(end-start));
*/


		//最快获取100以内的质数
		//continue label
		int count=0;
		label:for(int i=2;i<=100;i++){

			for(int j=2;j<=Math.sqrt(i);j++){

				if(i%j==0){
					continue label;//等于0直接消失
				}
			}
			count++;
		}
		System.out.println("质数的个数为"+count);
	}
}
	
	

