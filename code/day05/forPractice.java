
/*
For ѭ���ṹ��ʹ��
һ��ѭ���ṹ��4��Ҫ��
	�ٳ�ʼ������
	��ѭ������
	��ѭ����
	�ܵ�������

	
����forѭ���Ľṹ

for(�٣���;��){
	��
}


ִ�й��̣���-��-��-��-��-��-��-...-��
*/



/*
class forPractice{
	public static void main(String[] args) 
	{
		int i=1;
		for(i=1;i<5;i++){
		System.out.println("Hello World!");
	}





//��ϰ
		int num1=1;
		for(System.out.print('a');num1<=4;System.out.print('c'),num1++){
			System.out.print('b');
		}


//��ϰ  ���⣺����100���ڵ�ż�����������ż���ĺͣ����ż���ĸ���
		int sum=0; //��¼����ż���ĺ�
		int count=0; //��¼ż���ĸ���
		for(int c=1;c<100;c++){
			if(c%2==0){
				System.out.println(c);
				sum +=c;
				count++;
			}
			//System.out.println("�ܺ�Ϊ"+sum);  �����ѭ��
		}
			System.out.println("�ܺ�Ϊ"+sum);
			System.out.println("ż���ĸ���Ϊ"+count);
	}
}
*/

/*
��д�����1ѭ����150������ÿ�д�ӡһ��ֵ��
������ÿ��3�ı������ϴ�ӡ����dog����
��ÿ��5�ı������ϴ�ӡ����cat����
��ÿ��7�ı������ϴ�ӡ����fox����
*/


class forPractice{
		public static void main(String [] args)
			{
				for(int i=1;i<=150;i++){
					System.out.println(i);
				if(i%3==0){
					System.out.print("dog");
					}
				if(i%5==0){
					System.out.print("cat");
				}
				if(i%7==0){
					System.out.print("fox");
				}
				}
			}

}