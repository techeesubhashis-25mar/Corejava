import java.util.Scanner;
class Sumofdigits
{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out .println("ENTER INPUT =");
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
		System.out.println(n%10);
		n= n/10;
		}
		System.out.println("sum=" + sum);
		}
}