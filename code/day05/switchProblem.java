/*
1.ʹ��switch��Сд���͵�char��תΪ��д��ֻת��a��b��c��d��e.���������"other".*/
/*import java.util.Scanner;
class switchProblem
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
			System.out.println("��������ĸ");
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

/*2.��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�*/
/*
import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("��������ĳɼ�");
			int score=scan.nextInt();
				System.out.println(score);*/


		/*switch(score){
			case 0:
			case 1:
		    //...
			case 60:
				System.out.println("������");
					break;
			case 61:
			//...
			case 100:
				System.out.println("����");
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
				System.out.println("������");
					break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("����");
					break;
		}
	}
}

*/


//��д���򣺴Ӽ���������2019��ġ�mouth���͡�day����Ҫ��ͨ������������������Ϊ2019��ĵڼ��졣



//��ʽһ��
/*
import java.util.Scanner;
class switchProblem{
	public static void main(String [] argd)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("�������·�");
		int mouth=scan.nextInt();
		System.out.println("��������");
		int day=scan.nextInt();
		
		//����һ����������������
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
		System.out.println("�����ǵ�"+mouth+"�µ�"+day+"�յĵ�"+sumday+"��");
		}
	}

	*/




//��ʽ����
/*

import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�������·�");
		int month=scan.nextInt();
		System.out.println("��������");
		int day=scan.nextInt();
		
		int sumday=0;
		
		/*
		//����
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

		System.out.println("2019��"+month+"��"+day+"�յĵ�"+sumday+"��");
	
	}

}

*/

/*�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
	ע���ж�һ���Ƿ�������ı�׼��
		1�����Ա�4�����������ɱ�100����
			��
		2�����Ա�400����
*/

import java.util.Scanner;
class switchProblem{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���������");
		int year=scan.nextInt();
		System.out.println("�������·�");
		int month=scan.nextInt();
		System.out.println("��������");
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

		System.out.println("��"+year+"��"+month+"��"+day+"�յĵ�"+sumday+"��");
	
	}

}




/*˵����
1.���ǿ���ʹ��switch-case�Ľṹ��������ת��Ϊif-else����֮����������
2.����д��֧�ṹʱ�������ּȿ���ʹ��switch-case��ͬʱswitch�б��ʽ��ȡֵ�����̫�ࣩ��
  �ֿ���ʹ��if-elseʱ����������ѡ��ʹ��switch-case��  ԭ��switch-caseִ��Ч�ʽϸߡ�
*/