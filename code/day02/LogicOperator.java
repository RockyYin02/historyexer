//˵��:�߼�����������Ķ���boolean���͵ı���
class LogicOperator 
{
	public static void main(String[] args) 
	{
		//����&��&&
		//��ͬ��1:&��&&����������ͬ
		//��ͬ��2:�����������trueʱ�����߶���ִ�з����ұߵ�����
		//��ͬ��:�����������falseʱ��&����ִ�з����ұߵ����㡣&&����ִ�з����ұߵ����㡣
		//�������Ƽ�ʹ��&&


		boolean b1=true;
		//b1=false;
		int num1=10;
		if(b1&(num1++>0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
	}
			System.out.println("num1="+num1);
	
	

	{
	

		boolean b2=true;
		//b2=false;
		int num2=10;
		if(b2&(num2++>0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
	}
			System.out.println("num2="+num2);
	
	
	}
	
	//����:|��||
	//��ͬ��1:|��||����������ͬ
	//��ͬ��2:�����������falseʱ�����߶���ִ�з����ұߵ�����
	//��ͬ��3:�����������trueʱ��|����ִ�з����ұߵ����㣬��||����ִ�з����ұߵ�����
	//�������Ƽ�ʹ��||
	
	{
		boolean b3=false;
		//b3=true;
		int num3=10;
		if(b3|(num3++>0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
	}
			System.out.println("num3="+num3);
	
	}

	{
	

		boolean b4=false;
		//b4=true;
		int num4=10;
		if(b4||(num4++>0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
	}
			System.out.println("num4="+num4);
	
	
	}
		
}
}