class FamilyAccount{
	public static void main(String[] args) {
		boolean isFlag=true;
		while(isFlag){
		System.out.println("--------------��ͥ��֧��������------------");
		System.out.println("1.��֧��¼");
		System.out.println("2.�Ǽ����룺");
		System.out.println("3.�Ǽ������");
		System.out.println("4.�˳�");
		System.out.println("          ��ѡ��1-4����");
		char selection=Utility.readMenuSelection();
		switch(selection){
			case'1':
				System.out.println("1.��֧��¼");
				break;
			case'2':
				System.out.println("2.�Ǽ�����");
				break;
			case'3':
				System.out.println("3.�ȼ�֧��");
				break;
			case'4':
				System.out.println("4.�˳�");
				break;
		}
		}


	}
}