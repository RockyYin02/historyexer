/*

һ.ѭ���ṹ��4��Ҫ��
�ٳ�ʼ������
��ѭ������-->��boolean����
��ѭ����
�ܵ�������
��.do-whileѭ���ṹ��

��
do{
	��;
	��;

}while(��);


ִ�й��̣���-��-��-��-��-��-��-��-...-��

˵����
1.do-whileѭ�����ٻ�ִ��һ��ѭ���壡
2.�����У�ʹ��for��while����һЩ������ʹ��do-while��

*/
class doWhileOne {
	public static void main(String[] args) {
		//����100���ڵ�ż��������������ż���ĺͼ�ż���ĸ���
		int i=0;
		int sum=0;
		int count=0;
		
		do{
			if(i%2==0){
				System.out.println(i);
				sum +=i;
				count++;
			}
			i++;
			
		
	}
		while(i<=100);
		System.out.println("����ż���ĺ�Ϊ"+sum);
		System.out.println("ż���ĸ���Ϊ"+count);

		//************************************
		//����ִ��
		int num1=10;
		while(num1>10){
			System.out.println("hello,while");
			num1--;
		}

		//do-whileѭ�����ٻ�ִ��һ��ѭ���壡
		int num2=10;
		do{
			System.out.println("hello,dowhile");
			num2--;
		}while(num2>10);
	
}
		
}
