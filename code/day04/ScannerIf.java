/*
��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ100�֣�����һ��BMW��
�ɼ�Ϊ��80��99]ʱ������һ̨iPhone��
�ɼ�Ϊ[60��80]ʱ������һ��iPad;
����ʱ��ʲô������û�С�
��Ӽ���������С������ĩ�ɼ����������ж�

˵����
1.else �ṹ�ǿ�ѡ�ģ�
2.������������ʽ��
		>���������ʽ֮���ǡ����⡱��ϵ����û�н����Ĺ�ϵ�����ĸ��жϺ�ִ��������������滹�������棬����ν��
		>���������ʽ֮�����н����Ĺ�ϵ����Ҫ����ʵ��������������Ӧ�ý��ĸ��ṹ���������档
		>���������ʽ֮�����а����Ĺ�ϵ��ͨ������£���Ҫ����ΧС�������ڷ�Χ������档���򣬷�ΧС�ľ�û�л���ִ���ˡ�
*/

import java.util.Scanner;
class ScannerIf 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("��������ĳɼ�:��0-100��");
		int score=scan.nextInt();
		
		
		if(score==100){
			System.out.println("����һ��BMW");
		}else if(score>80&&score<=99){
			System.out.println("����һ̨iPhone");
		}else if(score>=60&&score<=80){
			System.out.println("����һ̨iPad");
		}else{
			System.out.println("ʲô������û��");
	}
}
}
