/*
��Ŀ����������������m��n���������Լ������С��������
���磺12��20�����Լ����4����С��������60��

˵����break�ؼ��ֵ�ʹ��
*/
import java.util.Scanner;
class forOne{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("�������һ����������");
		int num1=scan.nextInt();
		System.out.println(num1);

		System.out.println("������ڶ�����������");
		int num2=scan.nextInt();
		System.out.println(num2);

		//��ȡ�������е���Сֵ
		int min=(num1<=num2)?num1:num2;
		//2.����
		for(int i=min;i>=1;i--){
			if(num1%i==0&&num2%i==0){
				System.out.println(i);
				break;//һ����ѭ����ִ�е�break��������ѭ��
				}
		}



		//��ȡ��С������
		//1.��ȡ�������еĽϴ�ֵ
		int max=(num1>=num2)?num1:num2;
		//2.����
		for(int i=max;i<=num1*num2;i++){
			if(i%num1==0&&i%num2==0){
				System.out.println(i);
				break;
			}
		}

	}
}
