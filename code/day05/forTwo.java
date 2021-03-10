//1.打印1-100之间所有奇数的和
/*
class Practice041for{
	public static void main(String[] args){ 
		
		for(int i=1;i<=100;i +=2){
			System.out.println(i);
	}
}
}
*/

//2.打印1-100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
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


//3.输入所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于与其本身
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