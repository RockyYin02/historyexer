/*1.��ʽ
switch(���ʽ){
case ����1:
	ִ�����1;
		//break;

case ����2:
	ִ�����2��
		//break;
...

default:
	ִ�����n;
		//break;
}


2.˵��:

�ٸ���switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧ��case�ṹ�У�������ִ����䡣
 ��������ִ������Ժ�����Ȼ��������ִ������case�ṹ�е�ִ����䣬ֱ������break�ؼ��ֻ��switch-case�ṹĩβ����Ϊֹ��

��break������ʹ����switch-case�ṹ�У���ʾһ��ִ�е��˹ؼ��֣�������switch-case�ṹ

��switch�ṹ�еı��ʽ��ֻ�������µ�6����������֮һ:
byte��short��char��int��ö�����ͣ�JDK5.0����)��String���ͣ�JDK7.0������

��case֮��ֻ����������������������Χ��

��break�ؼ����ǿ�ѡ�ġ�

��default���൱��if-else�ṹ�е�else��
 default�ṹ�ǿ�ѡ�ģ�����λ�������ġ�
*/
/*
class Switchone

{
	public static void main(String[] args) 
	{
		int number=1;
		switch(number){
		
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
}

*/
//********Boolean���ͱ���
class Switchone

{
	public static void main(String[] args) 
	{
		boolean   cool=true;
		switch(cool){
			case true:
				System.out.println("�Һ�˧");
				break;
			case false:
				System.out.println("�Һó�");
				break;
			default:
				System.out.println("�������");
		}
	}
}
		