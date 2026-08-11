import java.util.Scanner;
class Strongnumber
{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out .println("ENTER INPUT =");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0){
			int d=n%10;
			int fact=1;
			
			for(int i=1;i<=d;i++){
			

			fact=fact*i;
			}
		sum+=fact;
		n/=10;
		}
	if (temp==sum){
		System.out.println("strong number");
	}
	else{
		System.out.println("not strong");
	
	}
	}
}
