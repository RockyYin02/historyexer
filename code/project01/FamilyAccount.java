class FamilyAccount{
	public static void main(String[] args) {
		boolean isFlag=true;
		while(isFlag){
		System.out.println("--------------家庭收支记账软件------------");
		System.out.println("1.收支记录");
		System.out.println("2.登记收入：");
		System.out.println("3.登记输出：");
		System.out.println("4.退出");
		System.out.println("          请选择（1-4）：");
		char selection=Utility.readMenuSelection();
		switch(selection){
			case'1':
				System.out.println("1.收支记录");
				break;
			case'2':
				System.out.println("2.登记收入");
				break;
			case'3':
				System.out.println("3.等级支出");
				break;
			case'4':
				System.out.println("4.退出");
				break;
		}
		}


	}
}
