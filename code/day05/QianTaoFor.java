/*Ƕ��ѭ����ʹ��
1.Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ�����У��͹�����Ƕ��ѭ����


2.���ѭ����ѭ���ṹB
  �ڲ�ѭ����ѭ���ṹA

3.˵��
���ڲ�ѭ���ṹ����һ�飬ֻ�൱�����ѭ��ѭ����ִ����һ��
�ڼ������ѭ����Ҫִ��m�Σ��ڲ�ѭ����Ҫִ��n�Ρ���ʱ�ڲ�ѭ����ѭ����һ��ִ����m*n��

4.���ɣ�
  ���ѭ�������������ڲ�ѭ����������
*/
class QianTaoFor{
	public static void main(String[] args) {
		
		//******
		for(int i=1;i<=6;i++){
			System.out.print('*');
		}
		System.out.println("\n");





/*          i(�кţ�  j��*�ĸ�����
*			1			1
**			2			2
***			3			3
****		4			4
*****		5			5
*/		
		for(int i=1;i<=5;i++){   //��������
			for(int j=1;j<=i;j++);{  //��������
				System.out.print("*");
				}
			System.out.println();
		}

/*			i(�к�)		j(*�ĸ���)    ���ɣ�i+j=5���仰˵��j=5-i;
****		1			4
***			2			3
**			3			2
*			4			1
*/
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}



//�žų˷���
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i+"*"+j+"="+(i*j)+"  ");
				}
				System.out.println();
			}



/*
100���ڵ��������������
������������ֻ�ܱ�1����������������Ȼ����-->��2��ʼ���������-1����Ϊֹ,�����ܱ��������������

��С��������2

*/

/*		boolean isFlag=true; //��ʶi�Ƿ�j������һ���������޸���ֵ
		//��ȡ��ǰʱ�����1970-01-01 00:00:00�ĺ�����
		long start=System.currentTimeMillis();
				
					
		for(int i=2;i<=100;i++){ //����100���ڵ���Ȼ��
			//for(int j=2;j<i;j++){ //j����iȥ��
			//�Ż������Ա�����ָ������Ȼ������Ч��
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){ //i��j����
					isFlag=false;
					break;   //�Ż�һ��ֻ�Ա������Ȼ������Ȼ����Ч�ġ�
				}
			}
		
			if(isFlag==true){
				System.out.println(i);
			}
			//����isFlag
			isFlag=true;
		}

		//��ȡ��ǰʱ�����1970-01-01 00:00:00�ĺ�����
		long start=System.currentTimeMillis();

		System.out.println("�����ѵ�ʱ��Ϊ��"+(end-start));
*/


		//����ȡ100���ڵ�����
		//continue label
		int count=0;
		label:for(int i=2;i<=100;i++){

			for(int j=2;j<=Math.sqrt(i);j++){

				if(i%j==0){
					continue label;//����0ֱ����ʧ
				}
			}
			count++;
		}
		System.out.println("�����ĸ���Ϊ"+count);
	}
}
	
	

