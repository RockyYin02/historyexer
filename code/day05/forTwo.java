//1.��ӡ1-100֮�����������ĺ�
/*
class Practice041for{
	public static void main(String[] args){ 
		
		for(int i=1;i<=100;i +=2){
			System.out.println(i);
	}
}
}
*/

//2.��ӡ1-100֮��������7�ı����������ĸ������ܺͣ�������ü�������˼�룩
/*
class Practice041for{
	public static void main(String [] args){
		
		int sum=0;
		int max=0;
		for(int i=1;i<=100;i++){
			sum=i*7;
			if(sum<=100){
				System.out.println(sum);}
		}
	}
}
*/


//3.�������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵������䱾��
class Practice041for{
	public static void main(String [] args){
		
		for(int i=100;i<=1000;i++){
			int bai=i/100;
			int shi=i/10%10;
			int ge=i%10;
		if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
			System.out.println(i);
		}
		}
}
}