/*
��д�����ɼ����������������ֱ�������num1��num2��num3��
�����ǽ�������ʹ��if-else if-else��,���Ҵ�С���������

˵����
1.if-else�ṹ�ǿ��Ի���Ƕ�׵ġ�
2.���if-else�ṹ�е�ִ�����ֻ��һ��ʱ����Ӧ��һ��{}���Ժ��Եġ����ǣ���������ʡ�ԡ�

*/
import java.util.Scanner;
class ScannerIfIf
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�������һ��������");
		int num1=scan.nextInt();
		System.out.println("������ڶ���������");
		int num2=scan.nextInt();
		System.out.println("�����������������");
		int num3=scan.nextInt();

		if(num2>num1){
			if(num3>num2){
				System.out.println(num1+","+num2+","+num3);
			}else if(num3<num1){
				System.out.println(num3+","+num1+","+num2);
			}else{
				System.out.println(num2+","+num1+","+num3);
			}
		

		}else{
			if(num3>num1){
				System.out.println(num1+","+num3+","+num2);
			}else if(num2>num3){
				System.out.println(num3+","+num2+","+num1);
			}else{
				System.out.println(num2+","+num3+","+num1);
			}
		}
	}

	}

