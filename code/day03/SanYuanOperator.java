/*
�����֮������Ԫ�����
1.�ṹ�����������ʽ�������ʽ1�����ʽ2
2.˵��
���������ʽ�Ľ��Ϊboolean����
�ڸ����������ʽ���٣�����ִ�б��ʽ1�����Ǳ��ʽ2.
 ����������ʽΪtrue����ִ�б��ʽ1.
 ������ʽΪfalse����ִ�б��ʽ2.
 �۱��ʽ1�ͱ��ʽ2Ҫ����һ�µ�.
 ����Ԫ���������Ƕ��ʹ��.
 */

class SanYuanOperator 
{
	public static void main(String[] args) 
	{
		//��ȡ�����������ֵ
		int m=12;
		int n=5;
		int max=(m>n)?m:n;
		System.out.println(max);

		double num=(m>n)?2:1.0;
		//(m>n)?2:"n��"'//�������

		//***********
		n=13;
		String maxStr=(m>n)?"m��":((m==n)?"m��n���":"n��");
		System.out.println(maxStr);

		//*********
		//��ȡ�����������ֵ
		int n1=12;
		int n2=30;
		int n3=-43;

		int max1=(n1>n2)?n1:n2;
		int max2=(max1>n3)?max1:n3;
		System.out.println("�������е����ֵΪ:"+max2);

		int max3=(max1>n3)?max1:n3;
		//int max3=(((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3;
		System.out.println("�������е����ֵΪ:"+max3);
	}
}
