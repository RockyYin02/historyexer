/*
break��continue�ؼ��ֵ�ʹ��
			���÷�Χ			ѭ����ʹ�õ����ã���ͬ�㣩			��ͬ��
break:		switch-case			
			ѭ���ṹ��			������ǰѭ��						�ؼ��ֺ��治������ִ�����

continue:	ѭ���ṹ��			��������ѭ��						�ؼ��ֺ��治������ִ�����

*/
class BreakContinue {
	public static void main(String[] args) {
			for(int i=1;i<=10;i++){
				if(i%4==0){
					break;//123
					//continue;//123567910

				}
				System.out.println(i);
			}


			label:for(int i=1;i<=4;i++){
				for(int j=1;j<=10;j++){
					if(j%4==0){
						//break;//Ĭ�����������ιؼ��������һ��ѭ����
						//continue;

						//break label;//�����ƶ���ʶ��һ��ѭ���ṹ
						continue label;//�����ƶ���ʶ��һ��ѭ���ṹ
						}
						System.out.println(j);
				}
				System.out.println();
	}
}
