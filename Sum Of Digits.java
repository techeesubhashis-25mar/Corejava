import java.util.Scanner;
class Sumofdigits
{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out .println("ENTER INPUT =");
		int n=sc.nextInt();
		while(n>0){
		System.out.println(n%10);
		n/10;}}
}