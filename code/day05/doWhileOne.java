/*

一.循环结构的4个要素
①初始化条件
②循环条件-->是boolean类型
③循环体
④迭代条件
二.do-while循环结构：

①
do{
	②;
	③;

}while(②);


执行过程：①-③-④-②-③-④-③-④-...-②

说明：
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些。较少使用do-while。

*/
class doWhileOne {
	public static void main(String[] args) {
		//遍历100以内的偶数，并计算所有偶数的和及偶数的个数
		int i=0;
		int sum=0;
		int count=0;
		
		do{
			if(i%2==0){
				System.out.println(i);
				sum +=i;
				count++;
			}
			i++;
			
		
	}
		while(i<=100);
		System.out.println("所有偶数的和为"+sum);
		System.out.println("偶数的个数为"+count);

		//************************************
		//不会执行
		int num1=10;
		while(num1>10){
			System.out.println("hello,while");
			num1--;
		}

		//do-while循环至少会执行一次循环体！
		int num2=10;
		do{
			System.out.println("hello,dowhile");
			num2--;
		}while(num2>10);
	
}
		
}
