/*
��δӼ��̻�ȡ��ͬ���͵ı���:��Ҫʹ��Scanner

����ʵ�ֲ��裺
1.������import java.util.Scanner;
2.Scanner��ʵ������Scanner scan=new Scanner(Ststem.in);
3.����Scanner�����ط�����next()/nextXxx()��������ȡָ�����͵ı���


ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫ������Ͳ�ƥ�䣬�ᱨ�쳣��InputMisMatchExce���³�����ֹ��

*/

import java.util.Scanner;

class ScannerTest 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("�������������:");
		String name=scan.next();
		System.out.println(name);

		System.out.println("�������������:");
		int age=scan.nextInt();
		System.out.println(age);

		System.out.println("�������������:");
		double weight=scan.nextDouble();
		System.out.println(weight);

		System.out.println("���Ƿ����������أ�(true/false)");
		boolean isLove=scan.nextBoolean();
		System.out.println(isLove);

		//����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ�ܻ�ȡһ���ַ���
		System.out.println("����������Ա�:����/Ů)");
		String gender=scan.next();//"��"
		char genderChar=gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�(��)
		System.out.println(genderChar);


	}
}
