/*
��Ŀ��
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

˵����
1.����ѭ�������������ƴ����Ľṹ��for(;;)��while(true)
2.����ѭ���м��ַ�ʽ?
		��ʽһ��ѭ���������ַ���false
		��ʽ������ѭ�����У�ִ��break
		
*/
/*
��Ŀ��
�Ӽ������������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������
*/

import java.util.Scanner;
class forOrwhileOne {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		int positiveNumb=0;
		int negotiveNumb=0;

		for(;;){//while(true){
			int num=scan.nextInt();
			
		//�ж�number������
		if(num>0){
			positiveNumb++;
		}else if(num<0){
			negotiveNumb++;
		}else{
			//һ��ִ��break������ѭ��
			break;
		}
		System.out.println("�����ĸ���Ϊ"+positiveNumb);
		System.out.println("�����ĸ���Ϊ"+negotiveNumb);
		}

		}
}

	

