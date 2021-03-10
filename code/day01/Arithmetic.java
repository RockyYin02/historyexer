class Arithmetic 
{
	public static void main(String[] args) 
	{
	
		//除法应用
		
		int num1=15;
		int num2=4;
		int result1=num1/num2;
		System.out.println(result1);
		double num3=15;
		double num4=6;
		double result2=(double)num3/num4*num2;
		System.out.println(result2);
        //前++,后++

		int a1=4;
		int a2=a1++;
		int a3=++a1;
		int a4=a1--;
		int a5=--a1;
		System.out.println("a1="+a1+"a2="+a2);
		System.out.println("a1="+a1+"a3="+a3);
		System.out.println("a1="+a1+"a4="+a4);
		System.out.println("a1="+a1+"a5="+a5);

		int e1=3;
		++e1;
		int f1=e1;
		
		int g2=3;
		int h2=++g2;

		int c1=5;
		c1++;
		int d1=c1;

		int c2=5;
		int d2=c2++;


		System.out.println("e1="+e1+"f1="+f1);
		System.out.println("g2="+g2+"h2="+h2);
		System.out.println("c1="+c1+"d1="+d1);
		System.out.println("c2="+c2+"d2="+d2);

		//取余运算
		int dog1=10;
		int dog2=3;
		System.out.println("dog1%dog2="+dog1%dog2);

		//注意点：
		short s1=10;
		//s1=s1+1;//编译失败
		//s1(short)(s1+1);//正确的
		s1++;//自增1不会改变本身变量的数据类型
		System.out.println(s1);

		//问题:
		byte bb1=127;
		bb1++;
		System.out.println("bb1="+bb1);
		//(前)-:先自减1，后运算
		//(后)-:先运算，后自减1


		int num=187;
		int bai=num/100;
		int shi=num%100/10;//int shi=num/10%10;
		int ge=num%10;
		System.out.println("百位为"+bai);
		System.out.println("十位为"+shi);
		System.out.println("个位为"+ge);

		
	}
}
