/*
1.��д��������2��int�ͱ�������ֵ���ж�����֮�ͣ�������ڵ���50������ӡ�ɹ��������򡰴�ӡʧ�ܡ���
import java.util.Scanner;
class  Practice
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("�������һ��������");
		int num1=scan.nextInt();
		System.out.println("������ڶ���������");
		int num2=scan.nextInt();

			if(num1+num2>=50){
				System.out.println("��ӡ�ɹ�");}
			else{
				System.out.println("��ӡʧ��");
	}
	}
}

*/


/*2.��д��������2��double�ͱ�������ֵ���жϵ�һ��������10.0���ҵ�2����С��20.0����ӡ����֮�͡����򣬴�ӡ�����ĳ˻���
import java.util.Scanner;
class  Practice
{
	public static void main(String[] args) 
	{
		double num3=13.0;
        double num4=21.0;
		if(num3>10.0&&num4<20.0){
			double num5=num3+num4;
			
			System.out.println("����֮��Ϊ:"+num5);
		}else{
			double num6=num3*num4;
			System.out.println("����֮��Ϊ:"+"num6");
		}
	}
}
*/
/*3.�ҼҵĹ�5���ˣ�5��Ĺ��൱���������أ���ʵ������ǰ����ÿһ���൱�������10.5�֮꣬��ÿ����һ����������ꡣ��ô5��Ĺ��൱�������������أ�
Ӧ���ǣ�10.5+10.5+4+4+4=35�ꡣ
��дһ�����򣬻�ȡ�û�����Ĺ������䣬ͨ��������ʾ���൱����������䡣����û����븺��������ʾһ����ʾ��Ϣ��

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�����빷�����䣺");
		int age=scan.nextInt();
		
		if(age>0&&age<=2){
			System.out.println("�����������ǣ�"+age*10.5);
		}else if(age>2){
			System.out.println("�����������ǣ�"+(2*10.5+(age-2)*4));
		}else{
			System.out.println("������û����");
		}
	}
}
*/



//��λ�ȡһ�������:10-99;     Math.random����Ϊ[0.0-1.0)
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
//��ʽ��[a,b]:(int)(Math.random()*(b-a+1)+a)

/*4.�������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ����ʾ�û�����һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
1������û��������ƥ���Ʊ��ʵ��˳�򣬽���10000��Ԫ��
2������û��������������ƥ���Ʊ���������֣���˳��һ�£�����3000��Ԫ��
3������û������һ�����ֽ�����˳�������ƥ���Ʊ������1000��Ԫ��
4������û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
5������û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{	Scanner scan=new Scanner(System.in);
			System.out.println("������һ����λ��");
		int num1=scan.nextInt();
		int rdNum=(int)(Math.random()*90+10);
			System.out.println(rdNum);

		if(rdNum==num1){
			System.out.println("����10000��Ԫ");
		}else{
			System.out.println("û�н���");
		}
	}

}
*/
/*
5.��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���һ������������180cm���ϣ�����һǧ�����ϣ�˧���ǡ�
1���������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!��
2������������������������򣺡��ްɣ����ϲ���������ࡣ��
3��������������������㣬�򣺡����ޣ���
*/

import java.util.Scanner;
class Practice
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
/*��ʽһ��
			System.out.println("��������Ƿ�180cm����(��/��)");
		String high=scan.next();
		char highChar=high.charAt(0);
			System.out.println(highChar);

			System.out.println("�����Ƿ���һǧ������(��/��)");
		String money=scan.next();
		char moneyChar=money.charAt(0);
			System.out.println(moneyChar);

			System.out.println("��������Ϊ���Լ�˧��(��/��)");
		String face=scan.next();
		
			
		if(high.equals("��")&&money.equals("��")&&face.equals("��")){
			System.out.println("��һ��Ҫ�޸�����");
		}else if(high.equals("��")||money.equals("��")||face.equals("��")){
			System.out.println("�ްɣ����ϲ����������");
		}else if(high.equals("��")&&money.equals("��")&&face.equals("��")){
			System.out.println("����!");
		}

*/


//��ʽ��:
			System.out.println("�������ǣ�");
		int high=scan.nextInt();
			System.out.println("���ж��ټҲ�����ǧ��");
		int wealth=scan.nextInt();
			System.out.println("��˧�𣿣�true/false)");
		boolean face=scan.nextBoolean();
		
			
		if(high>180&&wealth>1&&face==true){
			System.out.println("��һ��Ҫ�޸�����");
		}else if(high>180||wealth>1||face==true){
			System.out.println("�ްɣ����ϲ����������");
		}else if(high<180&&wealth<1&&face!=true){
			System.out.println("����");
		}
			
	}
}


	










